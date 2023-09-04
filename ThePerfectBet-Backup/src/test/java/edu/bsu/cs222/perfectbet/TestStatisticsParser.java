package edu.bsu.cs222.perfectbet;

import edu.bsu.cs222.perfectbet.Model.StatisticsParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class TestStatisticsParser {
    @Test
    public void testParseHomeNflStatisticsEarly() throws IOException {
        StatisticsParser statisticsParser = new StatisticsParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("footballHomeTestStatistics.json");
        statisticsParser.convertHomeToJSONArray(inputStream);
        ArrayList<String> homeStatsArray = statisticsParser.parseHomeStatistics();

        Assertions.assertTrue(homeStatsArray.toString().contains("3217"));
    }

    @Test
    public void testParseHomeNflStatisticsLate() throws IOException {
        StatisticsParser statisticsParser = new StatisticsParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("footballHomeTestStatistics.json");
        statisticsParser.convertHomeToJSONArray(inputStream);
        ArrayList<String> homeStatsArray = statisticsParser.parseHomeStatistics();

        Assertions.assertTrue(homeStatsArray.toString().contains("60.32"));
    }

    @Test
    public void testParseAwayNflStatisticsEarly() throws IOException {
        StatisticsParser statisticsParser = new StatisticsParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("footballAwayTestStatistics.json");
        statisticsParser.convertAwayToJSONArray(inputStream);
        ArrayList<String> awayStatsArray = statisticsParser.parseAwayStatistics();

        Assertions.assertTrue(awayStatsArray.toString().contains("588.356"));
    }

    @Test
    public void testParseAwayNflStatisticsLate() throws IOException {
        StatisticsParser statisticsParser = new StatisticsParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("footballAwayTestStatistics.json");
        statisticsParser.convertAwayToJSONArray(inputStream);
        ArrayList<String> awayStatsArray = statisticsParser.parseAwayStatistics();

        Assertions.assertTrue(awayStatsArray.toString().contains("23.5"));
    }

    @Test
    public void testParseHomeNbaStatisticsEarly() throws IOException {
        StatisticsParser statisticsParser = new StatisticsParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("basketballHomeTestStatistics.json");
        statisticsParser.convertHomeToJSONArray(inputStream);
        ArrayList<String> homeStatsArray = statisticsParser.parseHomeStatistics();

        Assertions.assertTrue(homeStatsArray.toString().contains("96"));
    }

    @Test
    public void testParseHomeNbaStatisticsLate() throws IOException {
        StatisticsParser statisticsParser = new StatisticsParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("basketballHomeTestStatistics.json");
        statisticsParser.convertHomeToJSONArray(inputStream);
        ArrayList<String> homeStatsArray = statisticsParser.parseHomeStatistics();

        Assertions.assertTrue(homeStatsArray.toString().contains("104.632"));
    }

    @Test
    public void testParseAwayNbaStatisticsEarly() throws IOException {
        StatisticsParser statisticsParser = new StatisticsParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("basketballAwayTestStatistics.json");
        statisticsParser.convertAwayToJSONArray(inputStream);
        ArrayList<String> awayStatsArray = statisticsParser.parseAwayStatistics();

        Assertions.assertTrue(awayStatsArray.toString().contains("8.826087"));
    }

    @Test
    public void testParseAwayNbaStatisticsLate() throws IOException {
        StatisticsParser statisticsParser = new StatisticsParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("basketballAwayTestStatistics.json");
        statisticsParser.convertAwayToJSONArray(inputStream);
        ArrayList<String> awayStatsArray = statisticsParser.parseAwayStatistics();

        Assertions.assertTrue(awayStatsArray.toString().contains("102.295654"));
    }

    @Test
    public void testParseHomeNhlStatisticsEarly() throws IOException {
        StatisticsParser statisticsParser = new StatisticsParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("hockeyHomeTestStatistics.json");
        statisticsParser.convertHomeToJSONArray(inputStream);
        ArrayList<String> homeStatsArray = statisticsParser.parseHomeStatistics();

        Assertions.assertTrue(homeStatsArray.toString().contains("750"));
    }

    @Test
    public void testParseHomeNhlStatisticsLate() throws IOException {
        StatisticsParser statisticsParser = new StatisticsParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("hockeyHomeTestStatistics.json");
        statisticsParser.convertHomeToJSONArray(inputStream);
        ArrayList<String> homeStatsArray = statisticsParser.parseHomeStatistics();

        Assertions.assertTrue(homeStatsArray.toString().contains("694"));
    }

    @Test
    public void testParseAwayNhlStatisticsEarly() throws IOException {
        StatisticsParser statisticsParser = new StatisticsParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("hockeyAwayTestStatistics.json");
        statisticsParser.convertAwayToJSONArray(inputStream);
        ArrayList<String> awayStatsArray = statisticsParser.parseAwayStatistics();

        Assertions.assertTrue(awayStatsArray.toString().contains("417"));
    }

    @Test
    public void testParseAwayNhlStatisticsLate() throws IOException {
        StatisticsParser statisticsParser = new StatisticsParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("hockeyAwayTestStatistics.json");
        statisticsParser.convertAwayToJSONArray(inputStream);
        ArrayList<String> awayStatsArray = statisticsParser.parseAwayStatistics();

        Assertions.assertTrue(awayStatsArray.toString().contains("231"));
    }
}
