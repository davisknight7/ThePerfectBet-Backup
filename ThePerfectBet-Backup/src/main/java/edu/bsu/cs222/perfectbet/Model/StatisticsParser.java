package edu.bsu.cs222.perfectbet.Model;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class StatisticsParser {
    public static JSONArray statisticsArrayHome;
    public static JSONArray statisticsArrayAway;

    public void convertHomeToJSONArray(InputStream statsInputStream) throws IOException {
        statisticsArrayHome = JsonPath.read(statsInputStream, "$..splits");
    }

    public void convertAwayToJSONArray(InputStream statsInputStream) throws IOException {
        statisticsArrayAway = JsonPath.read(statsInputStream, "$..splits");
    }

    public ArrayList<String> parseHomeStatistics() {
        ArrayList<String> statisticsArray = new ArrayList<>();
        JSONArray statsArray = JsonPath.read(statisticsArrayHome, "$..value");
        for (Object statistic : statsArray) {
            statisticsArray.add(statistic.toString());
        }
        return statisticsArray;
    }

    public ArrayList<String> parseAwayStatistics() {
        ArrayList<String> statisticsArray = new ArrayList<>();
        JSONArray statsArray = JsonPath.read(statisticsArrayAway, "$..value");
        for (Object statistic : statsArray) {
            statisticsArray.add(statistic.toString());
        }
        return statisticsArray;
    }
}