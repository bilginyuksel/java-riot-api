package com.unbeatable.riotapi.controllerTests;

import com.unbeatable.riotapi.TestConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.junit.Assert.*;
public class SummonerControllerTest extends TestConfig {
    @Override
    @Before
    public void setUp() {
        super.setUp();
    }
    @Test
    public void getSummonerByName() throws Exception {
        String uri = "/summoners/by-name/Mckcan";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertNotNull(content);
        assertEquals("Mckcan",content);
    }

}
