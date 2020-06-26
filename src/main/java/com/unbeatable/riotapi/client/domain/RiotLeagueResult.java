package com.unbeatable.riotapi.client.domain;

import com.unbeatable.riotapi.client.LeagueQueue;
import com.unbeatable.riotapi.client.LeagueTier;

import java.util.List;

public class RiotLeagueResult {
  private LeagueTier tier;
  private String leagueId;
  private LeagueQueue queue;
  private String name;
  private List<RiotLeagueParticipant> entries;

  public LeagueTier getTier() {
    return tier;
  }

  public void setTier(LeagueTier tier) {
    this.tier = tier;
  }

  public String getLeagueId() {
    return leagueId;
  }

  public void setLeagueId(String leagueId) {
    this.leagueId = leagueId;
  }

  public LeagueQueue getQueue() {
    return queue;
  }

  public void setQueue(LeagueQueue queue) {
    this.queue = queue;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<RiotLeagueParticipant> getEntries() {
    return entries;
  }

  public void setEntries(List<RiotLeagueParticipant> entries) {
    this.entries = entries;
  }

  @Override
  public String toString() {
    return "RiotLeagueResult{" +
            "tier=" + tier +
            ", leagueId='" + leagueId + '\'' +
            ", queue=" + queue +
            ", name='" + name + '\'' +
            ", entries=" + entries +
            '}';
  }
}
