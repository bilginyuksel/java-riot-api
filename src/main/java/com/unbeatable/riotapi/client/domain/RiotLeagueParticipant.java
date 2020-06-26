package com.unbeatable.riotapi.client.domain;

import com.unbeatable.riotapi.client.LeagueDivison;

public class RiotLeagueParticipant {
  private String summonerId, summonerName;
  private int leaguePoints;
  private LeagueDivison rank; // It should be enum
  private int wins, losses;
  private boolean veteran, inactive, freshBlood, hotStreak;

  public String getSummonerId() {
    return summonerId;
  }

  public void setSummonerId(String summonerId) {
    this.summonerId = summonerId;
  }

  public String getSummonerName() {
    return summonerName;
  }

  public void setSummonerName(String summonerName) {
    this.summonerName = summonerName;
  }

  public int getLeaguePoints() {
    return leaguePoints;
  }

  public void setLeaguePoints(int leaguePoints) {
    this.leaguePoints = leaguePoints;
  }

  public LeagueDivison getRank() {
    return rank;
  }

  public void setRank(LeagueDivison rank) {
    this.rank = rank;
  }

  public int getWins() {
    return wins;
  }

  public void setWins(int wins) {
    this.wins = wins;
  }

  public int getLosses() {
    return losses;
  }

  public void setLosses(int losses) {
    this.losses = losses;
  }

  public boolean isVeteran() {
    return veteran;
  }

  public void setVeteran(boolean veteran) {
    this.veteran = veteran;
  }

  public boolean isInactive() {
    return inactive;
  }

  public void setInactive(boolean inactive) {
    this.inactive = inactive;
  }

  public boolean isFreshBlood() {
    return freshBlood;
  }

  public void setFreshBlood(boolean freshBlood) {
    this.freshBlood = freshBlood;
  }

  public boolean isHotStreak() {
    return hotStreak;
  }

  public void setHotStreak(boolean hotStreak) {
    this.hotStreak = hotStreak;
  }

  @Override
  public String toString() {
    return "RiotLeagueParticipant{" +
            "summonerId='" + summonerId + '\'' +
            ", summonerName='" + summonerName + '\'' +
            ", leaguePoints=" + leaguePoints +
            ", rank='" + rank + '\'' +
            ", wins=" + wins +
            ", losses=" + losses +
            ", veteran=" + veteran +
            ", inactive=" + inactive +
            ", freshBlood=" + freshBlood +
            ", hotStreak=" + hotStreak +
            '}';
  }
}
