package com.unbeatable.riotapi.client.domain;

import java.util.List;

public class GameDetails {
    private long gameId;
    private String platformId;
    private long gameCreation;
    private int gameDuration, queueId, mapId, seasonId;
    private String gameVersion;
    private String gameMode; // ENUM
    private String gameType; // ENUM

    private List<TeamStatistics> teams; // Teams list - Statistics
    private List<Participant> participants;
    private List<ParticipantIdentities> participantIdentities; // Those are like players summoner details

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public long getGameCreation() {
        return gameCreation;
    }

    public void setGameCreation(long gameCreation) {
        this.gameCreation = gameCreation;
    }

    public int getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(int gameDuration) {
        this.gameDuration = gameDuration;
    }

    public int getQueueId() {
        return queueId;
    }

    public void setQueueId(int queueId) {
        this.queueId = queueId;
    }

    public int getMapId() {
        return mapId;
    }

    public void setMapId(int mapId) {
        this.mapId = mapId;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(int seasonId) {
        this.seasonId = seasonId;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public void setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public List<TeamStatistics> getTeams() {
        return teams;
    }

    public void setTeams(List<TeamStatistics> teams) {
        this.teams = teams;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public List<ParticipantIdentities> getParticipantIdentities() {
        return participantIdentities;
    }

    public void setParticipantIdentities(List<ParticipantIdentities> participantIdentities) {
        this.participantIdentities = participantIdentities;
    }

    @Override
    public String toString() {
        return "GameDetails{" +
                "gameId=" + gameId +
                ", platformId='" + platformId + '\'' +
                ", gameCreation=" + gameCreation +
                ", gameDuration=" + gameDuration +
                ", queueId=" + queueId +
                ", mapId=" + mapId +
                ", seasonId=" + seasonId +
                ", gameVersion='" + gameVersion + '\'' +
                ", gameMode='" + gameMode + '\'' +
                ", gameType='" + gameType + '\'' +
                ", teams=" + teams +
                ", participants=" + participants +
                ", participantIdentities=" + participantIdentities +
                '}';
    }
}
