package com.example.rbwr_multi_tool;




import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

class Rank {
    String name;
    int amount;


    Rank(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
}

public class HelloController implements Initializable {
    public Button calculatePoints;
    public Label amountOfPoints;
    public Label nextRank;
    @FXML
    private Label welcomeText;

    @FXML
    protected void calculatePoints() {
        Rank[] ranks = {
                new Rank("Trainee", 1000),
                new Rank("Worker", 2000),
                new Rank("Junior Operator", 5000),
                new Rank("Operator", 10000),
                new Rank("Senior Operator", 20000),
                new Rank("Junior Supervisor", 50000),
                new Rank("Supervisor", 100000),
                new Rank("Senior Supervisor", 200000),
                new Rank("Junior Inspector", 500000),
                new Rank("Inspector", 1000000),
                new Rank("Senior Inspector", 2000000),
                new Rank("Chief Inspector", 5000000)
        };


        int u1Points = (int) u1points.getValue();
        int u2Points = (int) u2points.getValue();
        int amount = u1Points + u2Points;
        amountOfPoints.setText("you have " + String.valueOf(amount) + " points");

        for (Rank rank : ranks) {
            if (amount < rank.amount) {
                int needed = rank.amount - amount;
                nextRank.setText("You need " + needed + " for the rank " + rank.name);
                break;
            }
        }
    }


    @FXML
    private Spinner<Integer> U1Points, U2Points;

    SpinnerValueFactory<Integer> u1points = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5000000,1) ;
    SpinnerValueFactory<Integer> u2points = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5000000,1) ;
    @FXML


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        U1Points.setValueFactory(u1points);
        U2Points.setValueFactory(u2points);
    }
}