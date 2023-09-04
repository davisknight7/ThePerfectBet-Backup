package edu.bsu.cs222.perfectbet;

import edu.bsu.cs222.perfectbet.Controller.MainController;
import edu.bsu.cs222.perfectbet.Model.StatisticsCompiler;
import edu.bsu.cs222.perfectbet.Model.StatisticsParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

public class TestStatisticsCompiler {
    @Test
    public void testGetDefaultStatsFootballHomeTeamFirstStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        StatisticsParser statisticsParser = new StatisticsParser();
        ArrayList<String> defaultStatsList;
        MainController.userSelection = "Football";
        statisticsParser.convertHomeToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("footballHomeTestStatistics.json"));

        defaultStatsList = statisticsCompiler.getDefaultStats("home");

        Assertions.assertTrue(defaultStatsList.contains("Total Completions: 260.0"));
    }

    @Test
    public void testGetDefaultStatsFootballHomeTeamLastStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        StatisticsParser statisticsParser = new StatisticsParser();
        ArrayList<String> defaultStatsList;
        MainController.userSelection = "Football";
        statisticsParser.convertHomeToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("footballHomeTestStatistics.json"));

        defaultStatsList = statisticsCompiler.getDefaultStats("home");

        Assertions.assertTrue(defaultStatsList.contains("Average Rushing Yards: 60.667"));
    }

    @Test
    public void testGetDefaultStatsFootballAwayTeamFirstStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        StatisticsParser statisticsParser = new StatisticsParser();
        ArrayList<String> defaultStatsList;
        MainController.userSelection = "Football";
        statisticsParser.convertAwayToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("footballAwayTestStatistics.json"));

        defaultStatsList = statisticsCompiler.getDefaultStats("away");

        Assertions.assertTrue(defaultStatsList.contains("Total Completions: 252.0"));
    }

    @Test
    public void testGetDefaultStatsFootballAwayTeamLastStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        StatisticsParser statisticsParser = new StatisticsParser();
        ArrayList<String> defaultStatsList;
        MainController.userSelection = "Football";
        statisticsParser.convertAwayToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("footballAwayTestStatistics.json"));

        defaultStatsList = statisticsCompiler.getDefaultStats("away");

        Assertions.assertTrue(defaultStatsList.contains("Average Rushing Yards: 124.083"));
    }

    @Test
    public void testGetDefaultStatsBasketballHomeTeamFirstStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        StatisticsParser statisticsParser = new StatisticsParser();
        ArrayList<String> defaultStatsList;
        MainController.userSelection = "Basketball";
        statisticsParser.convertHomeToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("basketballHomeTestStatistics.json"));

        defaultStatsList = statisticsCompiler.getDefaultStats("home");

        Assertions.assertTrue(defaultStatsList.contains("Total Blocks: 62.0"));
    }

    @Test
    public void testGetDefaultStatsBasketballHomeTeamLastStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        StatisticsParser statisticsParser = new StatisticsParser();
        ArrayList<String> defaultStatsList;
        MainController.userSelection = "Basketball";
        statisticsParser.convertHomeToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("basketballHomeTestStatistics.json"));

        defaultStatsList = statisticsCompiler.getDefaultStats("home");

        Assertions.assertTrue(defaultStatsList.contains("Total Points: 1299.0"));
    }

    @Test
    public void testGetDefaultStatsBasketballAwayTeamFirstStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        StatisticsParser statisticsParser = new StatisticsParser();
        ArrayList<String> defaultStatsList;
        MainController.userSelection = "Basketball";
        statisticsParser.convertAwayToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("basketballAwayTestStatistics.json"));

        defaultStatsList = statisticsCompiler.getDefaultStats("away");

        Assertions.assertTrue(defaultStatsList.contains("Total Blocks: 103.0"));
    }

    @Test
    public void testGetDefaultStatsBasketballAwayTeamLastStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        StatisticsParser statisticsParser = new StatisticsParser();
        ArrayList<String> defaultStatsList;
        MainController.userSelection = "Basketball";
        statisticsParser.convertAwayToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("basketballAwayTestStatistics.json"));

        defaultStatsList = statisticsCompiler.getDefaultStats("away");

        Assertions.assertTrue(defaultStatsList.contains("Total Points: 2697.0"));
    }

    @Test
    public void testGetDefaultStatsHockeyHomeTeamFirstStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        StatisticsParser statisticsParser = new StatisticsParser();
        ArrayList<String> defaultStatsList;
        MainController.userSelection = "Hockey";
        statisticsParser.convertHomeToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("hockeyHomeTestStatistics.json"));

        defaultStatsList = statisticsCompiler.getDefaultStats("home");

        Assertions.assertTrue(defaultStatsList.contains("Average Goals: 3.08"));
    }

    @Test
    public void testGetDefaultStatsHockeyHomeTeamLastStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        StatisticsParser statisticsParser = new StatisticsParser();
        ArrayList<String> defaultStatsList;
        MainController.userSelection = "Hockey";
        statisticsParser.convertHomeToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("hockeyHomeTestStatistics.json"));

        defaultStatsList = statisticsCompiler.getDefaultStats("home");

        Assertions.assertTrue(defaultStatsList.contains("Average Points per Game: 8.16"));
    }

    @Test
    public void testGetDefaultStatsHockeyAwayTeamFirstStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        StatisticsParser statisticsParser = new StatisticsParser();
        ArrayList<String> defaultStatsList;
        MainController.userSelection = "Hockey";
        statisticsParser.convertAwayToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("hockeyAwayTestStatistics.json"));

        defaultStatsList = statisticsCompiler.getDefaultStats("away");

        Assertions.assertTrue(defaultStatsList.contains("Average Goals: 3.074074074074074"));
    }

    @Test
    public void testGetDefaultStatsHockeyAwayTeamLastStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        StatisticsParser statisticsParser = new StatisticsParser();
        ArrayList<String> defaultStatsList;
        MainController.userSelection = "Hockey";
        statisticsParser.convertAwayToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("hockeyAwayTestStatistics.json"));

        defaultStatsList = statisticsCompiler.getDefaultStats("away");

        Assertions.assertTrue(defaultStatsList.contains("Average Points per Game: 8.666666666666666"));
    }

    @Test
    public void testGetStatsByTeamHomeFootballEarlyStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        ArrayList<String> statsList;
        StatisticsParser statisticsParser = new StatisticsParser();
        statisticsParser.convertHomeToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("footballHomeTestStatistics.json"));

        statsList = statisticsCompiler.getStatsByTeam("home");

        Assertions.assertTrue(statsList.toString().contains("65.327"));
    }

    @Test
    public void testGetStatsByTeamHomeFootballLateStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        ArrayList<String> statsList;
        StatisticsParser statisticsParser = new StatisticsParser();
        statisticsParser.convertHomeToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("footballHomeTestStatistics.json"));

        statsList = statisticsCompiler.getStatsByTeam("home");

        Assertions.assertTrue(statsList.toString().contains("60.667"));
    }

    @Test
    public void testGetStatsByTeamAwayFootballEarlyStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        ArrayList<String> statsList;
        StatisticsParser statisticsParser = new StatisticsParser();
        statisticsParser.convertAwayToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("footballAwayTestStatistics.json"));

        statsList = statisticsCompiler.getStatsByTeam("away");

        Assertions.assertTrue(statsList.toString().contains("12"));

    }

    @Test
    public void testGetStatsByTeamAwayFootballLateStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        ArrayList<String> statsList;
        StatisticsParser statisticsParser = new StatisticsParser();
        statisticsParser.convertAwayToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("footballAwayTestStatistics.json"));

        statsList = statisticsCompiler.getStatsByTeam("away");

        Assertions.assertTrue(statsList.toString().contains("206"));

    }

    @Test
    public void testGetStatsByTeamHomeBasketballEarlyStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        ArrayList<String> statsList;
        StatisticsParser statisticsParser = new StatisticsParser();
        statisticsParser.convertHomeToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("basketballHomeTestStatistics.json"));

        statsList = statisticsCompiler.getStatsByTeam("home");

        Assertions.assertTrue(statsList.toString().contains("44.583332"));
    }

    @Test
    public void testGetStatsByTeamHomeBasketballLateStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        ArrayList<String> statsList;
        StatisticsParser statisticsParser = new StatisticsParser();
        statisticsParser.convertHomeToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("basketballHomeTestStatistics.json"));

        statsList = statisticsCompiler.getStatsByTeam("home");

        Assertions.assertTrue(statsList.toString().contains("30.916666"));
    }

    @Test
    public void testGetStatsByTeamAwayBasketballEarlyStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        ArrayList<String> statsList;
        StatisticsParser statisticsParser = new StatisticsParser();
        statisticsParser.convertAwayToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("basketballAwayTestStatistics.json"));

        statsList = statisticsCompiler.getStatsByTeam("away");

        Assertions.assertTrue(statsList.toString().contains("19.608696"));
    }

    @Test
    public void testGetStatsByTeamAwayBasketballLateStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        ArrayList<String> statsList;
        StatisticsParser statisticsParser = new StatisticsParser();
        statisticsParser.convertAwayToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("basketballAwayTestStatistics.json"));

        statsList = statisticsCompiler.getStatsByTeam("away");

        Assertions.assertTrue(statsList.toString().contains("1346.0"));
    }

    @Test
    public void testGetStatsByTeamHomeHockeyEarlyStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        ArrayList<String> statsList;
        StatisticsParser statisticsParser = new StatisticsParser();
        statisticsParser.convertHomeToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("hockeyHomeTestStatistics.json"));

        statsList = statisticsCompiler.getStatsByTeam("home");

        Assertions.assertTrue(statsList.toString().contains("751.0"));
    }

    @Test
    public void testGetStatsByTeamHomeHockeyLateStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        ArrayList<String> statsList;
        StatisticsParser statisticsParser = new StatisticsParser();
        statisticsParser.convertHomeToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("hockeyHomeTestStatistics.json"));

        statsList = statisticsCompiler.getStatsByTeam("home");

        Assertions.assertTrue(statsList.toString().contains("53.733"));
    }

    @Test
    public void testGetStatsByTeamAwayHockeyEarlyStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        ArrayList<String> statsList;
        StatisticsParser statisticsParser = new StatisticsParser();
        statisticsParser.convertAwayToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("hockeyAwayTestStatistics.json"));

        statsList = statisticsCompiler.getStatsByTeam("away");

        Assertions.assertTrue(statsList.toString().contains("115.0"));
    }

    @Test
    public void testGetStatsByTeamAwayHockeyLateStat() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        ArrayList<String> statsList;
        StatisticsParser statisticsParser = new StatisticsParser();
        statisticsParser.convertAwayToJSONArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("hockeyAwayTestStatistics.json"));

        statsList = statisticsCompiler.getStatsByTeam("away");

        Assertions.assertTrue(statsList.toString().contains("9.988"));
    }

    @Test
    public void testGetCompiledStatsFootball() {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        String compiledStats;
        ArrayList<String> stats = new ArrayList<>();
        stats.add("Total Completions: 232.0");
        stats.add("Total Interceptions: 5.0");
        stats.add("Average Passing Yards: 254.423");
        stats.add("Average Rushing Yards: 73.992");

        compiledStats = statisticsCompiler.getCompiledStats(stats);

        Assertions.assertEquals("\nTotal Completions: 232.0\nTotal Interceptions: 5.0\nAverage Passing Yards: 254.423\nAverage Rushing Yards: 73.992", compiledStats);
    }

    @Test
    public void testGetCompiledStatsBasketball() {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        String compiledStats;
        ArrayList<String> stats = new ArrayList<>();
        stats.add("Total Blocks: 55.0");
        stats.add("Total Steals: 76.0");
        stats.add("Free Throw Pct: 0.812");
        stats.add("Total Points: 2290.0");

        compiledStats = statisticsCompiler.getCompiledStats(stats);

        Assertions.assertEquals("\nTotal Blocks: 55.0\nTotal Steals: 76.0\nFree Throw Pct: 0.812\nTotal Points: 2290.0", compiledStats);
    }

    @Test
    public void testGetCompiledStatsHockey() {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();
        String compiledStats;
        ArrayList<String> stats = new ArrayList<>();
        stats.add("Average Goals: 4.1123");
        stats.add("Total Wins: 11.0");
        stats.add("Total Assists: 299.0");
        stats.add("Average Points per Game: 2.3");

        compiledStats = statisticsCompiler.getCompiledStats(stats);

        Assertions.assertEquals("\nAverage Goals: 4.1123\nTotal Wins: 11.0\nTotal Assists: 299.0\nAverage Points per Game: 2.3", compiledStats);
    }
}


