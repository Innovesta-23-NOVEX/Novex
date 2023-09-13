package lk.novex.Novex.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class LoginFormController {

    @FXML
    private Button forgotbtn;

    @FXML
    private Button loginbtn;

    @FXML
    private AnchorPane rootNode;

    @FXML
    void btnHomeOnAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/home_form.fxml"));

        Scene scene   = new Scene(rootNode);
        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setTitle("Recolter");
        stage.setScene(scene);
    }

    @FXML
    void btnResetPasswordOnAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/resetpassword_form.fxml"));

        Scene scene   = new Scene(rootNode);
        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setTitle("Recolter");
        stage.setScene(scene);
    }

}

