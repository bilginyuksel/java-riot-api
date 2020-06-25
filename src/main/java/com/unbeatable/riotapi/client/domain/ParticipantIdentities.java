package com.unbeatable.riotapi.client.domain;

import java.util.Map;

public class ParticipantIdentities {
    private int participantId;
    private Map<String, Object> player;

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public Map<String, Object> getPlayer() {
        return player;
    }

    public void setPlayer(Map<String, Object> player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "ParticipantIdentities{" +
                "participantId=" + participantId +
                ", player=" + player +
                '}';
    }
}
