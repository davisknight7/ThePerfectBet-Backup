package edu.bsu.cs222.perfectbet.Model;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class StatisticsApi {
    public InputStream getActiveStatistics(String userChoice, int teamId) {
        LeagueFormatter leagueFormatter = new LeagueFormatter();
        String year;
        if (userChoice.equalsIgnoreCase("football")) {
            year = "2022";
        } else {
            year = "2023";
        }

        String startUrl = "https://sports.core.api.espn.com/v2/sports/";
        String sport = userChoice.toLowerCase() + "/leagues/";
        String league = leagueFormatter.getLeagueName(userChoice);
        String endUrl = String.format("/seasons/%s/types/2/teams/%d/statistics", year, teamId);
        String fullUrl = startUrl + sport + league + endUrl;

        try {
            URL url = new URL(fullUrl);
            URLConnection connection = url.openConnection();
            return connection.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
