package edu.bsu.cs222.perfectbet.View;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class Alerts {
    @FXML
    public void teamSelectAlert() {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setTitle("No Team Selected");
        a.setContentText("Please Select a Team");
        a.show();
    }
    @FXML
    public void sportSelectAlert() {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setTitle("No Sport Selected");
        a.setContentText("Please Select a Sport");
        a.show();
    }

    @FXML
    public void wagerInputError() {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setTitle("Invalid Wager Entry");
        a.setContentText("Please enter a valid number");
        a.show();
    }

    @FXML
    public void wagerNoInputError() {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setTitle("No Wager Amount");
        a.setContentText("Please enter a wager to calculate");
        a.show();
    }

    public void oddsNotAvailable() {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setTitle("Odds Unavailable");
        a.setContentText("These odds are currently unavailable, please come back later");
        a.show();
    }

    public void networkError() {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setTitle("Error Code 3: No Network Connection");
        a.setContentText("Please Connect to a Secured Internet");
        a.showAndWait();
        System.exit(3);
    }
}
