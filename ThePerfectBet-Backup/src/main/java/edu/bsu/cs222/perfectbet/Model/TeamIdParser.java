package edu.bsu.cs222.perfectbet.Model;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class TeamIdParser {
    public static JSONArray teamIdJsonArray;

    public void setTeamIdJsonArray(InputStream inputStream) throws IOException {
        TeamIdParser.teamIdJsonArray = JsonPath.read(inputStream, "$..sports");
    }

    public ArrayList<String> getTeamId() {
        JSONArray teamIdArray = JsonPath.read(teamIdJsonArray, "$..teams..id");
        ArrayList<String> teamIdList = new ArrayList<>();

        for (Object teamId : teamIdArray) {
            teamIdList.add(teamId.toString());
        }
        return teamIdList;
    }
    public ArrayList<String> getTeamName() {
        JSONArray teamNameArray = JsonPath.read(teamIdJsonArray, "$..teams..displayName");
        ArrayList<String> teamNameList = new ArrayList<>();

        for (Object teamName : teamNameArray) {
            teamNameList.add(teamName.toString());
        }
        return teamNameList;
    }

}
