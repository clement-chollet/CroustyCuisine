package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller {
	@FXML protected Text actiontarget;
	
	@FXML
    private Button btn1;
	@FXML
	private ImageView edit;
	
	@FXML
	private void handleButtonAction(ActionEvent event) throws IOException {
	     
	     
	     if (event.getSource() == btn1)
	     {
	    	 Stage stage = null; 
		     Parent root = null;
		     stage=(Stage) btn1.getScene().getWindow();
			 root = FXMLLoader.load(getClass().getResource("../view/Main.fxml"));
			 Scene scene = new Scene(root);
		     stage.setScene(scene);
		     stage.show();
	     }    
	}
	@FXML  
	private void image_clicked(MouseEvent event) throws IOException {
		     
		     
		     if (event.getSource() == edit)
		     {
		    	 Stage stage = null; 
			     Parent root = null;
			     stage=(Stage) edit.getScene().getWindow();
				 root = FXMLLoader.load(getClass().getResource("../view/Accueil.fxml"));
					 Scene scene = new Scene(root);
				     stage.setScene(scene);
				     stage.show();
			     }     
		 }
	}
