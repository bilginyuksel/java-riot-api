package com.unbeatable.riotapi.client.repository;

import java.util.List;

public interface RiotMatchesRepository {

    String matchesURL = "/lol/match/v4/";

    Object findMatchByMatchID(Long matchID);
    List<Object> findMatchListByAccountID(String accountID);
    Object findMatchTimelineByMatchID(Long matchID);
}
