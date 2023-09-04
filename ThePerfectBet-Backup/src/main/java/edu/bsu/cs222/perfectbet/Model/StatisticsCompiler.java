package edu.bsu.cs222.perfectbet.Model;

import edu.bsu.cs222.perfectbet.Controller.MainController;
import edu.bsu.cs222.perfectbet.Controller.StatisticsController;
import javafx.scene.control.CheckBox;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;

public class StatisticsCompiler {
    public static String settings = "default";

    public void loadStats(String homeTeam, String awayTeam) throws IOException {
        UserTeamSelection userTeamSelection = new UserTeamSelection();
        TeamIdParser teamIdParser = new TeamIdParser();
        TeamIdApi teamIdApi = new TeamIdApi();
        StatisticsApi statsApi = new StatisticsApi();
        StatisticsParser statisticsParser = new StatisticsParser();

        //Parses Team ID and Names with corresponding indexes
        InputStream inputStream = teamIdApi.getTeamIds(MainController.userSelection);
        teamIdParser.setTeamIdJsonArray(inputStream);

        int homeId = userTeamSelection.getTeamIdByName(homeTeam);
        int awayId = userTeamSelection.getTeamIdByName(awayTeam);

        InputStream homeInputStream = statsApi.getActiveStatistics(MainController.userSelection, homeId);
        InputStream awayInputStream = statsApi.getActiveStatistics(MainController.userSelection, awayId);

        statisticsParser.convertHomeToJSONArray(homeInputStream);
        statisticsParser.convertAwayToJSONArray(awayInputStream);
    }

    public ArrayList<String> getDefaultStats(String team) {
        String userChoice = MainController.userSelection;
        ArrayList<String> defaultStatsArray = new ArrayList<>();
        ArrayList<String> statsArray = getStatsByTeam(team);
        switch (userChoice) {
            case "Football" -> {
                String totalCompletions = "Total Completions: " + statsArray.get(11);
                String totalInterceptions = "Total Interceptions: " + statsArray.get(14);
                String avgPassingYards = "Average Passing Yards: " + statsArray.get(18);
                String avgRushingYards = "Average Rushing Yards: " + statsArray.get(65);
                Collections.addAll(defaultStatsArray, totalCompletions, totalInterceptions, avgPassingYards, avgRushingYards);
            }
            case "Basketball" -> {
                String blocks = "Total Blocks: " + statsArray.get(0);
                String steals = "Total Steals: " + statsArray.get(2);
                String freeThrowPct = "Free Throw Pct: " + statsArray.get(54);
                String points = "Total Points: " + statsArray.get(59);
                Collections.addAll(defaultStatsArray, blocks, steals, freeThrowPct, points);
            }
            case "Hockey" -> {
                String goals = "Average Goals: " + statsArray.get(35);
                String wins = "Total Wins: " + statsArray.get(23);
                String assists = "Total Assists: " + statsArray.get(37);
                String ppg = "Average Points per Game: " + statsArray.get(44);
                Collections.addAll(defaultStatsArray, goals, wins, assists, ppg);
            }
        }
        return defaultStatsArray;
    }
    public ArrayList<String> getCustomStats(String team) {
        CustomStatistics customStatistics = new CustomStatistics();
        ArrayList<Integer> statsIndexArray = customStatistics.setCustomStatsIndex();
        ArrayList<String> statsArray = getStatsByTeam(team);
        ArrayList<String> statStringArray = new ArrayList<>();


        for (CheckBox cb : StatisticsController.checkedBoxList) {
            if (StatisticsController.fullCheckBoxList.contains(cb)) {
                int indexInt = StatisticsController.fullCheckBoxList.indexOf(cb);
                String labelString = StatisticsController.fullCheckBoxList.get(indexInt).getText();
                statStringArray.add(labelString + ": " + (statsArray.get(statsIndexArray.get(indexInt))));
            }
        }
        return statStringArray;
    }

    public ArrayList<String> getStatsByTeam(String team) {
        StatisticsParser statisticsParser = new StatisticsParser();
        ArrayList<String> statsArrayList = new ArrayList<>();
        if (team.equals("home")) {
            statsArrayList = statisticsParser.parseHomeStatistics();
        }
        else if (team.equals("away")) {
            statsArrayList = statisticsParser.parseAwayStatistics();
        }
        return statsArrayList;
    }
    public String getCompiledStats(ArrayList<String> defaultStatsArray) {
        StringBuilder compiledStatsString = new StringBuilder();
        for (String stat : defaultStatsArray)
        {
            compiledStatsString.append("\n");
            compiledStatsString.append(stat);
        }
        return compiledStatsString.toString();
    }
}