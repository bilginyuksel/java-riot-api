package com.unbeatable.riotapi.client.impl;

import com.unbeatable.riotapi.client.LeagueDivison;
import com.unbeatable.riotapi.client.LeagueQueue;
import com.unbeatable.riotapi.client.LeagueTier;
import com.unbeatable.riotapi.client.repository.RiotLeagueRepository;

import java.util.List;

public class RiotLeagueRepositoryImpl implements RiotLeagueRepository {

    private String riotRepositoryApiURL = RiotClient.BASE_URL + leagueURL;

    @Override
    public List<Object> findChallengerRiotSummonersByQueue(LeagueQueue queue) {
        riotRepositoryApiURL += "challengerleagues/by-queue/"+queue.toString();
        return null;
    }

    @Override
    public List<Object> findGrandmasterSummonersByQueue(LeagueQueue queue) {
        riotRepositoryApiURL += "grandmasterleagues/by-queue/"+queue.toString();
        return null;
    }

    @Override
    public List<Object> findMasterSummonersByQueue(LeagueQueue queue) {
        riotRepositoryApiURL += "masterleagues/by-queue/"+queue.toString();
        return null;
    }

    @Override
    public Object findSummonersLeagueEntriesBySummonerID(String summonerID) {
        riotRepositoryApiURL += "entries/by-summoner/"+summonerID;
        return null;
    }

    @Override
    public Object findSummonersLeagueEntriesByLeagueID(String leagueID) {
        riotRepositoryApiURL += "leagues/"+leagueID;
        return null;
    }

    @Override
    public Object findAllLeagueEntriesByQueueAndByTierAndByDivison(LeagueQueue queue,
                                                                   LeagueTier tier,
                                                                   LeagueDivison divison) {

        riotRepositoryApiURL += "entries/"+queue.toString()+"/"+tier.toString()+"/"+divison.toString();
        return null;
    }
}
