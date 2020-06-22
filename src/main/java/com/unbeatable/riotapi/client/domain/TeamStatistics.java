package com.unbeatable.riotapi.client.domain;

import java.util.List;

public class TeamStatistics {
    private int teamId;
    private String win; // Fail, ENUM
    private boolean firstBlood, firstTower, firstInhibitor, firstBaron,
        firstDragon, firstRiftHerald;
    private int towerKills, inhibitorKills, baronKills, dragonKills,
        vilemawKills, riftHeraldKills, dominionVictoryScore;
    private List<Object> bans;

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public boolean isFirstBlood() {
        return firstBlood;
    }

    public void setFirstBlood(boolean firstBlood) {
        this.firstBlood = firstBlood;
    }

    public boolean isFirstTower() {
        return firstTower;
    }

    public void setFirstTower(boolean firstTower) {
        this.firstTower = firstTower;
    }

    public boolean isFirstInhibitor() {
        return firstInhibitor;
    }

    public void setFirstInhibitor(boolean firstInhibitor) {
        this.firstInhibitor = firstInhibitor;
    }

    public boolean isFirstBaron() {
        return firstBaron;
    }

    public void setFirstBaron(boolean firstBaron) {
        this.firstBaron = firstBaron;
    }

    public boolean isFirstDragon() {
        return firstDragon;
    }

    public void setFirstDragon(boolean firstDragon) {
        this.firstDragon = firstDragon;
    }

    public boolean isFirstRiftHerald() {
        return firstRiftHerald;
    }

    public void setFirstRiftHerald(boolean firstRiftHerald) {
        this.firstRiftHerald = firstRiftHerald;
    }

    public int getTowerKills() {
        return towerKills;
    }

    public void setTowerKills(int towerKills) {
        this.towerKills = towerKills;
    }

    public int getInhibitorKills() {
        return inhibitorKills;
    }

    public void setInhibitorKills(int inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public int getBaronKills() {
        return baronKills;
    }

    public void setBaronKills(int baronKills) {
        this.baronKills = baronKills;
    }

    public int getDragonKills() {
        return dragonKills;
    }

    public void setDragonKills(int dragonKills) {
        this.dragonKills = dragonKills;
    }

    public int getVilemawKills() {
        return vilemawKills;
    }

    public void setVilemawKills(int vilemawKills) {
        this.vilemawKills = vilemawKills;
    }

    public int getRiftHeraldKills() {
        return riftHeraldKills;
    }

    public void setRiftHeraldKills(int riftHeraldKills) {
        this.riftHeraldKills = riftHeraldKills;
    }

    public int getDominionVictoryScore() {
        return dominionVictoryScore;
    }

    public void setDominionVictoryScore(int dominionVictoryScore) {
        this.dominionVictoryScore = dominionVictoryScore;
    }

    public List<Object> getBans() {
        return bans;
    }

    public void setBans(List<Object> bans) {
        this.bans = bans;
    }

    @Override
    public String toString() {
        return "TeamStatistics{" +
                "teamId=" + teamId +
                ", win='" + win + '\'' +
                ", firstBlood=" + firstBlood +
                ", firstTower=" + firstTower +
                ", firstInhibitor=" + firstInhibitor +
                ", firstBaron=" + firstBaron +
                ", firstDragon=" + firstDragon +
                ", firstRiftHerald=" + firstRiftHerald +
                ", towerKills=" + towerKills +
                ", inhibitorKills=" + inhibitorKills +
                ", baronKills=" + baronKills +
                ", dragonKills=" + dragonKills +
                ", vilemawKills=" + vilemawKills +
                ", riftHeraldKills=" + riftHeraldKills +
                ", dominionVictoryScore=" + dominionVictoryScore +
                ", bans=" + bans +
                '}';
    }
}
