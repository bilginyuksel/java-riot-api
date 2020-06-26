package com.unbeatable.riotapi.client.impl;

public class RiotClientApiCounterService {

    protected static final int tenMinuteLimit = 30000;
    protected static final int tenSecondLimit = 500;
    private static int generalApiCount = 0;
    private static int tenMinuteApiCount = 0;
    private static int tenSecondApiCount = 0;

    public static final int getGeneralApiCount(){
        return generalApiCount;
    }

    public static final int getTenMinuteApiCount() {
        return tenMinuteApiCount;
    }

    public static final int getTenSecondApiCount() {
        return tenSecondApiCount;
    }

    protected static void makeRiotApiCall(){
        generalApiCount++;
        tenMinuteApiCount++;
        tenSecondApiCount++;
    }
}
