package com.example.demo.demo;

import org.junit.jupiter.api.Test;

public class ScoreKeeperTest {

    private ScoreKeeper scoreKeeper;

    @Test

    public void testInitalScore() {

        scoreKeeper = new ScoreKeeper();

        assertEquals("000:000", scoreKeeper.getScore());

    }

}