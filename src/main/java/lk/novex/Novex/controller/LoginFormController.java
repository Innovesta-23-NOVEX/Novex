package lk.novex.Novex.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    @FXML
    void btnHomeOnAction(ActionEvent event) throws IOException {
        //Navigate to Home Page
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/home_form.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = new Stage();
        stage.setTitle("Recolter");
        stage.setScene(scene);
        stage.show();
    }
}
