package com.unbeatable.riotapi.controllers;

import com.unbeatable.riotapi.entities.Summoner;
import com.unbeatable.riotapi.repositories.SummonerRepository;
import com.unbeatable.riotapi.services.RiotApiClient;
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
    public String getSummonerByName(@PathVariable("name") String name)
    {
        return name;
    }

}
