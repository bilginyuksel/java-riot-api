package com.unbeatable.riotapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.unbeatable.riotapi.entities.Summoner;
public class SummonerControllerTest extends TestConfig {
    @Override
    @Before
    public void setUp() {
        super.setUp();
    }
    public void getSummonerByName() throws Exception {
        String uri = "/summoners/by-name/Mckcan";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        Summoner[] summonerList = super.mapFromJson(content, Summoner[].class);
        assertTrue(summonerList.length > 0);
    }

}
