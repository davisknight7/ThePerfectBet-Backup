package edu.bsu.cs222.perfectbet.Model;

public class SportsNameFormatter {
    //Reformats the selected sport name to be able to work through the GameApi url and returns as String
    public String getReformattedName(String userSelection) {
        if (userSelection.contains("Football")) {
            return "americanfootball_nfl";
        }
        else if (userSelection.contains("Basketball")) {
            return "basketball_nba";
        }
        else if (userSelection.contains("Hockey")) {
            return "icehockey_nhl";
        }
        else {
            return userSelection;
        }
    }
}
