package edu.bsu.cs222.perfectbet.Model;

import java.util.ArrayList;

public class UserTeamSelection {
    public int index;
    public int getTeamIdByName(String teamName) {
        int id;
        TeamIdParser teamIdParser = new TeamIdParser();
        ArrayList<String> teamIdArray = teamIdParser.getTeamId();
        ArrayList<String> teamNameArray = teamIdParser.getTeamName();

        if (teamNameArray.contains(teamName)) {
            index = teamNameArray.indexOf(teamName);
        }
        id = Integer.parseInt(teamIdArray.get(index));
        return id;
    }
}
