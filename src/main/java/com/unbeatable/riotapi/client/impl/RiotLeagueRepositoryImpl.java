package com.unbeatable.riotapi.client.impl;

import com.unbeatable.riotapi.client.LeagueDivison;
import com.unbeatable.riotapi.client.LeagueQueue;
import com.unbeatable.riotapi.client.LeagueTier;
import com.unbeatable.riotapi.client.repository.RiotLeagueRepository;
import org.springframework.http.ResponseEntity;


public class RiotLeagueRepositoryImpl implements RiotLeagueRepository {

    private String riotRepositoryApiURL = RiotClient.BASE_URL + leagueURL;

    @Override
    public ResponseEntity<String> findChallengerRiotSummonersByQueue(LeagueQueue queue) {
        riotRepositoryApiURL += "challengerleagues/by-queue/"+queue.toString();
        // parse process
        return null;
    }

    @Override
    public ResponseEntity<String> findGrandmasterSummonersByQueue(LeagueQueue queue) {
        riotRepositoryApiURL += "grandmasterleagues/by-queue/"+queue.toString();
        return null;
    }

    @Override
    public ResponseEntity<String> findMasterSummonersByQueue(LeagueQueue queue) {
        riotRepositoryApiURL += "masterleagues/by-queue/"+queue.toString();
        return null;
    }

    @Override
    public ResponseEntity<String> findSummonersLeagueEntriesBySummonerID(String summonerID) {
        riotRepositoryApiURL += "entries/by-summoner/"+summonerID;
        return null;
    }

    @Override
    public ResponseEntity<String> findSummonersLeagueEntriesByLeagueID(String leagueID) {
        riotRepositoryApiURL += "leagues/"+leagueID;
        return null;
    }

    @Override
    public ResponseEntity<String> findAllLeagueEntriesByQueueAndByTierAndByDivison(LeagueQueue queue,
                                                                   LeagueTier tier,
                                                                   LeagueDivison divison) {

        riotRepositoryApiURL += "entries/"+queue.toString()+"/"+tier.toString()+"/"+divison.toString();
        return null;
    }
}
