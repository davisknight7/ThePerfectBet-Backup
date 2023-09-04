package edu.bsu.cs222.perfectbet.Model;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;


public class GameApi {

    public InputStream getActiveGames(String sportChoice) {
        String ApiUrl = "https://api.the-odds-api.com/v4/sports/";
        String endApiUrl = "/odds/?apiKey=4a4d4089dabfdebd4608b36307c69546&regions=us&markets=h2h&bookmakers=draftkings,spreads&oddsFormat=american";
        String fullUrl = ApiUrl + sportChoice + endApiUrl;
        try {
            URL url = new URL(fullUrl);
            URLConnection connection = url.openConnection();
            return connection.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public InputStream getActiveOdds(String Sport, String GameId) {
        String BaseApiUrl = "https://api.the-odds-api.com/v4/sports/";
        String MidApiUrl = "/odds/?apiKey=4a4d4089dabfdebd4608b36307c69546&regions=us&markets=h2h&bookmakers=draftkings,spreads&eventIds=";
        String EndApiUrl = "&oddsFormat=american";
        String CombinedUrl = BaseApiUrl + Sport + MidApiUrl + GameId + EndApiUrl;
        try {
            URL url = new URL(CombinedUrl);
            URLConnection connection = url.openConnection();
            return connection.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
