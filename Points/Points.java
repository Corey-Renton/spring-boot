package com.example.springboot.Points;

public class Points {

    private int playerid;
    private int points;

    public Points(){

    }


    public Points(int playerid, int points) {
        this.playerid = playerid;
        this.points = points;
    }

    public int getPlayerid() {
        return playerid;
    }

    public void setPlayerid(int playerid) {
        this.playerid = playerid;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}


