package edu.bsu.cs222.perfectbet.Controller;

import edu.bsu.cs222.perfectbet.Model.StatisticLabels;
import edu.bsu.cs222.perfectbet.Model.StatisticsCompiler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StatisticsController {
    @FXML
    private CheckBox cb_1;
    @FXML
    private CheckBox cb_2;
    @FXML
    private CheckBox cb_3;
    @FXML
    private CheckBox cb_4;
    @FXML
    private CheckBox cb_5;
    @FXML
    private CheckBox cb_6;
    @FXML
    private CheckBox cb_7;
    @FXML
    private CheckBox cb_8;
    @FXML
    private CheckBox cb_9;
    @FXML
    private CheckBox cb_10;
    @FXML
    private CheckBox cb_11;
    @FXML
    private CheckBox cb_12;
    @FXML
    private Button save_btn;

    public static List<CheckBox> checkedBoxList;
    public static List<CheckBox> fullCheckBoxList;

    @FXML
    protected void onSaveClick() {
        saveCheckBoxes();
        changeStats();
        closeWindow();
    }
    @FXML
    protected void changeStats(){
        StatisticsCompiler.settings = "custom";
    }
    @FXML
    protected void saveCheckBoxes() {
        List<CheckBox> checkedBoxList = new ArrayList<>();
        for (CheckBox checked: fullCheckBoxList) {
            if (checked.isSelected()) {
                checkedBoxList.add(checked);
            }
        }
        StatisticsController.checkedBoxList = checkedBoxList;
    }
    @FXML
    protected void setNbaStats() {
        StatisticLabels statisticLabels = new StatisticLabels();
        ArrayList<String> nbaLabels = statisticLabels.setNbaLabels();
        for (CheckBox checkBox: fullCheckBoxList) {
            int labelIndex = fullCheckBoxList.indexOf(checkBox);
            checkBox.setText(nbaLabels.get(labelIndex));
        }
    }

    @FXML
    protected void setNflStats() {
        StatisticLabels statisticLabels = new StatisticLabels();
        ArrayList<String> nflLabels = statisticLabels.setNflLabels();
        for (CheckBox checkBox: fullCheckBoxList) {
            int labelIndex = fullCheckBoxList.indexOf(checkBox);
            checkBox.setText(nflLabels.get(labelIndex));
        }
    }

    @FXML
    protected void setNhlStats() {
        StatisticLabels statisticLabels = new StatisticLabels();
        ArrayList<String> nhlLabels = statisticLabels.setNhlLabels();
        for (CheckBox checkBox: fullCheckBoxList) {
            int labelIndex = fullCheckBoxList.indexOf(checkBox);
            checkBox.setText(nhlLabels.get(labelIndex));
        }
    }

    @FXML
    private void closeWindow() {
        Stage stage = (Stage) save_btn.getScene().getWindow();
        stage.close();
    }
    @FXML
    private void initialize() {
        String userSelection = MainController.userSelection;
        List<CheckBox> checkBoxList = new ArrayList<>();
        Collections.addAll(checkBoxList, cb_1, cb_2, cb_3, cb_4, cb_5, cb_6, cb_7, cb_8, cb_9, cb_10, cb_11, cb_12);
        fullCheckBoxList = checkBoxList;

        switch (userSelection) {
            case "Football" -> setNflStats();
            case "Basketball" -> setNbaStats();
            case "Hockey" -> setNhlStats();
        }
    }

}
