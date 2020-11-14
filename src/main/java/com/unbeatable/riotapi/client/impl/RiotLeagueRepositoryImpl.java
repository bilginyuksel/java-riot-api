package com.unbeatable.riotapi.client.impl;

import com.unbeatable.riotapi.client.LeagueDivison;
import com.unbeatable.riotapi.client.LeagueQueue;
import com.unbeatable.riotapi.client.LeagueTier;
import com.unbeatable.riotapi.client.repository.RiotLeagueRepository;
import org.springframework.http.ResponseEntity;


public class RiotLeagueRepositoryImpl implements RiotLeagueRepository {

    private final static String URL_PREFIX = RiotClient.BASE_URL + leagueURL;
    private final RiotImplementationUtil riotImplementationUtil;

    public RiotLeagueRepositoryImpl(){
      riotImplementationUtil = new RiotImplementationUtil();
    }

    @Override
    public ResponseEntity<String> findChallengerRiotSummonersByQueue(LeagueQueue queue) {
        String url = URL_PREFIX + "challengerleagues/by-queue/"+queue.toString();
        return riotImplementationUtil.getExchangedResponse(url, String.class);
    }

    @Override
    public ResponseEntity<String> findGrandmasterSummonersByQueue(LeagueQueue queue) {
        String url = URL_PREFIX + "grandmasterleagues/by-queue/"+queue.toString();
        return riotImplementationUtil.getExchangedResponse(url, String.class);
    }

    @Override
    public ResponseEntity<String> findMasterSummonersByQueue(LeagueQueue queue) {
        String url = URL_PREFIX + "masterleagues/by-queue/"+queue.toString();
        return riotImplementationUtil.getExchangedResponse(url, String.class);
    }

    @Override
    public ResponseEntity<String> findSummonersLeagueEntriesBySummonerID(String summonerID) {
        String url =  "entries/by-summoner/"+summonerID;
        return riotImplementationUtil.getExchangedResponse(url, String.class);
    }

    @Override
    public ResponseEntity<String> findSummonersLeagueEntriesByLeagueID(String leagueID) {
        String url = URL_PREFIX + "leagues/"+leagueID;
        return riotImplementationUtil.getExchangedResponse(url, String.class);
    }

    @Override
    public ResponseEntity<String> findAllLeagueEntriesByQueueAndByTierAndByDivison(LeagueQueue queue,
                                                                   LeagueTier tier,
                                                                   LeagueDivison divison) {
        String url = URL_PREFIX + "entries/"+queue.toString()+"/"+tier.toString()+"/"+divison.toString();
        return riotImplementationUtil.getExchangedResponse(url, String.class);
    }
}
