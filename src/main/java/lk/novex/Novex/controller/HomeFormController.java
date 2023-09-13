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

public class HomeFormController {
    @FXML
    private Button homebtn;

    @FXML
    private Button managepilebtn;

    @FXML
    private Button manageproductbtn;

    @FXML
    private Button managesupplierbtn;

    @FXML
    private Button qualitytestbtn;

    @FXML
    private AnchorPane rootNode;

    @FXML
    private AnchorPane rootHome;

    @FXML
    private Button viewcctvbtn;

    @FXML
    void btnLoginOnAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/login_form.fxml"));

        Scene scene   = new Scene(rootNode);
        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setTitle("Recolter");
        stage.setScene(scene);
    }
    @FXML
    void btnHomeOnAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/home_form.fxml"));
        this.rootHome.getChildren().clear();
        this.rootHome.getChildren().add(rootNode);
    }
}
