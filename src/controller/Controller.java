package controller;

import java.io.File;
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
    private Button cat_button;
	@FXML
    private Button cat_button_2;
	@FXML
	private ImageView edit;
	@FXML
	private ImageView cocktail;
	@FXML
	private ImageView apero;
	@FXML
	private ImageView dessert;
	@FXML
	private ImageView entree;
	@FXML
	private ImageView sale;
	@FXML
	private ImageView sucre;
	@FXML
	private ImageView plat;
	@FXML
	private ImageView glace;
	@FXML
	private ImageView chaud;
	@FXML
	private ImageView froid;
	


	
	@FXML
	protected void initialize() {
		set_image(cocktail,b.cocktail, "/image/cocktail.png", "/image/cocktail_2.png");
		set_image(apero,b.apero, "/image/apero.png", "/image/apero_2.png");
		set_image(dessert,b.dessert, "/image/dessert.png", "/image/dessert_2.png");
		set_image(entree,b.entree, "/image/entree.png", "/image/entree_2.png");
		set_image(sale,b.sale, "/image/sale.png", "/image/sale_2.png");
		set_image(sucre,b.sucre, "/image/sucre.png", "/image/sucre_2.png");
		set_image(plat,b.plat, "/image/plat.png", "/image/plat_2.png");
		set_image(glace,b.glace, "/image/glace.png", "/image/glace_2.png");
		set_image(chaud,b.chaud, "/image/chaud.png", "/image/chaud_2.png");
		set_image(froid,b.froid, "/image/froid.png", "/image/froid_2.png");		
	}
	
	public void set_image(ImageView iv, boolean b, String i1, String i2 )
	{
		if(iv != null)
		{
			if(!b)	
			{
		    	 System.out.println("activated");
		    	 Image image = new Image(i1);
		    	 iv.setImage(image);
			}
			else
			{
		    	 System.out.println("activated");
		    	 Image image = new Image(i2);
		    	 iv.setImage(image);
			}
		}
	}
	
	
	
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
		     scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());

	     }    
	     if (event.getSource() == cat_button)
	     {
	    	 System.out.println("blabla");
	    	 Stage stage = null; 
		     Parent root = null;
		     stage=(Stage) cat_button.getScene().getWindow();
			 root = FXMLLoader.load(getClass().getResource("../view/main_cat.fxml"));
			 Scene scene = new Scene(root);
			 
		     stage.setScene(scene);
		     stage.show();
		     scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());
	     }
	     if (event.getSource() == cat_button_2)
	     {
	    	 Stage stage = null; 
		     Parent root = null;
		     stage=(Stage) cat_button_2.getScene().getWindow();
			 root = FXMLLoader.load(getClass().getResource("../view/Main.fxml"));
			 Scene scene = new Scene(root);
		     stage.setScene(scene);
		     stage.show();
		     scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());
	     }    
	}
	@FXML  
	private void image_clicked(MouseEvent event) throws IOException, InterruptedException {
		
		 b.cocktail = change(event, cocktail, "/image/cocktail.png", "/image/cocktail_2.png", b.cocktail);
		 b.apero = change(event, apero, "/image/apero.png", "/image/apero_2.png", b.apero);
		 b.dessert = change(event, dessert, "/image/dessert.png", "/image/dessert_2.png", b.dessert);
		 b.entree = change(event, entree, "/image/entree.png", "/image/entree_2.png", b.entree);
		 b.sale = change(event, sale, "/image/sale.png", "/image/sale_2.png", b.sale);
		 b.sucre = change(event, sucre, "/image/sucre.png", "/image/sucre_2.png", b.sucre);
		 b.plat = change(event, plat, "/image/plat.png", "/image/plat_2.png", b.plat);
		 b.glace = change(event, glace, "/image/glace.png", "/image/glace_2.png", b.glace);
		 b.chaud = change(event, chaud, "/image/chaud.png", "/image/chaud_2.png", b.chaud);
		 b.froid = change(event, froid, "/image/froid.png", "/image/froid_2.png", b.froid);
		     
		     if (event.getSource() == edit)
		     {
		    	 Stage stage = null; 
			     Parent root = null;
			     stage=(Stage) edit.getScene().getWindow();
				 root = FXMLLoader.load(getClass().getResource("../view/Accueil.fxml"));
				 Scene scene = new Scene(root);
			     stage.setScene(scene);
			     stage.show();
			     scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());
			  }     
		
}
		
		private boolean change(MouseEvent event, ImageView source, String img_1, String img_2, boolean b) {
		// TODO Auto-generated method stub
		if (event.getSource() == source && b)
	     {
	    	 System.out.println("activated");
	    	 Image image = new Image(img_1);
	    	 source.setImage(image);
	    	 b = false;
	     }
	     else if (event.getSource() == source && !b)
	     {
	    	 System.out.println("not activated");
	    	 
	    	 Image image = new Image(img_2);
	    	 source.setImage(image);
	    	 b = true;
	     }
		return b;
	}
	}
