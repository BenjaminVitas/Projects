///////////////////////////////////////////
// Ben Vitas
// Title: D&D Utility Suite
// Files: Main.java:DiceController.java:Controller2.java:Dice.fxml:sample2.fxml
// Version: 0.1
///////////////////////////////////////////

package UtilitySuite;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Dice.fxml"));
        primaryStage.setTitle("D&D Utility Suite");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
