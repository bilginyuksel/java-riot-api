package com.unbeatable.riotapi.riotclienttests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unbeatable.riotapi.client.LeagueQueue;
import com.unbeatable.riotapi.client.domain.RiotLeagueResult;
import com.unbeatable.riotapi.client.impl.RiotLeagueRepositoryImpl;
import com.unbeatable.riotapi.client.repository.RiotLeagueRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.xml.ws.Response;

public class RiotClientLeagueTests {

    private RiotLeagueRepository riotLeagueRepository;
    private ObjectMapper objectMapper;
    private String leagueIdSolo;
    private String leagueIdFlex;

    private void testEnvironmentPreperation(){
      riotLeagueRepository = new RiotLeagueRepositoryImpl();
      objectMapper = new ObjectMapper();

      // Challenger's leagueId - RANKED_SOLO_5x5
      leagueIdSolo = "72372116-8662-38c5-a2ce-e1e22e331b80";
      // Challenger's leagueId - RANKED_FLEX_SR
      leagueIdFlex = "24ee20c9-9b25-35be-bd6a-22fcac3d1b0c";
    }

    @ParameterizedTest
    @EnumSource(LeagueQueue.class)
    public void findChallengerRiotSummonersByQueueTest(LeagueQueue queue){
      testEnvironmentPreperation();

      ResponseEntity<String> responseEntity = riotLeagueRepository.
              findChallengerRiotSummonersByQueue(queue);

      Assert.assertEquals("Check http request!", HttpStatus.OK, responseEntity.getStatusCode());

      RiotLeagueResult riotLeagueResult = null;
      try {
        riotLeagueResult = objectMapper.readValue(responseEntity.getBody(), RiotLeagueResult.class);
      } catch (JsonProcessingException e) {
        e.printStackTrace();
      }
      System.out.println(riotLeagueResult);
    }

    @ParameterizedTest
    @EnumSource(LeagueQueue.class)
    public void findGrandmasterSummonersByQueueTest(LeagueQueue queue){

      testEnvironmentPreperation();

      ResponseEntity<String> responseEntity = riotLeagueRepository
              .findGrandmasterSummonersByQueue(queue);

      Assert.assertEquals("Check http request!", HttpStatus.OK, responseEntity.getStatusCode());

      RiotLeagueResult riotLeagueResult = null;
      try {
        riotLeagueResult = objectMapper.readValue(responseEntity.getBody(), RiotLeagueResult.class);
      } catch (JsonProcessingException e) {
        e.printStackTrace();
      }

      System.out.println(riotLeagueResult);
    }

    @ParameterizedTest
    @EnumSource(LeagueQueue.class)
    public void findMasterSummonersByQueueTest(LeagueQueue queue){
      testEnvironmentPreperation();

      ResponseEntity<String> responseEntity = riotLeagueRepository
              .findMasterSummonersByQueue(queue);

      Assert.assertEquals("Check http request!", HttpStatus.OK, responseEntity.getStatusCode());

      RiotLeagueResult riotLeagueResult = null;
      try {
        riotLeagueResult = objectMapper.readValue(responseEntity.getBody(), RiotLeagueResult.class);
      } catch (JsonProcessingException e) {
        e.printStackTrace();
      }

      System.out.println(riotLeagueResult);

    }

    @Test
    public void findSummonersLeagueEntriesBySummonerIDTest(){
      // This is useless, we won't use this in the future.
    }

    private final String[] source = new String[]{};

    @ParameterizedTest
    @EnumSource(LeagueQueue.class)
    public void findSummonersLeagueEntriesByLeagueIDTest(LeagueQueue queue){
      testEnvironmentPreperation();
      // Find a leagueId
      // compare the answer with the leagueId and the queue
      ResponseEntity<String> responseEntity = null;
      ResponseEntity<String> expectedEntity = null;
      RiotLeagueResult riotLeagueResult = null;
      RiotLeagueResult expected = null;

      if(queue == LeagueQueue.RANKED_FLEX_SR)
        responseEntity = riotLeagueRepository.findSummonersLeagueEntriesByLeagueID(leagueIdFlex);
      else if(queue == LeagueQueue.RANKED_SOLO_5x5)
        responseEntity = riotLeagueRepository.findSummonersLeagueEntriesByLeagueID(leagueIdSolo);

      Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
      expectedEntity = riotLeagueRepository.findChallengerRiotSummonersByQueue(queue);

      Assert.assertEquals(HttpStatus.OK, expectedEntity.getStatusCode());

      try {
        riotLeagueResult = objectMapper.readValue(responseEntity.getBody(), RiotLeagueResult.class);
        expected = objectMapper.readValue(expectedEntity.getBody(), RiotLeagueResult.class);
      } catch (JsonProcessingException e) {
        e.printStackTrace();
      }

      System.out.println(riotLeagueResult);
      System.out.println(expected);

      Assert.assertEquals("Same league id queried, they should equal.", expected, riotLeagueResult);

    }

    @Test
    // @EnumSource({LeagueQueue.class, LeagueTier.class, LeagueDivison.class})
    public void findAllLeagueEntriesByQueueAndByTierAndByDivisonTest(){

    }

}
