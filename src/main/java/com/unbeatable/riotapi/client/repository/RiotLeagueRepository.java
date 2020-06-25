package com.unbeatable.riotapi.client.repository;

import com.unbeatable.riotapi.client.LeagueDivison;
import com.unbeatable.riotapi.client.LeagueQueue;
import com.unbeatable.riotapi.client.LeagueTier;

import java.util.List;

public interface RiotLeagueRepository {

    String leagueURL = "/lol/league/v4/";

    List<Object> findChallengerRiotSummonersByQueue(LeagueQueue queue);
    List<Object> findGrandmasterSummonersByQueue(LeagueQueue queue);
    List<Object> findMasterSummonersByQueue(LeagueQueue queue);

    Object findSummonersLeagueEntriesBySummonerID(String summonerID);
    Object findSummonersLeagueEntriesByLeagueID(String leagueID);
    Object findAllLeagueEntriesByQueueAndByTierAndByDivison(LeagueQueue queue,
                                                            LeagueTier tier,
                                                            LeagueDivison divison);

}
