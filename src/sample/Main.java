package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Main extends Application {

    private Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{
     //   Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window = primaryStage;


        
        showWindow(window);
    }

    public void showWindow(Stage window){
        window.setMinWidth(400);
        window.setMinHeight(600);
        window.setHeight(600);
        window.setWidth(400);
        window.setTitle("Calculator");
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
