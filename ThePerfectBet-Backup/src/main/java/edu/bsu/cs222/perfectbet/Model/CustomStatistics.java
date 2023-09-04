package edu.bsu.cs222.perfectbet.Model;

import edu.bsu.cs222.perfectbet.Controller.MainController;

import java.util.ArrayList;
import java.util.Collections;

public class CustomStatistics {
    public ArrayList<Integer> setCustomStatsIndex() {
        ArrayList<Integer> statIndexList = new ArrayList<>();
        String userChoice = MainController.userSelection;
        switch (userChoice) {
            case "Football" -> Collections.addAll(statIndexList, 11, 14, 0, 40, 158, 263, 31, 65, 39, 32, 111, 123);
            case "Basketball" -> Collections.addAll(statIndexList, 0, 1, 2, 13, 14, 55, 59, 60, 61, 68, 71, 95);
            case "Hockey" -> Collections.addAll(statIndexList, 35, 62, 12, 23, 37, 45, 58, 60, 61, 74, 70, 24);
        }
        return statIndexList;
    }
}
