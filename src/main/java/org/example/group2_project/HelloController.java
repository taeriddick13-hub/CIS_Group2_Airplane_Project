package org.example.group2_project;

import common.Action;
import common.VO;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    private Facade facade = new Facade();


    @FXML
    protected void onLoginClick() {
        VO vo = new VO();
        vo.setUsername(usernameField.toString());
        vo.setPassword(passwordField.toString());
        vo.setAction(Action.LOGIN);
        facade.process(vo);

        if (usernameField.getText().isEmpty() || passwordField.getText().isEmpty()) {
            welcomeText.setText("Enter your username and password");
            return;
        }

        welcomeText.setText("Welcome to JavaFX Application!");

    }

    @FXML
    protected void onSignInClick() { welcomeText.setText("Welcome to JavaFX");}
}
