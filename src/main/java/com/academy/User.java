package com.academy;

public class User {
    public String name;
    public long startTime;
    public long userID;
    public long totalTime;
    public String result;

    public User(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

}
