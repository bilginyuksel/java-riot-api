package com.unbeatable.riotapi.client.impl;

import com.unbeatable.riotapi.client.LeagueDivison;
import com.unbeatable.riotapi.client.LeagueQueue;
import com.unbeatable.riotapi.client.LeagueTier;
import com.unbeatable.riotapi.client.repository.RiotLeagueRepository;
import org.springframework.http.ResponseEntity;


public class RiotLeagueRepositoryImpl implements RiotLeagueRepository {

    private String riotRepositoryApiURL = RiotClient.BASE_URL + leagueURL;
    private RiotImplementationUtil riotImplementationUtil;

    public RiotLeagueRepositoryImpl(){
      riotImplementationUtil = new RiotImplementationUtil();
    }
    private void clearURL() {riotRepositoryApiURL = RiotClient.BASE_URL + leagueURL;}

    @Override
    public ResponseEntity<String> findChallengerRiotSummonersByQueue(LeagueQueue queue) {
        clearURL();
        riotRepositoryApiURL += "challengerleagues/by-queue/"+queue.toString();
        return riotImplementationUtil.getExchangedResponse(riotRepositoryApiURL, String.class);
    }

    @Override
    public ResponseEntity<String> findGrandmasterSummonersByQueue(LeagueQueue queue) {
        clearURL();
        riotRepositoryApiURL += "grandmasterleagues/by-queue/"+queue.toString();
        return riotImplementationUtil.getExchangedResponse(riotRepositoryApiURL, String.class);
    }

    @Override
    public ResponseEntity<String> findMasterSummonersByQueue(LeagueQueue queue) {
        clearURL();
        riotRepositoryApiURL += "masterleagues/by-queue/"+queue.toString();
        return riotImplementationUtil.getExchangedResponse(riotRepositoryApiURL, String.class);
    }

    @Override
    public ResponseEntity<String> findSummonersLeagueEntriesBySummonerID(String summonerID) {
        clearURL();
        riotRepositoryApiURL += "entries/by-summoner/"+summonerID;
        return riotImplementationUtil.getExchangedResponse(riotRepositoryApiURL, String.class);
    }

    @Override
    public ResponseEntity<String> findSummonersLeagueEntriesByLeagueID(String leagueID) {
        clearURL();
        riotRepositoryApiURL += "leagues/"+leagueID;
        return riotImplementationUtil.getExchangedResponse(riotRepositoryApiURL, String.class);
    }

    @Override
    public ResponseEntity<String> findAllLeagueEntriesByQueueAndByTierAndByDivison(LeagueQueue queue,
                                                                   LeagueTier tier,
                                                                   LeagueDivison divison) {
        clearURL();
        riotRepositoryApiURL += "entries/"+queue.toString()+"/"+tier.toString()+"/"+divison.toString();
        return riotImplementationUtil.getExchangedResponse(riotRepositoryApiURL, String.class);
    }
}
