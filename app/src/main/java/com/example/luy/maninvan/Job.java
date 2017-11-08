package com.example.luy.maninvan;

import java.sql.Time;

/**
 * Created by Lulalulali on 11/8/17.
 */

public class Job {
    private User user;
    private boolean isRequest;
    private int movingRoom = 0;
    private Time startTime;
    private Time endTime;
    private double price = 0;
    private String description  ="";


    public Job(User user, int movingRoom, Time startTime, Time endTime, double price, String description) {
        this.user = user;
        this.isRequest = this.user.isRequester;
        this.movingRoom = movingRoom;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
        this.description = description;
    }

}

