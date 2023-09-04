package edu.bsu.cs222.perfectbet.Model;

public class LeagueFormatter {
    public String getLeagueName(String userChoice) {
        if (userChoice.toLowerCase().contains("football")) {
            return "nfl";
        }
        else if (userChoice.toLowerCase().contains("basketball")) {
            return "nba";
        }
        else if (userChoice.toLowerCase().contains("hockey")) {
            return "nhl";
        }
        else {
            return userChoice;
        }
    }
}
