package edu.bsu.cs222.perfectbet;

import edu.bsu.cs222.perfectbet.Model.LeagueFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLeagueFormatter {
    @Test
    public void testNflFormat() {
        LeagueFormatter leagueFormatter = new LeagueFormatter();
        String formattedLeague = leagueFormatter.getLeagueName("Football");
        Assertions.assertEquals("nfl", formattedLeague);
    }

    @Test
    public void testNbaFormat() {
        LeagueFormatter leagueFormatter = new LeagueFormatter();
        String formattedLeague = leagueFormatter.getLeagueName("Basketball");
        Assertions.assertEquals("nba", formattedLeague);
    }

    @Test
    public void testNhlFormat() {
        LeagueFormatter leagueFormatter = new LeagueFormatter();
        String formattedLeague = leagueFormatter.getLeagueName("Hockey");
        Assertions.assertEquals("nhl", formattedLeague);
    }

    @Test
    public void testCapsFormat() {
        LeagueFormatter leagueFormatter = new LeagueFormatter();
        String formattedLeague = leagueFormatter.getLeagueName("BASKETBALL");
        Assertions.assertEquals("nba", formattedLeague);
    }

    @Test
    public void testOtherValueFormat() {
        LeagueFormatter leagueFormatter = new LeagueFormatter();
        String formattedLeague = leagueFormatter.getLeagueName("Soccer");
        Assertions.assertEquals("Soccer", formattedLeague);
    }
}