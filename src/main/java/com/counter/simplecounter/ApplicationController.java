package com.counter.simplecounter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ApplicationController {
    @FXML
    private Label counter;
    @FXML
    private Button btIncrease;
    @FXML
    private Button btDecrease;
    @FXML
    private Button btRestart;

    @FXML
    private void increaseAction(ActionEvent e) {
        Integer counter_numeric = Integer.parseInt(counter.getText());
        counter_numeric++;
        counter.setText(counter_numeric.toString());
    }

    @FXML
    private void decreaseAction(ActionEvent e){
        Integer counter_numeric = Integer.parseInt(counter.getText());
        counter_numeric--;
        counter.setText(counter_numeric.toString());

    }

    @FXML
    private void restart(ActionEvent e) {
        Integer counter_numeric = Integer.parseInt(counter.getText());
        counter_numeric = 0;
        counter.setText(counter_numeric.toString());
    }
}