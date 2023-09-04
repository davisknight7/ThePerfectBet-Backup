package edu.bsu.cs222.perfectbet;

import edu.bsu.cs222.perfectbet.Model.TeamIdParser;
import edu.bsu.cs222.perfectbet.Model.UserTeamSelection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestUserTeamSelection {
    @Test
    public void testGetTeamIdByNameNflEarly() throws IOException {
        UserTeamSelection userTeamSelection = new UserTeamSelection();
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nflTeamsApi.json"));

        int teamId = userTeamSelection.getTeamIdByName("Buffalo Bills");

        Assertions.assertEquals(2, teamId);
    }

    @Test
    public void testGetTeamIdByNameNflMiddle() throws IOException {
        UserTeamSelection userTeamSelection = new UserTeamSelection();
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nflTeamsApi.json"));

        int teamId = userTeamSelection.getTeamIdByName("Indianapolis Colts");

        Assertions.assertEquals(11, teamId);
    }

    @Test
    public void testGetTeamIdByNameNflLate() throws IOException {
        UserTeamSelection userTeamSelection = new UserTeamSelection();
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nflTeamsApi.json"));

        int teamId = userTeamSelection.getTeamIdByName("San Francisco 49ers");

        Assertions.assertEquals(25, teamId);
    }

    @Test
    public void testGetTeamIdByNameNbaEarly() throws IOException {
        UserTeamSelection userTeamSelection = new UserTeamSelection();
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nbaTeamsApi.json"));

        int teamId = userTeamSelection.getTeamIdByName("Charlotte Hornets");

        Assertions.assertEquals(30, teamId);
    }

    @Test
    public void testGetTeamIdByNameNbaMiddle() throws IOException {
        UserTeamSelection userTeamSelection = new UserTeamSelection();
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nbaTeamsApi.json"));

        int teamId = userTeamSelection.getTeamIdByName("Memphis Grizzlies");

        Assertions.assertEquals(29, teamId);
    }

    @Test
    public void testGetTeamIdByNameNbaLate() throws IOException {
        UserTeamSelection userTeamSelection = new UserTeamSelection();
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nbaTeamsApi.json"));

        int teamId = userTeamSelection.getTeamIdByName("San Antonio Spurs");

        Assertions.assertEquals(24, teamId);
    }

    @Test
    public void testGetTeamIdByNameNhlEarly() throws IOException {
        UserTeamSelection userTeamSelection = new UserTeamSelection();
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nhlTeamsApi.json"));

        int teamId = userTeamSelection.getTeamIdByName("Calgary Flames");

        Assertions.assertEquals(3, teamId);

    }

    @Test
    public void testGetTeamIdByNameNhlMiddle() throws IOException {
        UserTeamSelection userTeamSelection = new UserTeamSelection();
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nhlTeamsApi.json"));

        int teamId = userTeamSelection.getTeamIdByName("Minnesota Wild");

        Assertions.assertEquals(30, teamId);
    }

    @Test
    public void testGetTeamIdByNameNhlLate() throws IOException {
        UserTeamSelection userTeamSelection = new UserTeamSelection();
        TeamIdParser teamIdParser = new TeamIdParser();
        teamIdParser.setTeamIdJsonArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("nhlTeamsApi.json"));

        int teamId = userTeamSelection.getTeamIdByName("Toronto Maple Leafs");

        Assertions.assertEquals(21, teamId);
    }
}
