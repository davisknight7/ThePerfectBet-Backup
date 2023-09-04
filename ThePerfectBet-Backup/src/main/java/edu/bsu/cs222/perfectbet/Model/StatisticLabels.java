package edu.bsu.cs222.perfectbet.Model;

import java.util.ArrayList;
import java.util.Arrays;

public class StatisticLabels {
    public static ArrayList<String> nflLabelsList;
    public static ArrayList<String> nbaLabelsList;
    public static ArrayList<String> nhlLabelsList;
    public ArrayList<String> setNflLabels() {
        ArrayList<String> nflLabels = new ArrayList<>(Arrays.asList(
                "Completions", "Interceptions Thrown", "Fumbles", "Total Touchdowns",
                "Field Goal Pct", "Redzone Scoring Pct", "Passing Yards Per Game", "Rushing Yards Per Game",
                "Total Points Per Game", "Total Sacks", "Assist Tackles", "Passes Defended"));
        nflLabelsList = nflLabels;
        return nflLabels;
    }
    public ArrayList<String> setNbaLabels() {
        ArrayList<String> nbaLabels = new ArrayList<>(Arrays.asList(
                "Blocks", "Defensive Rebounds", "Steals", "Fouls",
                "Rebound Rate", "Free Throw Pct", "Points", "Turnovers",
                "3-Point Field Goal Pct", "Points in the Paint", "Fast Break Points", "2-Point Field Goal Pct"));
        nbaLabelsList = nbaLabels;
        return nbaLabels;
    }
    public ArrayList<String> setNhlLabels() {
        ArrayList<String> nhlLabels = new ArrayList<>(Arrays.asList(
                "Goals", "Goals Against", "Saves", "Wins",
                "Assists", "Points per Game", "Faceoff Win Percent", "Total Penalties",
                "Penalty Minutes", "Fighting Penalties", "Fights Per Game", "Losses"));
        nhlLabelsList = nhlLabels;
        return nhlLabels;
    }
}
