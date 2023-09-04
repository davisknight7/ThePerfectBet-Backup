package edu.bsu.cs222.perfectbet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("mainGui.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 750, 500);
        stage.getIcons().add(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("coin.png"))));
        stage.setTitle("The Perfect Bet");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}