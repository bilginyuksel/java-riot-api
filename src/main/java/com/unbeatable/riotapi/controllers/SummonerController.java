package com.unbeatable.riotapi.controllers;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.unbeatable.riotapi.client.impl.RiotSummonerRepositoryImpl;
import com.unbeatable.riotapi.client.repository.RiotSummonerRepository;
import com.unbeatable.riotapi.entities.Summoner;
import com.unbeatable.riotapi.redis.repository.SummonerRedisRepository;
import com.unbeatable.riotapi.repository.SummonerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/summoner")
public class SummonerController {
    @Autowired
    private SummonerRedisRepository summonerRedisRepository;
    @Autowired
    private SummonerRepository summonerRepository;
    private RiotSummonerRepository riotSummonerRepository = new RiotSummonerRepositoryImpl();
    private ObjectMapper objectMapper = new ObjectMapper();
    private Summoner riotSummoner = null;

    /*
        RiotAPİ calls take 1524ms
        CACHE DB calls take 18ms
        SQL DBB Calls take 45ms
     */
    @GetMapping("/{name}")
    public ResponseEntity<Summoner> getSummoner(@PathVariable("name") String name){
        Summoner cacheSummoner = summonerRedisRepository.findByName(name);
        Summoner sqlSummoner;
        //Bu kodlar için RedisRepository , SQLRepository gibi tiplerde veriler alan
        //bi controllerTool yazılabilir işlemler orada gerçekleşebilir.
        if(cacheSummoner!=null){
            return ResponseEntity.ok().header("SPEEDTESTHEADER","CACHEDATA").body(cacheSummoner);
        }
        else {
            sqlSummoner = summonerRepository.findSummonerByName(name);
            if(sqlSummoner!=null){
                return ResponseEntity.ok().header("SPEEDTESTHEADER","SQLDATA").body(sqlSummoner);
            }
            else{
                String apiSummonerBody = riotSummonerRepository.findSummonerByName(name).getBody();
                try {
                    riotSummoner = objectMapper.readValue(apiSummonerBody, Summoner.class);
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
                summonerRedisRepository.saveWithExpire(riotSummoner,1, TimeUnit.DAYS);
                summonerRepository.save(riotSummoner);
                return ResponseEntity.ok().header("SPEEDTESTHEADER","RIOTDATA").body(riotSummoner);
            }
        }
    }

}
