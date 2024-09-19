package com.example.databae;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button SignInButton;

    @FXML
    private Button SignUpButton;

    @FXML
    private TextField tf_username;

    @FXML
    private TextField pf_password;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        SignInButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DB.logInUser(event,tf_username.getText(),pf_password.getText());
            }
        });

        SignUpButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DB.changeScene(event,"CreateAccount.fxml","SignUp",null);
            }
        });
    }

}
