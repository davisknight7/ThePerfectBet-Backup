package edu.bsu.cs222.perfectbet;

import edu.bsu.cs222.perfectbet.Model.StatisticLabels;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestStatisticsLabels {
    @Test
    public void testSetNflLabelsFirst() {
        StatisticLabels statisticLabels = new StatisticLabels();
        ArrayList<String> nflLabels = statisticLabels.setNflLabels();

        Assertions.assertTrue(nflLabels.contains("Completions"));
    }

    @Test
    public void testSetNflLabelsMiddle() {
        StatisticLabels statisticLabels = new StatisticLabels();
        ArrayList<String> nflLabels = statisticLabels.setNflLabels();

        Assertions.assertTrue(nflLabels.contains("Redzone Scoring Pct"));
    }

    @Test
    public void testSetNflLabelsLast() {
        StatisticLabels statisticLabels = new StatisticLabels();
        ArrayList<String> nflLabels = statisticLabels.setNflLabels();

        Assertions.assertTrue(nflLabels.contains("Passes Defended"));
    }

    @Test
    public void testSetNbaLabelsFirst() {
        StatisticLabels statisticLabels = new StatisticLabels();
        ArrayList<String> nbaLabels = statisticLabels.setNbaLabels();

        Assertions.assertTrue(nbaLabels.contains("Blocks"));
    }

    @Test
    public void testSetNbaLabelsMiddle() {
        StatisticLabels statisticLabels = new StatisticLabels();
        ArrayList<String> nbaLabels = statisticLabels.setNbaLabels();

        Assertions.assertTrue(nbaLabels.contains("Free Throw Pct"));
    }

    @Test
    public void testSetNbaLabelsLast() {
        StatisticLabels statisticLabels = new StatisticLabels();
        ArrayList<String> nbaLabels = statisticLabels.setNbaLabels();

        Assertions.assertTrue(nbaLabels.contains("2-Point Field Goal Pct"));
    }

    @Test
    public void testSetNhlLabelsFirst() {
        StatisticLabels statisticLabels = new StatisticLabels();
        ArrayList<String> nhlLabels = statisticLabels.setNhlLabels();

        Assertions.assertTrue(nhlLabels.contains("Goals"));
    }

    @Test
    public void testSetNhlLabelsMiddle() {
        StatisticLabels statisticLabels = new StatisticLabels();
        ArrayList<String> nhlLabels = statisticLabels.setNhlLabels();

        Assertions.assertTrue(nhlLabels.contains("Faceoff Win Percent"));
    }

    @Test
    public void testSetNhlLabelsLast() {
        StatisticLabels statisticLabels = new StatisticLabels();
        ArrayList<String> nhlLabels = statisticLabels.setNhlLabels();

        Assertions.assertTrue(nhlLabels.contains("Losses"));
    }

}
