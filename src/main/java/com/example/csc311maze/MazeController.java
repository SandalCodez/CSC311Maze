package com.example.csc311maze;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

public class MazeController {
    @FXML
    private Label welcomeText;

    @FXML
    private FlowPane pane;

    public FlowPane getPane() {
        return pane;
    }


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


}