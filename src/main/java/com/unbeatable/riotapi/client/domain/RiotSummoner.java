package com.unbeatable.riotapi.client.domain;

import java.util.List;
import java.util.Objects;

public class RiotSummoner {
    private RiotSummonerDetails riotSummonerDetails;
    private int startIndex, endIndex, totalGames;
    private List<RiotSummonerMatchDetails> matches;

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public int getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(int totalGames) {
        this.totalGames = totalGames;
    }

    public List<RiotSummonerMatchDetails> getMatches() {
        return matches;
    }

    public void setMatches(List<RiotSummonerMatchDetails> matches) {
        this.matches = matches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RiotSummoner that = (RiotSummoner) o;
        return startIndex == that.startIndex &&
                endIndex == that.endIndex &&
                totalGames == that.totalGames &&
                Objects.equals(matches, that.matches);
    }


    @Override
    public String toString() {
        return "RiotSummonerMatchDetails{" +
                "startIndex=" + startIndex +
                ", endIndex=" + endIndex +
                ", totalGames=" + totalGames +
                ", matches=" + matches +
                '}';
    }
}
