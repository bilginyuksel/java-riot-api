package com.unbeatable.riotapi.client.impl;

import com.unbeatable.riotapi.client.repository.RiotMatchesRepository;

import java.util.List;

public class RiotMatchesRepositoryImpl implements RiotMatchesRepository {

    private String riotMatchesApiURL = RiotClient.BASE_URL + matchesURL;

    @Override
    public Object findMatchByMatchID(Long matchID) {
        riotMatchesApiURL += "matches/"+matchID.toString();
        return null;
    }

    @Override
    public List<Object> findMatchListByAccountID(String accountID) {
        riotMatchesApiURL += "matchlists/by-account/"+accountID;
        return null;
    }

    @Override
    public Object findMatchTimelineByMatchID(Long matchID) {
        riotMatchesApiURL += "timelines/by-match/"+matchID.toString();
        return null;
    }
}
