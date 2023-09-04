package edu.bsu.cs222.perfectbet;

import edu.bsu.cs222.perfectbet.Controller.MainController;
import edu.bsu.cs222.perfectbet.Model.CustomStatistics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestCustomStatistics {
    @Test
    public void testSetCustomStatsIndexForFootballFirst() {
        CustomStatistics customStatistics = new CustomStatistics();
        MainController.userSelection = "Football";
        ArrayList<Integer> statsIndexList = customStatistics.setCustomStatsIndex();

        Assertions.assertTrue(statsIndexList.toString().contains("11"));
    }

    @Test
    public void testSetCustomStatsIndexForFootballMiddle() {
        CustomStatistics customStatistics = new CustomStatistics();
        MainController.userSelection = "Football";
        ArrayList<Integer> statsIndexList = customStatistics.setCustomStatsIndex();

        Assertions.assertTrue(statsIndexList.toString().contains("263"));
    }

    @Test
    public void testSetCustomStatsIndexForFootballLast() {
        CustomStatistics customStatistics = new CustomStatistics();
        MainController.userSelection = "Football";
        ArrayList<Integer> statsIndexList = customStatistics.setCustomStatsIndex();

        Assertions.assertTrue(statsIndexList.toString().contains("123"));
    }



    @Test
    public void testSetCustomStatsIndexForBasketballFirst() {
        CustomStatistics customStatistics = new CustomStatistics();
        MainController.userSelection = "Basketball";
        ArrayList<Integer> statsIndexList = customStatistics.setCustomStatsIndex();

        Assertions.assertTrue(statsIndexList.toString().contains("0"));
    }

    @Test
    public void testSetCustomStatsIndexForBasketballMiddle() {
        CustomStatistics customStatistics = new CustomStatistics();
        MainController.userSelection = "Basketball";
        ArrayList<Integer> statsIndexList = customStatistics.setCustomStatsIndex();

        Assertions.assertTrue(statsIndexList.toString().contains("59"));
    }

    @Test
    public void testSetCustomStatsIndexForBasketballLast() {
        CustomStatistics customStatistics = new CustomStatistics();
        MainController.userSelection = "Basketball";
        ArrayList<Integer> statsIndexList = customStatistics.setCustomStatsIndex();

        Assertions.assertTrue(statsIndexList.toString().contains("95"));
    }

    @Test
    public void testSetCustomStatsIndexForHockeyFirst() {
        CustomStatistics customStatistics = new CustomStatistics();
        MainController.userSelection = "Hockey";
        ArrayList<Integer> statsIndexList = customStatistics.setCustomStatsIndex();

        Assertions.assertTrue(statsIndexList.toString().contains("35"));
    }

    @Test
    public void testSetCustomStatsIndexForHockeyMiddle() {
        CustomStatistics customStatistics = new CustomStatistics();
        MainController.userSelection = "Hockey";
        ArrayList<Integer> statsIndexList = customStatistics.setCustomStatsIndex();

        Assertions.assertTrue(statsIndexList.toString().contains("58"));
    }

    @Test
    public void testSetCustomStatsIndexForHockeyLast() {
        CustomStatistics customStatistics = new CustomStatistics();
        MainController.userSelection = "Hockey";
        ArrayList<Integer> statsIndexList = customStatistics.setCustomStatsIndex();

        Assertions.assertTrue(statsIndexList.toString().contains("24"));
    }

    @Test
    public void testSetCustomStatsIndexFalse() {
        CustomStatistics customStatistics = new CustomStatistics();
        MainController.userSelection = "Football";
        ArrayList<Integer> statsIndexList = customStatistics.setCustomStatsIndex();

        Assertions.assertFalse(statsIndexList.toString().contains("100000"));
    }
}
