package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Main extends Application {

    private Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window = primaryStage;


        Scene scene = new Scene(root, 600, 350);
        showWindow(window, scene);
    }

    public void showWindow(Stage window, Scene scene){
        window.setHeight(350);
        window.setWidth(610);
        window.setTitle("Calculator");
        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
