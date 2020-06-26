package com.unbeatable.riotapi.repository;

import com.unbeatable.riotapi.entities.Summoner;
import org.springframework.data.repository.CrudRepository;

public interface SummonerRepository extends CrudRepository<Summoner,Long> {
    Summoner findSummonerByName(String name);
}
