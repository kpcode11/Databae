package com.example.databae;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SignupController implements Initializable {
    @FXML
    private Button SignUpButton;

    @FXML
    private Button SignInButton;

    @FXML
    private TextField tf_username;

    @FXML
    private TextField pf_password;

    @Override
    public void initialize(URL location,ResourceBundle resources){
        SignUpButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!tf_username.getText().trim().isEmpty() && !pf_password.getText().trim().isEmpty()){
                    DB.signUpUser(event,tf_username.getText(), pf_password.getText());
                } else {
                    System.out.println("Please fill in all the information");
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Please fill in all information to sign up!");
                    alert.show();
                }
            }
        });

        SignInButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DB.changeScene(event,"Login.fxml","LogIn !",null);
            }
        });
    }
}
