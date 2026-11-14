package org.example.group2_project;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;


    @FXML
    protected void onLoginClick() {
        if (username.getText().isEmpty() || password.getText().isEmpty()) {
            welcomeText.setText("Enter your username and password");
            return;
        }

        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onSignInClick() { welcomeText.setText("Welcome to JavaFX Application!");}
}
