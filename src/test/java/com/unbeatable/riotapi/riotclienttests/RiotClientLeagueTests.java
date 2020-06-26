package com.unbeatable.riotapi.riotclienttests;

import com.unbeatable.riotapi.client.LeagueQueue;
import org.junit.Test;
import org.junit.jupiter.params.provider.EnumSource;

public class RiotClientLeagueTests {

    @Test
    @EnumSource(LeagueQueue.class)
    public void findChallengerRiotSummonersByQueueTest(){

    }

    @Test
    @EnumSource(LeagueQueue.class)
    public void findGrandmasterSummonersByQueueTest(){

    }

    @Test
    @EnumSource(LeagueQueue.class)
    public void findMasterSummonersByQueueTest(){

    }

    @Test
    public void findSummonersLeagueEntriesBySummonerIDTest(){

    }

    @Test
    public void findSummonersLeagueEntriesByLeagueIDTest(){

    }

    @Test
    // @EnumSource({LeagueQueue.class, LeagueTier.class, LeagueDivison.class})
    public void findAllLeagueEntriesByQueueAndByTierAndByDivisonTest(){

    }

}
