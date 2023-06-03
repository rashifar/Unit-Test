package com.example.demo.demo;

public class ScoreKeeper {
    private int scoreTeam1;
    private int scoreTeam2;

    public ScoreKeeper() {
        scoreTeam1 = 0;
        scoreTeam2 = 0;

    };
    public String getScore() {

        return String.format("%03d:%03d", scoreTeam1, scoreTeam2);

    }

   

}
