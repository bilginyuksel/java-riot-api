package com.unbeatable.riotapi.client.repository;

import com.unbeatable.riotapi.client.LeagueDivison;
import com.unbeatable.riotapi.client.LeagueQueue;
import com.unbeatable.riotapi.client.LeagueTier;
import org.springframework.http.ResponseEntity;


public interface RiotLeagueRepository {

    String leagueURL = "/lol/league/v4/";

    ResponseEntity<String> findChallengerRiotSummonersByQueue(LeagueQueue queue);
    ResponseEntity<String> findGrandmasterSummonersByQueue(LeagueQueue queue);
    ResponseEntity<String> findMasterSummonersByQueue(LeagueQueue queue);

    ResponseEntity<String> findSummonersLeagueEntriesBySummonerID(String summonerID);
    ResponseEntity<String> findSummonersLeagueEntriesByLeagueID(String leagueID);
    ResponseEntity<String> findAllLeagueEntriesByQueueAndByTierAndByDivison(LeagueQueue queue,
                                                            LeagueTier tier,
                                                            LeagueDivison divison);

}
