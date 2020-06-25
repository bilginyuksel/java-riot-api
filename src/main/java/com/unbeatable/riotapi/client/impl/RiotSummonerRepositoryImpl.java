package com.unbeatable.riotapi.client.impl;

import com.unbeatable.riotapi.client.repository.RiotSummonerRepository;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RiotSummonerRepositoryImpl implements RiotSummonerRepository {

    private String summonerRepositoryApiUrl = RiotClient.BASE_URL + summonerURL;
    private RestTemplate restTemplate ;
    private HttpHeaders headers;
    private HttpEntity<String> httpEntity;

    public RiotSummonerRepositoryImpl(){
        restTemplate = new RestTemplate();
        headers = new HttpHeaders();

        // Riot Api key
        headers.set("X-Riot-Token", RiotClient.X_Riot_Token);
        httpEntity = new HttpEntity<String>("parameters", headers);
    }

    @Override
    public ResponseEntity<String> findSummonerByName(String summonerName) {
        summonerRepositoryApiUrl += "by-name/"+summonerName;
        ResponseEntity<String> response = restTemplate.exchange(
                summonerRepositoryApiUrl,
                HttpMethod.GET,
                httpEntity,
                String.class
        );
        return response;
    }

    @Override
    public Object findSummonerByAccountID(String accountID) {
        summonerRepositoryApiUrl += "by-account/"+accountID;
        return null;
    }

    @Override
    public Object findSummonerByPUUID(String puuid) {
        summonerRepositoryApiUrl += "by-puuid/" + puuid;
        return null;
    }

    @Override
    public Object findSummonerBySummonerID(String summonerID) {
        summonerRepositoryApiUrl += summonerID;
        return null;
    }
}
