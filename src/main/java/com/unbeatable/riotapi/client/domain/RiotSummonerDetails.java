package com.unbeatable.riotapi.client.domain;

import java.util.Objects;

public class RiotSummonerDetails {
    private String id, accountId, puuid;
    private String name;
    private int profileIconId, summonerLevel;
    private long revisionDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getPuuid() {
        return puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(int profileIconId) {
        this.profileIconId = profileIconId;
    }

    public int getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(int summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(long revisionDate) {
        this.revisionDate = revisionDate;
    }

    @Override
    public String toString() {
        return "RiotSummonerDetails{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", puuid='" + puuid + '\'' +
                ", name='" + name + '\'' +
                ", profileIconId=" + profileIconId +
                ", summonerLevel=" + summonerLevel +
                ", revisionDate=" + revisionDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RiotSummonerDetails that = (RiotSummonerDetails) o;
        return  Objects.equals(id, that.id) &&
                Objects.equals(accountId, that.accountId) &&
                Objects.equals(puuid, that.puuid) &&
                Objects.equals(name, that.name);
    }

}
