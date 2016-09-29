package com.academy;

public class User {
    public String name;
    public long startTime;
    public long userID;

    public User(String name) {
        this.name = name;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
}
