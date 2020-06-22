package com.unbeatable.riotapi.client.domain;


public class Participant {
    private int participantId, teamId, championId, spell1Id,
        spell2Id;

    private ParticipantStats stats;
    private ParticipantTimeline timeline;

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getChampionId() {
        return championId;
    }

    public void setChampionId(int championId) {
        this.championId = championId;
    }

    public int getSpell1Id() {
        return spell1Id;
    }

    public void setSpell1Id(int spell1Id) {
        this.spell1Id = spell1Id;
    }

    public int getSpell2Id() {
        return spell2Id;
    }

    public void setSpell2Id(int spell2Id) {
        this.spell2Id = spell2Id;
    }

    public ParticipantStats getStats() {
        return stats;
    }

    public void setStats(ParticipantStats stats) {
        this.stats = stats;
    }

    public ParticipantTimeline getTimeline() {
        return timeline;
    }

    public void setTimeline(ParticipantTimeline timeline) {
        this.timeline = timeline;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "participantId=" + participantId +
                ", teamId=" + teamId +
                ", championId=" + championId +
                ", spell1Id=" + spell1Id +
                ", spell2Id=" + spell2Id +
                ", stats=" + stats +
                ", timeline=" + timeline +
                '}';
    }
}
