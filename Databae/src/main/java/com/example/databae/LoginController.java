package com.example.databae;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable{
    @FXML
    private Button LogOutButton;

    @FXML
    private Label Welcome;

    @FXML
    private Label S_Login;

    @Override
    public void initialize(URL location,ResourceBundle resources){
        LogOutButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DB.changeScene(event,"Login.fxml","LogIn!",null);
            }
        });
    }

    public void setUserInformation(String username){
        Welcome.setText("Welcome "+username+" !");
        S_Login.setText("You are successfully Logged In "+username+ " !");
    }
}
