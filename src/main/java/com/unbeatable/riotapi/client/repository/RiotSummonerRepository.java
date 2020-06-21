package com.unbeatable.riotapi.client.repository;

public interface RiotSummonerRepository {

    String summonerURL = "/lol/summoner/v4/summoners/";


    Object findSummonerByName(String summonerName);
    Object findSummonerByAccountID(String accountID);
    Object findSummonerByPUUID(String puuid);
    Object findSummonerBySummonerID(String summonerID);
}
