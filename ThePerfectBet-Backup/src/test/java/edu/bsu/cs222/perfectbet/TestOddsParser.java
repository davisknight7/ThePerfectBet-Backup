package edu.bsu.cs222.perfectbet;

import edu.bsu.cs222.perfectbet.Model.OddsParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class TestOddsParser {
    @Test
    public void testAwayOdds() throws IOException {
        OddsParser oddsParser = new OddsParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("oddsTest.json");
        ArrayList<String> oddsList = oddsParser.getOdds(inputStream);
        Assertions.assertEquals("+225", oddsList.get(0));
    }

    @Test
    public void testHomeOdds() throws IOException {
        OddsParser oddsParser = new OddsParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("oddsTest.json");
        ArrayList<String> oddsList = oddsParser.getOdds(inputStream);
        Assertions.assertEquals("-265", oddsList.get(1));
    }

    @Test
    public void testOddsInvalid() throws IOException {
        OddsParser oddsParser = new OddsParser();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("oddsTest.json");
        ArrayList<String> oddsList = oddsParser.getOdds(inputStream);
        Assertions.assertNotEquals("225", oddsList.get(0));
    }
}
