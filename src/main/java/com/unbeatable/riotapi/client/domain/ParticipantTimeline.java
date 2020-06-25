package com.unbeatable.riotapi.client.domain;

import java.util.Map;

public class ParticipantTimeline {
    private int participantId;
    private Map<String, Double> creepsPerMinDeltas, xpPerMinDeltas, goldPerMinDeltas,
        csDiffPerMinDeltas, xpDiffPerMinDeltas, damageTakenPerMinDeltas,
        damageTakenDiffPerMinDeltas;
    private String role; // ENUM
    private SummonerLane lane; // TODO: edit later


    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public Map<String, Double> getCreepsPerMinDeltas() {
        return creepsPerMinDeltas;
    }

    public void setCreepsPerMinDeltas(Map<String, Double> creepsPerMinDeltas) {
        this.creepsPerMinDeltas = creepsPerMinDeltas;
    }

    public Map<String, Double> getXpPerMinDeltas() {
        return xpPerMinDeltas;
    }

    public void setXpPerMinDeltas(Map<String, Double> xpPerMinDeltas) {
        this.xpPerMinDeltas = xpPerMinDeltas;
    }

    public Map<String, Double> getGoldPerMinDeltas() {
        return goldPerMinDeltas;
    }

    public void setGoldPerMinDeltas(Map<String, Double> goldPerMinDeltas) {
        this.goldPerMinDeltas = goldPerMinDeltas;
    }

    public Map<String, Double> getCsDiffPerMinDeltas() {
        return csDiffPerMinDeltas;
    }

    public void setCsDiffPerMinDeltas(Map<String, Double> csDiffPerMinDeltas) {
        this.csDiffPerMinDeltas = csDiffPerMinDeltas;
    }

    public Map<String, Double> getXpDiffPerMinDeltas() {
        return xpDiffPerMinDeltas;
    }

    public void setXpDiffPerMinDeltas(Map<String, Double> xpDiffPerMinDeltas) {
        this.xpDiffPerMinDeltas = xpDiffPerMinDeltas;
    }

    public Map<String, Double> getDamageTakenPerMinDeltas() {
        return damageTakenPerMinDeltas;
    }

    public void setDamageTakenPerMinDeltas(Map<String, Double> damageTakenPerMinDeltas) {
        this.damageTakenPerMinDeltas = damageTakenPerMinDeltas;
    }

    public Map<String, Double> getDamageTakenDiffPerMinDeltas() {
        return damageTakenDiffPerMinDeltas;
    }

    public void setDamageTakenDiffPerMinDeltas(Map<String, Double> damageTakenDiffPerMinDeltas) {
        this.damageTakenDiffPerMinDeltas = damageTakenDiffPerMinDeltas;
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
        return "ParticipantTimeline{" +
                "participantId=" + participantId +
                ", creepsPerMinDeltas=" + creepsPerMinDeltas +
                ", xpPerMinDeltas=" + xpPerMinDeltas +
                ", goldPerMinDeltas=" + goldPerMinDeltas +
                ", csDiffPerMinDeltas=" + csDiffPerMinDeltas +
                ", xpDiffPerMinDeltas=" + xpDiffPerMinDeltas +
                ", damageTakenPerMinDeltas=" + damageTakenPerMinDeltas +
                ", damageTakenDiffPerMinDeltas=" + damageTakenDiffPerMinDeltas +
                ", role='" + role + '\'' +
                ", lane=" + lane +
                '}';
    }
}
