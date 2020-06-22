package com.unbeatable.riotapi.client.domain;

public class ParticipantStats {
    private int participantId;
    private boolean win;
    private int item0, item1, item2, item3, item4, item5, item6;
    private int kills, deaths, assists, largestKillingSpree, largestMultiKill,
        killingSprees, longestTimeSpentLiving, doubleKills, tripleKills,
        quadraKills, pentaKills, unrealKills, totalDamageDealt, magicDamageDealt,
        physicalDamageDealt, trueDamageDealt, largestCriticalStrike,
        totalDamageDealtToChampions, magicDamageDealtToChampions,
        physicalDamageDealtToChampions, trueDamageDealtToChampions, totalHeal,
        totalUnitsHealed, damageSelfMitigated, damageDealtToObjectives,
        damageDealtToTurrets, visionScore, timeCCingOthers, totalDamageTaken,
        magicalDamageTaken, physicalDamageTaken, trueDamageTaken, goldEarned,
        goldSpent, turretKills, inhibitorKills, totalMinionsKilled, neutralMinionsKilled,
        totalTimeCrowdControlDealt, champLevel, visionWardsBoughtInGame, sightWardsBoughtInGame;

    private boolean firstBloodKill, firstBloodAssist, firstTowerKill, firstTowerAssist, firstInhibitorKill,
        firstInhibitorAssist;

    private int combatPlayerScore, objectivePlayerScore, totalPlayerScore, totalScoreRank,
        playerScore0, playerScore1, playerScore2, playerScore3, playerScore4, playerScore5,
        playerScore6, playerScore7, playerScore8, playerScore9, perk0, perk0Var1, perk0Var2,
        perk0Var3, perk1, perk1Var1, perk1Var2, perk1Var3, perk2, perk2Var1, perk2Var2, perk2Var3,
        perk3, perk3Var1, perk3Var2, perk3Var3, perk4, perk4Var1, perk4Var2, perk4Var3, perk5,
        perk5Var1, perk5Var2, perk5Var3, perkPrimaryStyle, perkSubStyle, statPerk0, statPerk1,
        statPerk2;

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public int getItem0() {
        return item0;
    }

    public void setItem0(int item0) {
        this.item0 = item0;
    }

    public int getItem1() {
        return item1;
    }

    public void setItem1(int item1) {
        this.item1 = item1;
    }

    public int getItem2() {
        return item2;
    }

    public void setItem2(int item2) {
        this.item2 = item2;
    }

    public int getItem3() {
        return item3;
    }

    public void setItem3(int item3) {
        this.item3 = item3;
    }

    public int getItem4() {
        return item4;
    }

    public void setItem4(int item4) {
        this.item4 = item4;
    }

    public int getItem5() {
        return item5;
    }

    public void setItem5(int item5) {
        this.item5 = item5;
    }

    public int getItem6() {
        return item6;
    }

