package com.unbeatable.riotapi.repositories;

import com.unbeatable.riotapi.entities.Summoner;
import org.springframework.data.repository.CrudRepository;

public interface SummonerRepository extends CrudRepository<Summoner,String> {
    Summoner findSummonerByName(String name);
}
