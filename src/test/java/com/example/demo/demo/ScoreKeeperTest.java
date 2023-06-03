package com.example.demo.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ScoreKeeperTest {
    private ScoreKeeper scoreKeeper;

    @Test
    public void testInitalScore() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        assertEquals("000:000", scoreKeeper.getScore());

    }

    @Test
    public void testScoreTeamA1() {
        scoreKeeper.testScoreTeamA1();
        assertEquals("001:000", scoreKeeper.getScore());

    }

    @Test
    public void testScoreTeamA2() {
        scoreKeeper.testScoreTeamA2();
        assertEquals("002:000", scoreKeeper.getScore());

    }

    @Test
    public void testScoreTeamA3() {
        scoreKeeper.testScoreTeamA3();
        assertEquals("003:000", scoreKeeper.getScore());

    }

}
