package com.example.demo.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScoreKeeperTest {

    private ScoreKeeper scoreKeeper;

    @BeforeEach

    public void setUp() {

        scoreKeeper = new ScoreKeeper();

    }
    @Test
    public void testInitalScore() {

        scoreKeeper = new ScoreKeeper();

        assertEquals("000:000", scoreKeeper.getScore());
    }
    @Test
    public void testScoreTeam11() {
        scoreKeeper.scoreTeam11();
        assertEquals("001:000", scoreKeeper.getScore());
    }
    @Test
    public void testScoreTeam12() {
        scoreKeeper.scoreTeam12();
        assertEquals("002:000", scoreKeeper.getScore());
    }
    @Test
    public void testScoreTeam13() {
        scoreKeeper.scoreTeam13();
        assertEquals("003:000", scoreKeeper.getScore());

    }
}