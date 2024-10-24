package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.event.ActionEvent;
import loginform.loginform.Main;

import java.io.IOException;

public class controladorLogin {
    public controladorLogin() {

    }
    // NÃO MEXE NESSA PORRA TA DANDO MAIS BUG QUE EU TO TOMANDO AGUA
    @FXML
    private Button button;
    @FXML
    private Label wrongLogin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    public void userLogin(ActionEvent event) throws IOException {
        checkLogin();
    }

    private void checkLogin() {
        Main m = new Main();
        if (username.getText().toString().equals("Admin") && password.getText().toString().equals("admin")) {
            wrongLogin.setText("Sucesso!");

            try {
                m.changeScene("afterLogin.fxml");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        else if (username.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogin.setText("Insira seus Dados");

        }

        else {
            wrongLogin.setText("Nome de usuario ou senha incorreto");
        }

    }


}