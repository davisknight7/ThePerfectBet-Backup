package edu.bsu.cs222.perfectbet.Model;

import java.text.NumberFormat;

public class BetCalculator {
    public String calculateBet(double odds, double wager){
        double payout;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        if (odds == 0.0) {
            return "0";
        }
        //For bets that are not favored (positive)
        else if (odds > 0){
            payout = (odds / 100) * wager;
        }
        //For bets that are favored (negative)
        else {
            payout = (100 / odds) * wager * -1;
        }
        return currency.format(payout);
    }
}