    public void setItem6(int item6) {
        this.item6 = item6;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getLargestKillingSpree() {
        return largestKillingSpree;
    }

    public void setLargestKillingSpree(int largestKillingSpree) {
        this.largestKillingSpree = largestKillingSpree;
    }

    public int getLargestMultiKill() {
        return largestMultiKill;
    }

    public void setLargestMultiKill(int largestMultiKill) {
        this.largestMultiKill = largestMultiKill;
    }

    public int getKillingSprees() {
        return killingSprees;
    }

    public void setKillingSprees(int killingSprees) {
        this.killingSprees = killingSprees;
    }

    public int getLongestTimeSpentLiving() {
        return longestTimeSpentLiving;
    }

    public void setLongestTimeSpentLiving(int longestTimeSpentLiving) {
        this.longestTimeSpentLiving = longestTimeSpentLiving;
    }

    public int getDoubleKills() {
        return doubleKills;
    }

    public void setDoubleKills(int doubleKills) {
        this.doubleKills = doubleKills;
    }

    public int getTripleKills() {
        return tripleKills;
    }

    public void setTripleKills(int tripleKills) {
        this.tripleKills = tripleKills;
    }

    public int getQuadraKills() {
        return quadraKills;
    }

    public void setQuadraKills(int quadraKills) {
        this.quadraKills = quadraKills;
    }

    public int getPentaKills() {
        return pentaKills;
    }

    public void setPentaKills(int pentaKills) {
        this.pentaKills = pentaKills;
    }

    public int getUnrealKills() {
        return unrealKills;
    }

    public void setUnrealKills(int unrealKills) {
        this.unrealKills = unrealKills;
    }

    public int getTotalDamageDealt() {
        return totalDamageDealt;
    }

    public void setTotalDamageDealt(int totalDamageDealt) {
        this.totalDamageDealt = totalDamageDealt;
    }

    public int getMagicDamageDealt() {
        return magicDamageDealt;
    }

    public void setMagicDamageDealt(int magicDamageDealt) {
        this.magicDamageDealt = magicDamageDealt;
    }

    public int getPhysicalDamageDealt() {
        return physicalDamageDealt;
    }

    public void setPhysicalDamageDealt(int physicalDamageDealt) {
        this.physicalDamageDealt = physicalDamageDealt;
    }

    public int getTrueDamageDealt() {
        return trueDamageDealt;
    }

    public void setTrueDamageDealt(int trueDamageDealt) {
        this.trueDamageDealt = trueDamageDealt;
    }

    public int getLargestCriticalStrike() {
        return largestCriticalStrike;
    }

    public void setLargestCriticalStrike(int largestCriticalStrike) {
        this.largestCriticalStrike = largestCriticalStrike;
    }

    public int getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    public void setTotalDamageDealtToChampions(int totalDamageDealtToChampions) {
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
    }

    public int getMagicDamageDealtToChampions() {
        return magicDamageDealtToChampions;
    }

    public void setMagicDamageDealtToChampions(int magicDamageDealtToChampions) {
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
    }

    public int getPhysicalDamageDealtToChampions() {
        return physicalDamageDealtToChampions;
    }

    public void setPhysicalDamageDealtToChampions(int physicalDamageDealtToChampions) {
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
    }

    public int getTrueDamageDealtToChampions() {
        return trueDamageDealtToChampions;
    }

    public void setTrueDamageDealtToChampions(int trueDamageDealtToChampions) {
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
    }

    public int getTotalHeal() {
        return totalHeal;
    }

    public void setTotalHeal(int totalHeal) {
        this.totalHeal = totalHeal;
    }

    public int getTotalUnitsHealed() {
        return totalUnitsHealed;
    }

    public void setTotalUnitsHealed(int totalUnitsHealed) {
        this.totalUnitsHealed = totalUnitsHealed;
    }

    public int getDamageSelfMitigated() {
        return damageSelfMitigated;
    }

    public void setDamageSelfMitigated(int damageSelfMitigated) {
        this.damageSelfMitigated = damageSelfMitigated;
    }

    public int getDamageDealtToObjectives() {
        return damageDealtToObjectives;
    }

    public void setDamageDealtToObjectives(int damageDealtToObjectives) {
        this.damageDealtToObjectives = damageDealtToObjectives;
    }

    public int getDamageDealtToTurrets() {
        return damageDealtToTurrets;
    }

    public void setDamageDealtToTurrets(int damageDealtToTurrets) {
        this.damageDealtToTurrets = damageDealtToTurrets;
    }

    public int getVisionScore() {
        return visionScore;
    }

    public void setVisionScore(int visionScore) {
        this.visionScore = visionScore;
    }

    public int getTimeCCingOthers() {
        return timeCCingOthers;
    }

    public void setTimeCCingOthers(int timeCCingOthers) {
        this.timeCCingOthers = timeCCingOthers;
    }

    public int getTotalDamageTaken() {
        return totalDamageTaken;
    }

    public void setTotalDamageTaken(int totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
    }

    public int getMagicalDamageTaken() {
        return magicalDamageTaken;
    }

    public void setMagicalDamageTaken(int magicalDamageTaken) {
        this.magicalDamageTaken = magicalDamageTaken;
    }

    public int getPhysicalDamageTaken() {
        return physicalDamageTaken;
    }

    public void setPhysicalDamageTaken(int physicalDamageTaken) {
        this.physicalDamageTaken = physicalDamageTaken;
    }

    public int getTrueDamageTaken() {
        return trueDamageTaken;
    }

    public void setTrueDamageTaken(int trueDamageTaken) {
        this.trueDamageTaken = trueDamageTaken;
    }

    public int getGoldEarned() {
        return goldEarned;
    }

    public void setGoldEarned(int goldEarned) {
        this.goldEarned = goldEarned;
    }

    public int getGoldSpent() {
        return goldSpent;
    }

    public void setGoldSpent(int goldSpent) {
        this.goldSpent = goldSpent;
    }

    public int getTurretKills() {
        return turretKills;
    }

    public void setTurretKills(int turretKills) {
        this.turretKills = turretKills;
    }

    public int getInhibitorKills() {
        return inhibitorKills;
    }

    public void setInhibitorKills(int inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public int getTotalMinionsKilled() {
        return totalMinionsKilled;
    }

    public void setTotalMinionsKilled(int totalMinionsKilled) {
        this.totalMinionsKilled = totalMinionsKilled;
    }

    public int getNeutralMinionsKilled() {
        return neutralMinionsKilled;
    }

    public void setNeutralMinionsKilled(int neutralMinionsKilled) {
        this.neutralMinionsKilled = neutralMinionsKilled;
    }

    public int getTotalTimeCrowdControlDealt() {
        return totalTimeCrowdControlDealt;
    }

    public void setTotalTimeCrowdControlDealt(int totalTimeCrowdControlDealt) {
        this.totalTimeCrowdControlDealt = totalTimeCrowdControlDealt;
    }

    public int getChampLevel() {
        return champLevel;
    }

    public void setChampLevel(int champLevel) {
        this.champLevel = champLevel;
    }

    public int getVisionWardsBoughtInGame() {
        return visionWardsBoughtInGame;
    }

    public void setVisionWardsBoughtInGame(int visionWardsBoughtInGame) {
        this.visionWardsBoughtInGame = visionWardsBoughtInGame;
    }

    public int getSightWardsBoughtInGame() {
        return sightWardsBoughtInGame;
    }

    public void setSightWardsBoughtInGame(int sightWardsBoughtInGame) {
        this.sightWardsBoughtInGame = sightWardsBoughtInGame;
    }

    public boolean isFirstBloodKill() {
        return firstBloodKill;
    }

    public void setFirstBloodKill(boolean firstBloodKill) {
        this.firstBloodKill = firstBloodKill;
    }

    public boolean isFirstBloodAssist() {
        return firstBloodAssist;
    }

    public void setFirstBloodAssist(boolean firstBloodAssist) {
        this.firstBloodAssist = firstBloodAssist;
    }

    public boolean isFirstTowerKill() {
        return firstTowerKill;
    }

    public void setFirstTowerKill(boolean firstTowerKill) {
        this.firstTowerKill = firstTowerKill;
    }

    public boolean isFirstTowerAssist() {
        return firstTowerAssist;
    }

    public void setFirstTowerAssist(boolean firstTowerAssist) {
        this.firstTowerAssist = firstTowerAssist;
    }

    public boolean isFirstInhibitorKill() {
        return firstInhibitorKill;
    }

    public void setFirstInhibitorKill(boolean firstInhibitorKill) {
        this.firstInhibitorKill = firstInhibitorKill;
    }

    public boolean isFirstInhibitorAssist() {
        return firstInhibitorAssist;
    }

    public void setFirstInhibitorAssist(boolean firstInhibitorAssist) {
        this.firstInhibitorAssist = firstInhibitorAssist;
    }

    public int getCombatPlayerScore() {
        return combatPlayerScore;
    }

    public void setCombatPlayerScore(int combatPlayerScore) {
        this.combatPlayerScore = combatPlayerScore;
    }

    public int getObjectivePlayerScore() {
        return objectivePlayerScore;
    }

    public void setObjectivePlayerScore(int objectivePlayerScore) {
        this.objectivePlayerScore = objectivePlayerScore;
    }

    public int getTotalPlayerScore() {
        return totalPlayerScore;
    }

    public void setTotalPlayerScore(int totalPlayerScore) {
        this.totalPlayerScore = totalPlayerScore;
    }

    public int getTotalScoreRank() {
        return totalScoreRank;
    }

    public void setTotalScoreRank(int totalScoreRank) {
        this.totalScoreRank = totalScoreRank;
    }

    public int getPlayerScore0() {
        return playerScore0;
    }

    public void setPlayerScore0(int playerScore0) {
        this.playerScore0 = playerScore0;
    }

    public int getPlayerScore1() {
        return playerScore1;
    }

    public void setPlayerScore1(int playerScore1) {
        this.playerScore1 = playerScore1;
    }

    public int getPlayerScore2() {
        return playerScore2;
    }

    public void setPlayerScore2(int playerScore2) {
        this.playerScore2 = playerScore2;
    }

    public int getPlayerScore3() {
        return playerScore3;
    }

    public void setPlayerScore3(int playerScore3) {
        this.playerScore3 = playerScore3;
    }

    public int getPlayerScore4() {
        return playerScore4;
    }

    public void setPlayerScore4(int playerScore4) {
        this.playerScore4 = playerScore4;
    }

    public int getPlayerScore5() {
        return playerScore5;
    }

    public void setPlayerScore5(int playerScore5) {
        this.playerScore5 = playerScore5;
    }

    public int getPlayerScore6() {
        return playerScore6;
    }

    public void setPlayerScore6(int playerScore6) {
        this.playerScore6 = playerScore6;
    }

    public int getPlayerScore7() {
        return playerScore7;
    }

    public void setPlayerScore7(int playerScore7) {
        this.playerScore7 = playerScore7;
    }

    public int getPlayerScore8() {
        return playerScore8;
    }

    public void setPlayerScore8(int playerScore8) {
        this.playerScore8 = playerScore8;
    }

    public int getPlayerScore9() {
        return playerScore9;
    }

    public void setPlayerScore9(int playerScore9) {
        this.playerScore9 = playerScore9;
    }

    public int getPerk0() {
        return perk0;
    }

    public void setPerk0(int perk0) {
        this.perk0 = perk0;
    }

    public int getPerk0Var1() {
        return perk0Var1;
    }

    public void setPerk0Var1(int perk0Var1) {
        this.perk0Var1 = perk0Var1;
    }

    public int getPerk0Var2() {
        return perk0Var2;
    }

    public void setPerk0Var2(int perk0Var2) {
        this.perk0Var2 = perk0Var2;
    }

    public int getPerk0Var3() {
        return perk0Var3;
    }

    public void setPerk0Var3(int perk0Var3) {
        this.perk0Var3 = perk0Var3;
    }

    public int getPerk1() {
        return perk1;
    }

    public void setPerk1(int perk1) {
        this.perk1 = perk1;
    }

    public int getPerk1Var1() {
        return perk1Var1;
    }

    public void setPerk1Var1(int perk1Var1) {
        this.perk1Var1 = perk1Var1;
    }

    public int getPerk1Var2() {
        return perk1Var2;
    }

    public void setPerk1Var2(int perk1Var2) {
        this.perk1Var2 = perk1Var2;
    }

    public int getPerk1Var3() {
        return perk1Var3;
    }

    public void setPerk1Var3(int perk1Var3) {
        this.perk1Var3 = perk1Var3;
    }

    public int getPerk2() {
        return perk2;
    }

    public void setPerk2(int perk2) {
        this.perk2 = perk2;
    }

    public int getPerk2Var1() {
        return perk2Var1;
    }

    public void setPerk2Var1(int perk2Var1) {
        this.perk2Var1 = perk2Var1;
    }

    public int getPerk2Var2() {
        return perk2Var2;
    }

    public void setPerk2Var2(int perk2Var2) {
        this.perk2Var2 = perk2Var2;
    }

    public int getPerk2Var3() {
        return perk2Var3;
    }

    public void setPerk2Var3(int perk2Var3) {
        this.perk2Var3 = perk2Var3;
    }

    public int getPerk3() {
        return perk3;
    }

    public void setPerk3(int perk3) {
        this.perk3 = perk3;
    }

    public int getPerk3Var1() {
        return perk3Var1;
    }

    public void setPerk3Var1(int perk3Var1) {
        this.perk3Var1 = perk3Var1;
    }

    public int getPerk3Var2() {
        return perk3Var2;
    }

    public void setPerk3Var2(int perk3Var2) {
        this.perk3Var2 = perk3Var2;
    }

    public int getPerk3Var3() {
        return perk3Var3;
    }

    public void setPerk3Var3(int perk3Var3) {
        this.perk3Var3 = perk3Var3;
    }

    public int getPerk4() {
        return perk4;
    }

    public void setPerk4(int perk4) {
        this.perk4 = perk4;
    }

    public int getPerk4Var1() {
        return perk4Var1;
    }

    public void setPerk4Var1(int perk4Var1) {
        this.perk4Var1 = perk4Var1;
    }

    public int getPerk4Var2() {
        return perk4Var2;
    }

    public void setPerk4Var2(int perk4Var2) {
        this.perk4Var2 = perk4Var2;
    }

    public int getPerk4Var3() {
        return perk4Var3;
    }

    public void setPerk4Var3(int perk4Var3) {
        this.perk4Var3 = perk4Var3;
    }

    public int getPerk5() {
        return perk5;
    }

    public void setPerk5(int perk5) {
        this.perk5 = perk5;
    }

    public int getPerk5Var1() {
        return perk5Var1;
    }

    public void setPerk5Var1(int perk5Var1) {
        this.perk5Var1 = perk5Var1;
    }

    public int getPerk5Var2() {
        return perk5Var2;
    }

    public void setPerk5Var2(int perk5Var2) {
        this.perk5Var2 = perk5Var2;
    }

    public int getPerk5Var3() {
        return perk5Var3;
    }

    public void setPerk5Var3(int perk5Var3) {
        this.perk5Var3 = perk5Var3;
    }

    public int getPerkPrimaryStyle() {
        return perkPrimaryStyle;
    }

    public void setPerkPrimaryStyle(int perkPrimaryStyle) {
        this.perkPrimaryStyle = perkPrimaryStyle;
    }

    public int getPerkSubStyle() {
        return perkSubStyle;
    }

    public void setPerkSubStyle(int perkSubStyle) {
        this.perkSubStyle = perkSubStyle;
    }

    public int getStatPerk0() {
        return statPerk0;
    }

    public void setStatPerk0(int statPerk0) {
        this.statPerk0 = statPerk0;
    }

    public int getStatPerk1() {
        return statPerk1;
    }

    public void setStatPerk1(int statPerk1) {
        this.statPerk1 = statPerk1;
    }

    public int getStatPerk2() {
        return statPerk2;
    }

    public void setStatPerk2(int statPerk2) {
        this.statPerk2 = statPerk2;
    }

    @Override
    public String toString() {
        return "ParticipantStats{" +
                "participantId=" + participantId +
                ", win=" + win +
                ", item0=" + item0 +
                ", item1=" + item1 +
                ", item2=" + item2 +
                ", item3=" + item3 +
                ", item4=" + item4 +
                ", item5=" + item5 +
                ", item6=" + item6 +
                ", kills=" + kills +
                ", deaths=" + deaths +
                ", assists=" + assists +
                ", largestKillingSpree=" + largestKillingSpree +
                ", largestMultiKill=" + largestMultiKill +
                ", killingSprees=" + killingSprees +
                ", longestTimeSpentLiving=" + longestTimeSpentLiving +
                ", doubleKills=" + doubleKills +
                ", tripleKills=" + tripleKills +
                ", quadraKills=" + quadraKills +
                ", pentaKills=" + pentaKills +
                ", unrealKills=" + unrealKills +
                ", totalDamageDealt=" + totalDamageDealt +
                ", magicDamageDealt=" + magicDamageDealt +
                ", physicalDamageDealt=" + physicalDamageDealt +
                ", trueDamageDealt=" + trueDamageDealt +
                ", largestCriticalStrike=" + largestCriticalStrike +
                ", totalDamageDealtToChampions=" + totalDamageDealtToChampions +
                ", magicDamageDealtToChampions=" + magicDamageDealtToChampions +
                ", physicalDamageDealtToChampions=" + physicalDamageDealtToChampions +
                ", trueDamageDealtToChampions=" + trueDamageDealtToChampions +
                ", totalHeal=" + totalHeal +
                ", totalUnitsHealed=" + totalUnitsHealed +
                ", damageSelfMitigated=" + damageSelfMitigated +
                ", damageDealtToObjectives=" + damageDealtToObjectives +
                ", damageDealtToTurrets=" + damageDealtToTurrets +
                ", visionScore=" + visionScore +
                ", timeCCingOthers=" + timeCCingOthers +
                ", totalDamageTaken=" + totalDamageTaken +
                ", magicalDamageTaken=" + magicalDamageTaken +
                ", physicalDamageTaken=" + physicalDamageTaken +
                ", trueDamageTaken=" + trueDamageTaken +
                ", goldEarned=" + goldEarned +
                ", goldSpent=" + goldSpent +
                ", turretKills=" + turretKills +
                ", inhibitorKills=" + inhibitorKills +
                ", totalMinionsKilled=" + totalMinionsKilled +
                ", neutralMinionsKilled=" + neutralMinionsKilled +
                ", totalTimeCrowdControlDealt=" + totalTimeCrowdControlDealt +
                ", champLevel=" + champLevel +
                ", visionWardsBoughtInGame=" + visionWardsBoughtInGame +
                ", sightWardsBoughtInGame=" + sightWardsBoughtInGame +
                ", firstBloodKill=" + firstBloodKill +
                ", firstBloodAssist=" + firstBloodAssist +
                ", firstTowerKill=" + firstTowerKill +
                ", firstTowerAssist=" + firstTowerAssist +
                ", firstInhibitorKill=" + firstInhibitorKill +
                ", firstInhibitorAssist=" + firstInhibitorAssist +
                ", combatPlayerScore=" + combatPlayerScore +
                ", objectivePlayerScore=" + objectivePlayerScore +
                ", totalPlayerScore=" + totalPlayerScore +
                ", totalScoreRank=" + totalScoreRank +
                ", playerScore0=" + playerScore0 +
                ", playerScore1=" + playerScore1 +
                ", playerScore2=" + playerScore2 +
                ", playerScore3=" + playerScore3 +
                ", playerScore4=" + playerScore4 +
                ", playerScore5=" + playerScore5 +
                ", playerScore6=" + playerScore6 +
                ", playerScore7=" + playerScore7 +
                ", playerScore8=" + playerScore8 +
                ", playerScore9=" + playerScore9 +
                ", perk0=" + perk0 +
                ", perk0Var1=" + perk0Var1 +
                ", perk0Var2=" + perk0Var2 +
                ", perk0Var3=" + perk0Var3 +
                ", perk1=" + perk1 +
                ", perk1Var1=" + perk1Var1 +
                ", perk1Var2=" + perk1Var2 +
                ", perk1Var3=" + perk1Var3 +
                ", perk2=" + perk2 +
                ", perk2Var1=" + perk2Var1 +
                ", perk2Var2=" + perk2Var2 +
                ", perk2Var3=" + perk2Var3 +
                ", perk3=" + perk3 +
                ", perk3Var1=" + perk3Var1 +
                ", perk3Var2=" + perk3Var2 +
                ", perk3Var3=" + perk3Var3 +
                ", perk4=" + perk4 +
                ", perk4Var1=" + perk4Var1 +
                ", perk4Var2=" + perk4Var2 +
                ", perk4Var3=" + perk4Var3 +
                ", perk5=" + perk5 +
                ", perk5Var1=" + perk5Var1 +
                ", perk5Var2=" + perk5Var2 +
                ", perk5Var3=" + perk5Var3 +
                ", perkPrimaryStyle=" + perkPrimaryStyle +
                ", perkSubStyle=" + perkSubStyle +
                ", statPerk0=" + statPerk0 +
                ", statPerk1=" + statPerk1 +
                ", statPerk2=" + statPerk2 +
                '}';
    }
}
