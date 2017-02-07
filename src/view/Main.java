package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {

		try { 
			GridPane page = (GridPane) FXMLLoader.load(Main.class.getResource("../view/Accueil.fxml"));
			Scene scene = new Scene(page);
			scene.setRoot(page);
			scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("CroustyCuisine");
			primaryStage.setMinHeight(600);
			primaryStage.setMinWidth(450);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		launch(args);
	}
}