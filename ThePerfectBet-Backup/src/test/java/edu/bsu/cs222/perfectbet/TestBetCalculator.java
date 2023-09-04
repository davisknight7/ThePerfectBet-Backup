package edu.bsu.cs222.perfectbet;

import edu.bsu.cs222.perfectbet.Model.BetCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBetCalculator {
    @Test
    public void testUnfavoredOddsCalc() {
        BetCalculator betCalculator = new BetCalculator();
        String payout = betCalculator.calculateBet(200, 5);
        Assertions.assertEquals("$10.00", payout);
    }

    @Test
    public void testFavoredOddsCalc() {
        BetCalculator betCalculator = new BetCalculator();
        String payout = betCalculator.calculateBet(-200, 5);
        Assertions.assertEquals("$2.50", payout);
    }

    @Test
    public void testZeroDollarsCalc() {
        BetCalculator betCalculator = new BetCalculator();
        String payout = betCalculator.calculateBet(150,0);

        Assertions.assertEquals("$0.00", payout);
    }

    @Test
    public void testHugeFavorCalc() {
        BetCalculator betCalculator = new BetCalculator();
        String payout = betCalculator.calculateBet(-2000,15);

        Assertions.assertEquals("$0.75", payout);
    }

    @Test
    public void testHugeUnfavoredCalc() {
        BetCalculator betCalculator = new BetCalculator();
        String payout = betCalculator.calculateBet(3000,15);

        Assertions.assertEquals("$450.00", payout);
    }
}
