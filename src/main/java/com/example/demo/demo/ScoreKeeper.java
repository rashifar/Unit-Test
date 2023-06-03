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
    public void scoreTeam11() {
        scoreTeam1 += 1;

    }
    public void scoreTeam12() {

        scoreTeam1 += 2;

    }

    public void scoreTeam13() {

        scoreTeam1 += 3;

    }

}
