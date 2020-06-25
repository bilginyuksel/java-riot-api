package com.unbeatable.riotapi.client.domain;

public class RiotSummonerMatchDetails {
    private String platformId;
    private long gameId, timestamp;
    private int champion, queue, season;
    private String role;
    private SummonerLane lane;

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getChampion() {
        return champion;
    }

    public void setChampion(int champion) {
        this.champion = champion;
    }

    public int getQueue() {
        return queue;
    }

    public void setQueue(int queue) {
        this.queue = queue;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public SummonerLane getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = SummonerLane.valueOf(lane);
    }

    @Override
    public String toString() {
        return "RiotMatchDetails{" +
                "platformId='" + platformId + '\'' +
                ", gameId=" + gameId +
                ", timestamp=" + timestamp +
                ", champion=" + champion +
                ", queue=" + queue +
                ", season=" + season +
                ", role='" + role + '\'' +
                ", lane='" + lane + '\'' +
                '}';
    }
}
