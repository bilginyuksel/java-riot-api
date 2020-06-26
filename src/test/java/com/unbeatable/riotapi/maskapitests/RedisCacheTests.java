package com.unbeatable.riotapi.maskapitests;

import com.unbeatable.riotapi.client.impl.RiotClientApiCounterService;
import com.unbeatable.riotapi.controllers.SummonerController;
import com.unbeatable.riotapi.entities.Summoner;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

public class RedisCacheTests {

    /*
    * First of all we will check the redis database if any summoner we're about to request
    * is exist or not. If they're exists we simply will remove them from redis.
    *
    * After checking operation.
    * We will send requests to server like a client. Track riot ApiCounterService results.
    * It should increase with the requests we sent before.
    *
    * Send same requests again and now we expect to get data from redis.
    *
    * First of all ApiCounterService results should'nt change.
    * And we need to get the same data we got before.
    * Also write another test; which specifically looks redis database to find data.
    * And compare those data with the data we fetched before.
    *
    *  */

    private SummonerController summonerController ;
    private Summoner summoner1, summoner2, summoner3;

    public RedisCacheTests(){
        summonerController = new SummonerController();
    }

    @Before
    public void prepareTestDataFindSummonerValues(){
        int val = RiotClientApiCounterService.getGeneralApiCount();


        ResponseEntity<Summoner> summonerResponseEntity1 = summonerController.getSummoner("mckcan");
        ResponseEntity<Summoner> summonerResponseEntity2 = summonerController.getSummoner("hasan");
        ResponseEntity<Summoner> summonerResponseEntity3 = summonerController.getSummoner("piuvv");

        Assert.assertNotNull("Check the API call and the summoner controller or run the riot client tests to find the issue..", summonerResponseEntity1);
        Assert.assertNotNull("Check the API call and the summoner controller or run the riot client tests to find the issue..", summonerResponseEntity2);
        Assert.assertNotNull("Check the API call and the summoner controller or run the riot client tests to find the issue..", summonerResponseEntity3);
        Assert.assertNotEquals("Riot API calls couldn't completed. Data found from unknown field! \nTest Results;" +
                "Actual: "+(val+3) + ", Expected: "+RiotClientApiCounterService.getGeneralApiCount()+".",
                val+3, RiotClientApiCounterService.getGeneralApiCount());

        summoner1 = summonerResponseEntity1.getBody();
        summoner2 = summonerResponseEntity2.getBody();
        summoner3 = summonerResponseEntity3.getBody();
    }


    @Test
    public void isRedisCachesDataAfterNewDataFoundTestViaCheckingRiotClientApiCounterService(){
        int val = RiotClientApiCounterService.getGeneralApiCount();

        ResponseEntity<Summoner> summonerResponseEntity1 = summonerController.getSummoner("name1");
        ResponseEntity<Summoner> summonerResponseEntity2 = summonerController.getSummoner("name2");
        ResponseEntity<Summoner> summonerResponseEntity3 = summonerController.getSummoner("name3");

        Assert.assertEquals("Redis cache doesn't work. System didn't cache the data we requested before. "+
                "Check is redis has the data. If redis has the data then check the summoner controller. "+
                "If redis doesn't have the data then check redis services!", val, RiotClientApiCounterService.getGeneralApiCount());

        Assert.assertNotNull("If system can't pass this test that means summoner controller doesn't work like it should. "+
                "Because riot calls was successfull and this means system doesn't request to riot again which is OK. "+
                "But check summoner controller to find what is wrong with the local stuff.", summonerResponseEntity1);
        Assert.assertNotNull("If system can't pass this test that means summoner controller doesn't work like it should. "+
                "Because riot calls was successfull and this means system doesn't request to riot again which is OK. "+
                "But check summoner controller to find what is wrong with the local stuff.", summonerResponseEntity2);
        Assert.assertNotNull("If system can't pass this test that means summoner controller doesn't work like it should. "+
                "Because riot calls was successfull and this means system doesn't request to riot again which is OK. "+
                "But check summoner controller to find what is wrong with the local stuff.", summonerResponseEntity3);

        Assert.assertEquals("It looks like data has taken from redis. But the redis data and request data are not same." +
                "The data we get from redis and from request should be the same data.", summoner1, summonerResponseEntity1.getBody());
        Assert.assertEquals("It looks like data has taken from redis. But the redis data and request data are not same." +
                "The data we get from redis and from request should be the same data.", summoner2, summonerResponseEntity2.getBody());
        Assert.assertEquals("It looks like data has taken from redis. But the redis data and request data are not same." +
                "The data we get from redis and from request should be the same data.", summoner3, summonerResponseEntity3.getBody());
    }


    @Test
    public void isRedisCachesDataAfterNewDataFoundTestViaCheckingRedisDatastore(){

        // Check redis data store to find summoner1, summoner2 and summoner3
        return;
    }

    @After
    public void cleanRedisAfterTests(){

    }
}
