package lk.novex.Novex.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class QualityTestFormController {
    @FXML
    private AnchorPane rootNode;

    @FXML
    private AnchorPane rootHome;

    @FXML
    void btnAdminOnAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/admin_form.fxml"));
        this.rootHome.getChildren().clear();
        this.rootHome.getChildren().add(rootNode);
    }

    @FXML
    void btnManagePileOnAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/managepile_form.fxml"));
        this.rootHome.getChildren().clear();
        this.rootHome.getChildren().add(rootNode);
    }

    @FXML
    void btnManageProductOnAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/manageproduct_form.fxml"));
        this.rootHome.getChildren().clear();
        this.rootHome.getChildren().add(rootNode);
    }

    @FXML
    void btnManageSupplierAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/managesupplier_form.fxml"));
        this.rootHome.getChildren().clear();
        this.rootHome.getChildren().add(rootNode);
    }

    @FXML
    void btnViewCCTV(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/viewcctv_form.fxml"));
        this.rootHome.getChildren().clear();
        this.rootHome.getChildren().add(rootNode);
    }
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
    @FXML
    void btnQualityTestOnAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/qualitytest_form.fxml"));
        this.rootHome.getChildren().clear();
        this.rootHome.getChildren().add(rootNode);
    }
}
