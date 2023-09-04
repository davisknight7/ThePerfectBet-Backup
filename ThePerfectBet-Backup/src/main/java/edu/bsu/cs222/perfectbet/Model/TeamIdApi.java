package edu.bsu.cs222.perfectbet.Model;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class TeamIdApi {
    public InputStream getTeamIds(String userChoice) {
        LeagueFormatter leagueFormatter = new LeagueFormatter();

        String startUrl = "https://site.api.espn.com/apis/site/v2/sports/";
        String sport = userChoice.toLowerCase() + "/";
        String league = leagueFormatter.getLeagueName(userChoice);
        String endUrl = "/teams";
        String fullUrl = startUrl + sport + league + endUrl;

        try {
            URL url = new URL(fullUrl);
            URLConnection connection = url.openConnection();
            return connection.getInputStream();
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }
}
