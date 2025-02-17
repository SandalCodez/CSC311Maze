package com.example.csc311maze;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class MazeApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MazeApplication.class.getResource("mazeView.fxml"));
        Parent root = fxmlLoader.load();
        Image mazeImage = new Image(new FileInputStream("src/main/resources/maze.png"));

        ImageView mazeView = new ImageView(mazeImage);
        mazeView.setX(0);
        mazeView.setY(0);
        mazeView.setFitWidth(600);
        mazeView.setFitHeight(600);
        mazeView.setPreserveRatio(true);


        FlowPane pane = new FlowPane(root, mazeView);

        pane.setHgap(3);
        System.out.println(getClass().getResource("maze.png"));


        Scene scene = new Scene(pane, 800, 600);
        scene.getStylesheets().add(MazeApplication.class.getResource("mazeStyle.css").toExternalForm());


        stage.setTitle("Robot");


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}