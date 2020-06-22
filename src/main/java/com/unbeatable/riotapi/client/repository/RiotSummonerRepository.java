package com.unbeatable.riotapi.client.repository;

import org.springframework.http.ResponseEntity;

public interface RiotSummonerRepository {

    String summonerURL = "/lol/summoner/v4/summoners/";

    ResponseEntity<String> findSummonerByName(String summonerName);
    ResponseEntity<String> findSummonerByAccountID(String accountID);
    ResponseEntity<String> findSummonerByPUUID(String puuid);
    ResponseEntity<String> findSummonerBySummonerID(String summonerID);
}
