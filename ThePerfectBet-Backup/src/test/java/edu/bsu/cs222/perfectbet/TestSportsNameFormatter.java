package edu.bsu.cs222.perfectbet;

import edu.bsu.cs222.perfectbet.Model.SportsNameFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSportsNameFormatter {
    @Test
    public void testFootballFormat() {
        SportsNameFormatter nameFormatter = new SportsNameFormatter();
        String formattedName = nameFormatter.getReformattedName("Football");
        Assertions.assertEquals("americanfootball_nfl", formattedName);
    }

    @Test
    public void testBasketballFormat() {
        SportsNameFormatter nameFormatter = new SportsNameFormatter();
        String formattedName = nameFormatter.getReformattedName("Basketball");
        Assertions.assertEquals("basketball_nba", formattedName);
    }

    @Test
    public void testHockeyFormat() {
        SportsNameFormatter nameFormatter = new SportsNameFormatter();
        String formattedName = nameFormatter.getReformattedName("Hockey");
        Assertions.assertEquals("icehockey_nhl", formattedName);
    }

    @Test
    public void testOtherFormat() {
        SportsNameFormatter nameFormatter = new SportsNameFormatter();
        String formattedName = nameFormatter.getReformattedName("Soccer");
        Assertions.assertEquals("Soccer", formattedName);
    }
}
