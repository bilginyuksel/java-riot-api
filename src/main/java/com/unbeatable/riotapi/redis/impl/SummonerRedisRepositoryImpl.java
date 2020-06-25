package com.unbeatable.riotapi.redis.impl;

import com.unbeatable.riotapi.entities.Summoner;
import com.unbeatable.riotapi.redis.repository.SummonerRedisRepository;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

@Repository
public class SummonerRedisRepositoryImpl implements SummonerRedisRepository {
    private RedisTemplate<String, Summoner> redisTemplate;
    private ValueOperations valueOperations;
    public SummonerRedisRepositoryImpl(RedisTemplate<String, Summoner> redisTemplate) {
        this.redisTemplate = redisTemplate;
        valueOperations = redisTemplate.opsForValue();
    }

    @Override
    public Summoner findByName(String name) {
        return (Summoner)valueOperations.get(name);
    }

    @Override
    public void saveWithExpire(Summoner summoner, long timeout, TimeUnit unit) {
        valueOperations.set(summoner.getName(),summoner,timeout,unit);
    }
}
