package com.unbeatable.riotapi.riotclienttests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unbeatable.riotapi.client.domain.RiotSummonerDetails;
import com.unbeatable.riotapi.client.impl.RiotSummonerRepositoryImpl;
import com.unbeatable.riotapi.client.repository.RiotSummonerRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.*;

public class RiotClientSummonerTests {

    protected RiotSummonerRepository summonerRepository;
    protected String searchedSummonerId;
    protected String searchedSummonerAccountId;
    protected String searchedSummonerPUUID;
    protected String searchedSummonerName;
    protected ObjectMapper objectMapper;
    protected RiotSummonerDetails expected;

    @Before
    public void setTestEnvironment(){
        summonerRepository = new RiotSummonerRepositoryImpl();
        objectMapper = new ObjectMapper();
        expected = new RiotSummonerDetails();


        searchedSummonerAccountId = "XhKGlShxjayud-4UqQIBLlI8qMo27gBJxv3hh9yY5gagEZo";
        searchedSummonerId = "XFBUeWC0akQO9xPnJeADFfahQpt5aN9QVOv3XP5l6KRgpw"; // It can be wrong
        searchedSummonerPUUID = "clYNd7EhbsaoUsnanEBr4vhBs3-hbVFcrjyMbozXlQFHdZFdEV7unn4Cr_E7bZ7SCi3msrikxRz5YQ";
        searchedSummonerName = "Mckcan";

        expected.setId(searchedSummonerId);
        expected.setAccountId(searchedSummonerAccountId);
        expected.setName(searchedSummonerName);
        expected.setPuuid(searchedSummonerPUUID);
        // This fields are useless. Because users can change those informations anytime they want.
        // Those fields are meaningles for Riot Summoner Detail object equals method
        expected.setProfileIconId(3369);
        expected.setSummonerLevel(194);

    }


    private void commonCheckForAllMethods(ResponseEntity<String> response){
        assertEquals("Check http request!", response.getStatusCode(), HttpStatus.OK);
        System.out.println(response.getBody());
        RiotSummonerDetails actual = null;
        try {
            actual = objectMapper.readValue(response.getBody(), RiotSummonerDetails.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            fail("Http response couldn't parse into Riot Summoner Details object!");
        }
        System.out.println("Expected:" + expected);
        System.out.println("Actual:" + actual);

        assert actual.equals(expected):"Objects should equal!";
    }

    @Test
    public void findSummonerBySummonerNameTest(){
        ResponseEntity<String> response = summonerRepository.findSummonerByName(searchedSummonerName);
        commonCheckForAllMethods(response);
    }

    @Test
    public void findSummonerBySummonerIdTest(){
        ResponseEntity<String> response = summonerRepository.findSummonerBySummonerID(searchedSummonerId);
        commonCheckForAllMethods(response);
    }

    @Test
    public void findSummonerBySummonerAccountIdTest(){
        ResponseEntity<String> response = summonerRepository.findSummonerByAccountID(searchedSummonerAccountId);
        commonCheckForAllMethods(response);
    }

    @Test
    public void findSummonerBySummonerPUUIDTest(){
        ResponseEntity<String> response = summonerRepository.findSummonerByPUUID(searchedSummonerPUUID);
        commonCheckForAllMethods(response);
    }
}
