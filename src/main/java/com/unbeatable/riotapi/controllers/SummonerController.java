package com.unbeatable.riotapi.controllers;

import com.unbeatable.riotapi.entities.Summoner;
import com.unbeatable.riotapi.repositories.SummonerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path= "/summoners")
public class SummonerController {
    @Autowired SummonerRepository summonerRepository;
    @GetMapping(value = "/by-name/{name}",produces = "application/json; charset=utf-8")
    public Summoner getSummonerByName(@PathVariable("name") String name)
    {
        Summoner summoner = summonerRepository.findSummonerByName(name);
        if(summoner!=null) { //TODO::farklı bir nesne kontrolü uygulanacak
            return summoner;
        }
        else {
        //TODO::apiya istek atılıp save edilecek
        }
    }

}
