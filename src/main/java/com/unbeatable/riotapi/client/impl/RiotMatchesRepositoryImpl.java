package com.unbeatable.riotapi.client.impl;

import com.unbeatable.riotapi.client.repository.RiotMatchesRepository;
import org.springframework.http.ResponseEntity;


public class RiotMatchesRepositoryImpl implements RiotMatchesRepository {

    private String riotMatchesApiURL = RiotClient.BASE_URL + matchesURL;
    private RiotImplementationUtil util;

    public RiotMatchesRepositoryImpl(){
        util = new RiotImplementationUtil();
    }

    @Override
    public ResponseEntity<String> findMatchByMatchID(Long matchID) {
        riotMatchesApiURL += "matches/"+matchID.toString();
        return util.getExchangedResponse(riotMatchesApiURL, String.class);
    }

    @Override
    public ResponseEntity<String> findMatchListByAccountID(String accountID) {
        riotMatchesApiURL += "matchlists/by-account/"+accountID;
        return util.getExchangedResponse(riotMatchesApiURL, String.class);
    }

    @Override
    public ResponseEntity<String> findMatchTimelineByMatchID(Long matchID) {
        riotMatchesApiURL += "timelines/by-match/"+matchID.toString();
        return util.getExchangedResponse(riotMatchesApiURL, String.class);
    }
}
