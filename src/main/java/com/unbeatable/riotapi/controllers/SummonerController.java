package com.unbeatable.riotapi.controllers;
import com.unbeatable.riotapi.entities.Summoner;
import com.unbeatable.riotapi.redis.repository.SummonerRedisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/")
public class SummonerController {
    public Summoner summoner = new Summoner("rer",4141
            ,213214,"hellodayi",4141,"sss","74");
    @Autowired
    private SummonerRedisRepository summonerRedisRepository;

    public SummonerController(SummonerRedisRepository summonerRedisRepository){
        this.summonerRedisRepository = summonerRedisRepository;
    }
    @GetMapping("/")
    public Summoner getAll(){
        summonerRedisRepository.saveWithExpire(summoner,1, TimeUnit.DAYS);
        return summonerRedisRepository.findByName(summoner.getName());
    }

}
