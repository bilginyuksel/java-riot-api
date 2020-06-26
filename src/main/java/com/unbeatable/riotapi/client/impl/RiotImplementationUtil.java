package com.unbeatable.riotapi.client.impl;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RiotImplementationUtil {

    private RestTemplate restTemplate;
    private HttpHeaders headers;
    private HttpEntity<String> httpEntity;

    public RiotImplementationUtil(){
        restTemplate = new RestTemplate();

        headers = new HttpHeaders();

        // Riot Api key
        headers.set("X-Riot-Token", RiotClient.X_Riot_Token);
        httpEntity = new HttpEntity<String>("parameters", headers);
    }

    protected ResponseEntity<String> getExchangedResponse(String url, Class s){
        RiotClientApiCounterService.makeRiotApiCall();
        ResponseEntity<String> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                httpEntity,
                s
        );

        return response;
    }
}
