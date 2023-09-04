package edu.bsu.cs222.perfectbet;

import edu.bsu.cs222.perfectbet.Model.GameParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class TestGameParser {

    @Test
    public void testGetHomeTeamsValidFootballEarly() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestFootball.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> homeTeamArray = gameParser.getHomeTeams();

        Assertions.assertTrue(homeTeamArray.toString().contains("Arizona Cardinals"));
    }

    @Test
    public void testGetHomeTeamsValidFootballLate() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestFootball.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> homeTeamArray = gameParser.getHomeTeams();

        Assertions.assertTrue(homeTeamArray.toString().contains("Miami Dolphins"));
    }

    @Test
    public void testGetHomeTeamsInvalidFootball() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestFootball.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> homeTeamArray = gameParser.getHomeTeams();

        Assertions.assertFalse(homeTeamArray.toString().contains("New Orleans Saints"));
    }

    @Test
    public void testGetAwayTeamsValidFootballEarly() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestFootball.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> awayTeamArray = gameParser.getAwayTeams();

        Assertions.assertTrue(awayTeamArray.toString().contains("New Orleans Saints"));
    }

    @Test
    public void testGetAwayTeamsValidFootballLate() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestFootball.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> awayTeamArray = gameParser.getAwayTeams();

        Assertions.assertTrue(awayTeamArray.toString().contains("Pittsburgh Steelers"));
    }

    @Test
    public void testGetAwayTeamsInvalidFootball() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestFootball.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> awayTeamArray = gameParser.getAwayTeams();

        Assertions.assertFalse(awayTeamArray.toString().contains("Tennessee Titans"));
    }

    @Test
    public void testGetGameIdsValidFootballEarly() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestFootball.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> gameIds = gameParser.getGameIds();

        Assertions.assertTrue(gameIds.toString().contains("1e523b23bc0124e5070f45f0dbb7efd7"));
    }

    @Test
    public void testGetGameIdsValidFootballLate() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestFootball.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> gameIds = gameParser.getGameIds();

        Assertions.assertTrue(gameIds.toString().contains("30272db12fa482482ce72e0b25aa157b"));
    }

    @Test
    public void testGetGameIdsInvalidFootball() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestFootball.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> gameIds = gameParser.getGameIds();

        Assertions.assertFalse(gameIds.toString().contains("1e523b23bc0129h5070f45f0dbb7efd7"));
    }


    @Test
    public void testGetHomeTeamsValidBasketballEarly() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestBasketball.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> homeTeamArray = gameParser.getHomeTeams();

        Assertions.assertTrue(homeTeamArray.toString().contains("Utah Jazz"));
    }

    @Test
    public void testGetHomeTeamsValidBasketballLate() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestBasketball.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> homeTeamArray = gameParser.getHomeTeams();

        Assertions.assertTrue(homeTeamArray.toString().contains("Portland Trail Blazers"));
    }

    @Test
    public void testGetHomeTeamsInvalidBasketball() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestBasketball.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> homeTeamArray = gameParser.getHomeTeams();

        Assertions.assertFalse(homeTeamArray.toString().contains("Golden State Warriors"));
    }

    @Test
    public void testGetAwayTeamsValidBasketballEarly() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestBasketball.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> awayTeamArray = gameParser.getAwayTeams();

        Assertions.assertTrue(awayTeamArray.toString().contains("Golden State Warriors"));
    }

    @Test
    public void testGetAwayTeamsValidBasketballLate() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestBasketball.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> awayTeamArray = gameParser.getAwayTeams();

        Assertions.assertTrue(awayTeamArray.toString().contains("Denver Nuggets"));
    }

    @Test
    public void testGetAwayTeamsInvalidBasketball() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestBasketball.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> awayTeamArray = gameParser.getAwayTeams();

        Assertions.assertFalse(awayTeamArray.toString().contains("Miami Heat"));
    }

    @Test
    public void testGetGameIdsValidBasketballEarly() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestBasketball.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> gameIds = gameParser.getGameIds();

        Assertions.assertTrue(gameIds.toString().contains("4b2377a35e47201f7561eb9a806e922a"));
    }

    @Test
    public void testGetGameIdsValidBasketballLate() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestBasketball.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> gameIds = gameParser.getGameIds();

        Assertions.assertTrue(gameIds.toString().contains("d3375082a677eb4b6ad64c3671867d19"));
    }

    @Test
    public void testGetGameIdsInvalidBasketball() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestBasketball.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> gameIds = gameParser.getGameIds();

        Assertions.assertFalse(gameIds.toString().contains("400c3b0923753484d041e85c2b633cbb"));
    }

    @Test
    public void testGetHomeTeamsValidHockeyEarly() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestHockey.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> homeTeamArray = gameParser.getHomeTeams();

        Assertions.assertTrue(homeTeamArray.toString().contains("Colorado Avalanche"));
    }

    @Test
    public void testGetHomeTeamsValidHockeyLate() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestHockey.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> homeTeamArray = gameParser.getHomeTeams();

        Assertions.assertTrue(homeTeamArray.toString().contains("St Louis Blues"));
    }

    @Test
    public void testGetHomeTeamsInvalidHockey() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestHockey.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> homeTeamArray = gameParser.getHomeTeams();

        Assertions.assertFalse(homeTeamArray.toString().contains("Boston Bruins"));
    }

    @Test
    public void testGetAwayTeamsValidHockeyEarly() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestHockey.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> awayTeamArray = gameParser.getAwayTeams();

        Assertions.assertTrue(awayTeamArray.toString().contains("New York Rangers"));
    }

    @Test
    public void testGetAwayTeamsValidHockeyLate() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestHockey.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> awayTeamArray = gameParser.getAwayTeams();

        Assertions.assertTrue(awayTeamArray.toString().contains("Ottawa Senators"));
    }

    @Test
    public void testGetAwayTeamsInvalidHockey() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestHockey.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> awayTeamArray = gameParser.getAwayTeams();

        Assertions.assertFalse(awayTeamArray.toString().contains("Vegas Golden Knights"));
    }

    @Test
    public void testGetGameIdsValidHockeyEarly() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestHockey.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> gameIds = gameParser.getGameIds();

        Assertions.assertTrue(gameIds.toString().contains("f737966f2aec3fee42778c7fcf6bd955"));
    }

    @Test
    public void testGetGameIdsValidHockeyLate() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestHockey.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> gameIds = gameParser.getGameIds();

        Assertions.assertTrue(gameIds.toString().contains("493ed788b952879d69c859ccc6b346f5"));
    }

    @Test
    public void testGetGameIdsInvalidHockey() throws IOException {
        GameParser gameParser = new GameParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("gameTestHockey.json");
        gameParser.setGamesJson(inputStream);
        ArrayList<String> gameIds = gameParser.getGameIds();

        Assertions.assertFalse(gameIds.toString().contains("1c203bda8g10615f37d6fb008f5d9s73"));
    }
}
