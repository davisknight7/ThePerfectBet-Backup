package edu.bsu.cs222.perfectbet;

import edu.bsu.cs222.perfectbet.Model.TeamIdParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

public class TestTeamIdParser {
    @Test
    public void testGetNflTeamIdEarly() throws IOException {
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nflTeamsApi.json"));
        ArrayList<String> teamIdArray = teamIdParser.getTeamId();

        Assertions.assertTrue(teamIdArray.contains("20"));
    }

    @Test
    public void testGetNflTeamIdLate() throws IOException {
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nflTeamsApi.json"));
        ArrayList<String> teamIdArray = teamIdParser.getTeamId();

        Assertions.assertTrue(teamIdArray.contains("27"));
    }

    @Test
    public void testGetNflTeamNameEarly() throws IOException {
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nflTeamsApi.json"));
        ArrayList<String> teamNameArray = teamIdParser.getTeamName();

        Assertions.assertTrue(teamNameArray.contains("Buffalo Bills"));
    }

    @Test
    public void testGetNflTeamNameLate() throws IOException {
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nflTeamsApi.json"));
        ArrayList<String> teamNameArray = teamIdParser.getTeamName();

        Assertions.assertTrue(teamNameArray.contains("Seattle Seahawks"));
    }

    @Test
    public void testGetNbaTeamIdEarly() throws IOException {
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nbaTeamsApi.json"));
        ArrayList<String> teamIdArray = teamIdParser.getTeamId();

        Assertions.assertTrue(teamIdArray.contains("5"));
    }

    @Test
    public void testGetNbaTeamIdLate() throws IOException {
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nbaTeamsApi.json"));
        ArrayList<String> teamIdArray = teamIdParser.getTeamId();

        Assertions.assertTrue(teamIdArray.contains("24"));
    }

    @Test
    public void testGetNbaTeamNameEarly() throws IOException {
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nbaTeamsApi.json"));
        ArrayList<String> teamNameArray = teamIdParser.getTeamName();

        Assertions.assertTrue(teamNameArray.contains("Boston Celtics"));
    }

    @Test
    public void testGetNbaTeamNameLate() throws IOException {
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nbaTeamsApi.json"));
        ArrayList<String> teamNameArray = teamIdParser.getTeamName();

        Assertions.assertTrue(teamNameArray.contains("Washington Wizards"));
    }

    @Test
    public void testGetNhlTeamIdEarly() throws IOException {
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nhlTeamsApi.json"));
        ArrayList<String> teamIdArray = teamIdParser.getTeamId();

        Assertions.assertTrue(teamIdArray.contains("3"));
    }

    @Test
    public void testGetNhlTeamIdLate() throws IOException {
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nhlTeamsApi.json"));
        ArrayList<String> teamIdArray = teamIdParser.getTeamId();

        Assertions.assertTrue(teamIdArray.contains("29"));
    }

    @Test
    public void testGetNhlTeamNameEarly() throws IOException {
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nhlTeamsApi.json"));
        ArrayList<String> teamNameArray = teamIdParser.getTeamName();

        Assertions.assertTrue(teamNameArray.contains("Anaheim Ducks"));
    }

    @Test
    public void testGetNhlTeamNameLate() throws IOException {
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nhlTeamsApi.json"));
        ArrayList<String> teamNameArray = teamIdParser.getTeamName();

        Assertions.assertTrue(teamNameArray.contains("Vegas Golden Knights"));
    }
}
