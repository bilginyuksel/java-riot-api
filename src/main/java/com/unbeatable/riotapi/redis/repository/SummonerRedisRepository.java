package com.unbeatable.riotapi.redis.repository;

import com.unbeatable.riotapi.entities.Summoner;

import java.util.concurrent.TimeUnit;

public interface SummonerRedisRepository {
    Summoner findByName(String name);
    void saveWithExpire(Summoner summoner, long timeout, TimeUnit unit);
}
