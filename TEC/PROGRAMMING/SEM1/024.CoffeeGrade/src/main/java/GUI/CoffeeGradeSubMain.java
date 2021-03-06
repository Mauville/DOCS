package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;

public class CoffeeGradeSubMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        URL url = new File("src/main/resources/fxml/CoffeeGrade.fxml").toURL();
        Parent root = FXMLLoader.load(url);
//        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("../../resources/fxml/CoffeeGrade.fxml"));
        primaryStage.setTitle("CoffeeGrade");
        primaryStage.setScene(new Scene(root, 810, 570));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
