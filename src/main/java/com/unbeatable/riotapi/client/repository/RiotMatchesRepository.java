package com.unbeatable.riotapi.client.repository;

import org.springframework.http.ResponseEntity;

public interface RiotMatchesRepository {

    String matchesURL = "/lol/match/v4/";

    ResponseEntity<String> findMatchByMatchID(Long matchID);
    ResponseEntity<String> findMatchListByAccountID(String accountID);
    ResponseEntity<String> findMatchTimelineByMatchID(Long matchID);
}
