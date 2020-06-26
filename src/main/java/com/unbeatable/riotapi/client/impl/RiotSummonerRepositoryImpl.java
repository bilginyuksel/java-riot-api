package com.unbeatable.riotapi.client.impl;

import com.unbeatable.riotapi.client.repository.RiotSummonerRepository;
import org.springframework.http.ResponseEntity;

public class RiotSummonerRepositoryImpl implements RiotSummonerRepository {

    private String summonerRepositoryApiUrl = RiotClient.BASE_URL + summonerURL;
    private RiotImplementationUtil util;

    public RiotSummonerRepositoryImpl(){
        util = new RiotImplementationUtil();
    }
    private void clearURL(){summonerRepositoryApiUrl = RiotClient.BASE_URL + summonerURL;}
    @Override
    public ResponseEntity<String> findSummonerByName(String summonerName) {
        clearURL();
        summonerRepositoryApiUrl += "by-name/"+summonerName;
        return util.getExchangedResponse(summonerRepositoryApiUrl, String.class);
    }

    @Override
    public ResponseEntity<String> findSummonerByAccountID(String accountID) {
        clearURL();
        summonerRepositoryApiUrl += "by-account/"+accountID;
        return util.getExchangedResponse(summonerRepositoryApiUrl, String.class);
    }

    @Override
    public ResponseEntity<String> findSummonerByPUUID(String puuid) {
        clearURL();
        summonerRepositoryApiUrl += "by-puuid/" + puuid;
        return util.getExchangedResponse(summonerRepositoryApiUrl, String.class);
    }

    @Override
    public ResponseEntity<String> findSummonerBySummonerID(String summonerID) {
        clearURL();
        summonerRepositoryApiUrl += summonerID;
        return util.getExchangedResponse(summonerRepositoryApiUrl, String.class);
    }
}