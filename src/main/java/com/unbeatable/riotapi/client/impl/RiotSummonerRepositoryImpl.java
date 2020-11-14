package com.unbeatable.riotapi.client.impl;

import com.unbeatable.riotapi.client.repository.RiotSummonerRepository;
import org.springframework.http.ResponseEntity;

public class RiotSummonerRepositoryImpl implements RiotSummonerRepository {

    private final static String URL_PREFIX = RiotClient.BASE_URL + summonerURL;
    private final RiotImplementationUtil util;

    public RiotSummonerRepositoryImpl(){
        util = new RiotImplementationUtil();
    }
    @Override
    public ResponseEntity<String> findSummonerByName(String summonerName) {
        String url = URL_PREFIX + "by-name/"+summonerName;
        return util.getExchangedResponse(url, String.class);
    }

    @Override
    public ResponseEntity<String> findSummonerByAccountID(String accountID) {
        String url = URL_PREFIX + "by-account/"+accountID;
        return util.getExchangedResponse(url, String.class);
    }

    @Override
    public ResponseEntity<String> findSummonerByPUUID(String puuid) {
        String url = URL_PREFIX + "by-puuid/" + puuid;
        return util.getExchangedResponse(url, String.class);
    }

    @Override
    public ResponseEntity<String> findSummonerBySummonerID(String summonerID) {
        String url = URL_PREFIX + summonerID;
        return util.getExchangedResponse(url, String.class);
    }
}