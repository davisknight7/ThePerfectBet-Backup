package edu.bsu.cs222.perfectbet.Controller;

import edu.bsu.cs222.perfectbet.Model.*;
import edu.bsu.cs222.perfectbet.View.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MainController {
    public String usersSelectionFormatted;
    public static String userSelection;
    public int Index;
    public Double wagerAmount;
    public Double oddsDouble;
    public TextFlow printedStatsBox;
    public TextFlow printedStatsBox1;
    public Button calculate_btn;
    public Button calculateWager_btn;
    @FXML
    private Label home_lb;
    @FXML
    private Label away_lb;
    @FXML
    private Label teamOneOdds_lb;
    @FXML
    private Label teamTwoOdds_lb;
    @FXML
    private Label payout_lb;

    @FXML
    private ChoiceBox<String> homeTeam_cb;
    @FXML
    private ChoiceBox<String> awayTeam_cb;
    @FXML
    public ChoiceBox<String> sports_cb;

    @FXML
    private TextField homeWager_tb;
    @FXML
    private TextField awayWager_tb;

    @FXML
    protected void setStatistics() throws IOException {
        StatisticsView statisticsView = new StatisticsView();
        statisticsView.setStatistics();
    }

    @FXML
    protected void refreshStatistics() throws IOException {
        calculateStatistics();
    }


    @FXML
    protected void setWagerHome() {
        Alerts alerts = new Alerts();
        awayWager_tb.setText("");
        try {
            wagerAmount = Double.parseDouble(homeWager_tb.getText());
            oddsDouble = Double.parseDouble(teamOneOdds_lb.getText());
        }
        catch (NumberFormatException e) {
            alerts.wagerInputError();
            homeWager_tb.setText("");
        }
    }
    @FXML
    protected void setWagerAway() {
        Alerts alerts = new Alerts();
        homeWager_tb.setText("");
        try {
            wagerAmount = Double.parseDouble(awayWager_tb.getText());
            oddsDouble = Double.parseDouble(teamTwoOdds_lb.getText());
        }
        catch (NumberFormatException e) {
            alerts.wagerInputError();
            awayWager_tb.setText("");
        }
    }

    @FXML
    protected void calculateWager() {
        BetCalculator betCalculator = new BetCalculator();
        Alerts alerts = new Alerts();
        if (homeWager_tb.getText().equals("") && awayWager_tb.getText().equals("")) {
            alerts.wagerNoInputError();
        }
        else {
            String payout = betCalculator.calculateBet(oddsDouble, wagerAmount);
            payout_lb.setText(String.valueOf(payout));
        }
    }

    @FXML
    protected void calculate() throws IOException {
        alertCheck();
    }

    @FXML
    protected void alertCheck() throws IOException {
        Alerts alerts = new Alerts();
        if (sports_cb.getValue() == null) {
            alerts.sportSelectAlert();
        }
        else if (homeTeam_cb.getValue() == null) {
            alerts.teamSelectAlert();
        }
        else {
            calculateOdds();
            calculateStatistics();
        }
    }

    @FXML
    protected void calculateStatistics() throws IOException {
        StatisticsCompiler statisticsCompiler = new StatisticsCompiler();

        String homeTeamString = homeTeam_cb.getValue();
        String awayTeamString = awayTeam_cb.getValue();

        Text homeTitleText = new Text();
        homeTitleText.setFont(Font.font("Dubai Bold", 20));
        homeTitleText.setFill(Color.web("#023047"));
        homeTitleText.setText(homeTeamString);
        Text awayTitleText = new Text();
        awayTitleText.setFont(Font.font("Dubai Bold", 20));
        awayTitleText.setFill(Color.web("#023047"));
        awayTitleText.setText(awayTeamString);

        Text homeStatsText = new Text();
        homeStatsText.setFont(Font.font("Dubai Regular", 16));
        Text awayStatsText = new Text();
        awayStatsText.setFont(Font.font("Dubai Regular", 16));

        homeStatsText.setText("");
        awayStatsText.setText("");
        printedStatsBox.getChildren().clear();
        printedStatsBox1.getChildren().clear();

        statisticsCompiler.loadStats(homeTeamString, awayTeamString);
        if (StatisticsCompiler.settings.equals("default")) {
            ArrayList<String> homeDefaultStats = statisticsCompiler.getDefaultStats("home");
            ArrayList<String> awayDefaultStats = statisticsCompiler.getDefaultStats("away");
            String homeCompiledDefaultStats = statisticsCompiler.getCompiledStats(homeDefaultStats);
            String awayCompiledDefaultStats = statisticsCompiler.getCompiledStats(awayDefaultStats);

            homeStatsText.setText(homeCompiledDefaultStats + "\n");
            awayStatsText.setText(awayCompiledDefaultStats);
            printedStatsBox.getChildren().add(homeTitleText);
            printedStatsBox.getChildren().add(homeStatsText);
            printedStatsBox1.getChildren().add(awayTitleText);
            printedStatsBox1.getChildren().add(awayStatsText);
        }
        else if (StatisticsCompiler.settings.equals("custom")) {
            ArrayList<String> homeCustomStats = statisticsCompiler.getCustomStats("home");
            ArrayList<String> awayCustomStats = statisticsCompiler.getCustomStats("away");
            String homeCustomCompiledStats = statisticsCompiler.getCompiledStats(homeCustomStats);
            String awayCustomCompiledStats = statisticsCompiler.getCompiledStats(awayCustomStats);

            homeStatsText.setText(homeCustomCompiledStats + "\n");
            awayStatsText.setText(awayCustomCompiledStats);
            printedStatsBox.getChildren().add(homeTitleText);
            printedStatsBox.getChildren().add(homeStatsText);
            printedStatsBox1.getChildren().add(awayTitleText);
            printedStatsBox1.getChildren().add(awayStatsText);
        }
    }


    @FXML
    protected void calculateOdds() throws IOException {
        home_lb.setText("");
        away_lb.setText("");
        teamOneOdds_lb.setText("");
        teamTwoOdds_lb.setText("");

        Alerts alerts = new Alerts();
        GameApi gameApi = new GameApi();
        GameParser gameParser = new GameParser();
        OddsParser oddsParser = new OddsParser();
        InputStream gameInputStream = gameApi.getActiveGames(usersSelectionFormatted);
        gameParser.setGamesJson(gameInputStream);
        String id = gameParser.getGameIds().get(Index);
        InputStream oddsInputStream = gameApi.getActiveOdds(usersSelectionFormatted, id);
        ArrayList<String> oddsArray = oddsParser.getOdds(oddsInputStream);


        home_lb.setText(homeTeam_cb.getValue());
        away_lb.setText(awayTeam_cb.getValue());
        try {
            teamOneOdds_lb.setText(oddsArray.get(0));
            teamTwoOdds_lb.setText(oddsArray.get(1));
        } catch (Exception e) {
            alerts.oddsNotAvailable();
        }
    }

    @FXML
    protected void homeTeamSelect() {
        if (homeTeam_cb.getItems().contains(homeTeam_cb.getValue())) {
            Index = homeTeam_cb.getItems().indexOf(homeTeam_cb.getValue());
            awayTeam_cb.setValue(awayTeam_cb.getItems().get(Index));
        }
    }

    @FXML
    protected void awayTeamSelect() {
        if (awayTeam_cb.getItems().contains(awayTeam_cb.getValue())) {
            Index = awayTeam_cb.getItems().indexOf(awayTeam_cb.getValue());
            homeTeam_cb.setValue(homeTeam_cb.getItems().get(Index));
        }
    }



    @FXML
    protected void onSportSelect() {
        resetStage();

        GameApi gameApi = new GameApi();
        GameParser gameParser = new GameParser();
        SportsNameFormatter sportsNameFormatter = new SportsNameFormatter();
        Alerts alerts = new Alerts();

        userSelection = sports_cb.getValue();
        usersSelectionFormatted = sportsNameFormatter.getReformattedName(userSelection);
        try {
            InputStream gameInputStream = gameApi.getActiveGames(usersSelectionFormatted);
            gameParser.setGamesJson(gameInputStream);
        }catch (Exception e){
            alerts.networkError();
        }
        ArrayList<String> homeTeams = gameParser.getHomeTeams();
        ArrayList<String> awayTeams = gameParser.getAwayTeams();

        homeTeam_cb.getItems().addAll(homeTeams);
        awayTeam_cb.getItems().addAll(awayTeams);
        }

        @FXML
        protected void resetStage() {
            StatisticsCompiler.settings = "default";

            homeTeam_cb.getItems().clear();
            awayTeam_cb.getItems().clear();
            home_lb.setText("Home");
            away_lb.setText("Away");
            teamOneOdds_lb.setText("+0");
            teamTwoOdds_lb.setText("-0");
            printedStatsBox.getChildren().clear();
            printedStatsBox1.getChildren().clear();
            homeWager_tb.setText("");
            awayWager_tb.setText("");
            payout_lb.setText("");
        }


    @FXML
    private void initialize() {
        sports_cb.getItems().add("Football");
        sports_cb.getItems().add("Basketball");
        sports_cb.getItems().add("Hockey");
    }

}


