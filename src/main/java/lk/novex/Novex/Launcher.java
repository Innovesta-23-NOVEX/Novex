package lk.novex.Novex;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/login_form.fxml"));
        Scene scene = new Scene(rootNode);

        Image image = new Image("images/recolter-modified.png");
        stage.getIcons().add(image);

        stage.setTitle("Recolter");
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();
    }

}
