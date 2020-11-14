package com.unbeatable.riotapi.client.impl;

import com.unbeatable.riotapi.client.repository.RiotMatchesRepository;
import org.springframework.http.ResponseEntity;


public class RiotMatchesRepositoryImpl implements RiotMatchesRepository {

    private final static String URL_PREFIX = RiotClient.BASE_URL + matchesURL;
    private final RiotImplementationUtil util;

    public RiotMatchesRepositoryImpl(){
        util = new RiotImplementationUtil();
    }


    @Override
    public ResponseEntity<String> findMatchByMatchID(Long matchID) {
        String url = URL_PREFIX + "matches/"+matchID.toString();
        return util.getExchangedResponse(url, String.class);
    }

    @Override
    public ResponseEntity<String> findMatchListByAccountID(String accountID) {
        String url = URL_PREFIX + "matchlists/by-account/"+accountID;
        return util.getExchangedResponse(url, String.class);
    }

    @Override
    public ResponseEntity<String> findMatchTimelineByMatchID(Long matchID) {
        String url = URL_PREFIX + "timelines/by-match/"+matchID.toString();
        return util.getExchangedResponse(url, String.class);
    }
}
