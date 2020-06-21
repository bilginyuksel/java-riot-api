package com.unbeatable.riotapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;


public class RiotApiClient {
    //TODO::RestTemplate Kullanılabilir istekler için
    //TODO::Header Ayarlamaları için Http Kullanılabilir
    String region; //TODO::tr1 euw gibi özel classlar açılabilir yada ön tarafdan oto çekiilebilir
    public static final String API_KEY = "RGAPI-d8a2c026-111e-49e3-9c6b-198b6cc72c66";
    public static final String BASE_URL = "api.riotgames.com/lol/";
    String region = "TR1";//TODO::ÖN TARAFDA SEÇİLEN REGİON DÖNECEK BURAYA
    @Autowired
    public void getSummonerByName() {

    }
}
