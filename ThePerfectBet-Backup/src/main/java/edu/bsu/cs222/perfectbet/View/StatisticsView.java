package edu.bsu.cs222.perfectbet.View;

import edu.bsu.cs222.perfectbet.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class StatisticsView {
    @FXML
    public void setStatistics() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("statisticsGui.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.getIcons().add(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("coin.png"))));
        stage.setTitle("Statistics Selector");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
