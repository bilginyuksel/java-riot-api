package com.unbeatable.riotapi.riotclienttests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unbeatable.riotapi.client.domain.GameDetails;
import com.unbeatable.riotapi.client.domain.RiotSummonerDetails;
import com.unbeatable.riotapi.client.domain.RiotSummoner;
import com.unbeatable.riotapi.client.impl.RiotMatchesRepositoryImpl;
import com.unbeatable.riotapi.client.repository.RiotMatchesRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;



public class RiotClientMatchesTests  {

    private RiotSummonerDetails riotSummonerDetails;
    private RiotMatchesRepository repository;
    private String accountId;
    private ObjectMapper objectMapper;
    private long gameId;

    @Before
    public void setEnvironment(){
        riotSummonerDetails = new RiotSummonerDetails();
        repository = new RiotMatchesRepositoryImpl();
        objectMapper = new ObjectMapper();

        accountId = "XhKGlShxjayud-4UqQIBLlI8qMo27gBJxv3hh9yY5gagEZo";
        gameId = 1032211012;
    }

    @Test
    public void findMatchListByAccountIdTest(){
        ResponseEntity<String> response = repository.findMatchListByAccountID(accountId);

        Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);

        RiotSummoner riotSummonerMatchDetails = null;
        try {
            riotSummonerMatchDetails = objectMapper.readValue(response.getBody(), RiotSummoner.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        Assert.assertNotNull(riotSummonerMatchDetails.getMatches());
        Assert.assertNotNull(riotSummonerMatchDetails.getMatches().get(0));

        System.out.println(riotSummonerMatchDetails);
    }

    @Test
    public void findMatchByMatchIdTest(){
        ResponseEntity<String> response = repository.findMatchByMatchID(gameId);

        Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);
        GameDetails gameDetails = null;

        try {
            gameDetails = objectMapper.readValue(response.getBody(), GameDetails.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            Assert.fail("Problem occured while converting JSON to GameDetails.class");
        }

        System.out.println(gameDetails);
    }

    @Test
    public void findMatchTimelineTest(){
        ResponseEntity<String> response = repository.findMatchTimelineByMatchID(gameId);

        Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);

        System.out.println(response.getBody());
    }
}
