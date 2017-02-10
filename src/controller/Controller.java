package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller implements Initializable{

	@FXML
	protected Text actiontarget;
	@FXML
	private Button btn1;
	@FXML
	private Button addRecette;
	@FXML
	private Button back;
	@FXML
	private Button difficulty;
	@FXML
	private Button note;
	@FXML
	private Button recent;
	@FXML
	private Button difficulty_cat;
	@FXML
	private Button note_cat;
	@FXML
	private Button recent_cat;
	@FXML
	private Button cat_button;
	@FXML
	private Button create_account;
	@FXML
	private Button register;
	@FXML
	private Button cat_button_note;
	@FXML
	private Button cat_button_2;
	@FXML
	private Button cat_button_2_note;
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
	private ImageView add;
	@FXML
	private ImageView recette;
	@FXML
	private GridPane receipe1;
	@FXML
	private GridPane receipe2;
	@FXML
	private ImageView newRecette;
	@FXML
	private MenuButton menu;
	@FXML
	private MenuItem disconnect;
	@FXML
	private MenuItem compte;
	@FXML
	private MenuItem about;
	@FXML
	private TextField recherche;
	@FXML
	private Button addIngredient;

	private EventHandler<ActionEvent> menuItemAction() {
		return new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				MenuItem mItem = (MenuItem) event.getSource();
				switch (mItem.getText()) {
				case "Deconnection":
					try {
						Stage stage = null;
						Parent root = null;
						stage = (Stage) recherche.getScene().getWindow();
						root = FXMLLoader.load(getClass().getResource("../view/Main.fxml"));
						Scene scene = new Scene(root);
						stage.setScene(scene);
						stage.show();
						scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case "About":
					System.out.println("About");
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("About");
					alert.setHeaderText(null);
					alert.setContentText("Programmation réseau - ENSIM 2016/2017");
					alert.showAndWait();
					break;
				}
			}
		};
	}

	public void set_image(ImageView iv, boolean b, String i1, String i2) {
		if (iv != null) {
			if (!b) {
				System.out.println("activated");
				Image image = new Image(i1);
				iv.setImage(image);
			} else {
				System.out.println("activated");
				Image image = new Image(i2);
				iv.setImage(image);
			}
		}
	}

	@FXML
	private void handleButtonAction(ActionEvent event) throws IOException {

		if (event.getSource() == btn1) {
			Stage stage = null;
			Parent root = null;
			stage = (Stage) btn1.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("../view/Main.fxml"));
			Scene scene = new Scene(root);

			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());
		}
		
		if (event.getSource() == addIngredient) {
			System.out.println("Ingredient ajouté");
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Ingredients");
			alert.setHeaderText(null);
			alert.setContentText("Ingredient ajouté");
			alert.showAndWait();
		}

		if (event.getSource() == addRecette) {
			Stage stage = null;
			Parent root = null;
			stage = (Stage) addRecette.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("../view/Main.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		}
		if (event.getSource() == difficulty) {
			Stage stage = null;
			Parent root = null;
			stage = (Stage) difficulty.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("../view/Main.fxml"));
			Scene scene = new Scene(root);

			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());

		}
		if (event.getSource() == recent) {
			Stage stage = null;
			Parent root = null;
			stage = (Stage) recent.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("../view/Main.fxml"));
			Scene scene = new Scene(root);

			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());

		}
		if (event.getSource() == note) {
			Stage stage = null;
			Parent root = null;
			stage = (Stage) note.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("../view/Main_note.fxml"));
			Scene scene = new Scene(root);

			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());

		}
		if (event.getSource() == difficulty_cat) {
			Stage stage = null;
			Parent root = null;
			stage = (Stage) difficulty_cat.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("../view/main_cat.fxml"));
			Scene scene = new Scene(root);

			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());

		}
		if (event.getSource() == recent_cat) {
			Stage stage = null;
			Parent root = null;
			stage = (Stage) recent_cat.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("../view/main_cat.fxml"));
			Scene scene = new Scene(root);

			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());

		}
		if (event.getSource() == note_cat) {
			Stage stage = null;
			Parent root = null;
			stage = (Stage) note_cat.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("../view/main_cat_note.fxml"));
			Scene scene = new Scene(root);

			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());

		}
		if (event.getSource() == back) {
			Stage stage = null;
			Parent root = null;
			stage = (Stage) back.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("../view/Main.fxml"));
			Scene scene = new Scene(root);

			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());
		}
		if (event.getSource() == create_account) {
			Stage stage = null;
			Parent root = null;
			stage = (Stage) create_account.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("../view/Accueil.fxml"));
			Scene scene = new Scene(root);

			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());
		}
		if (event.getSource() == register) {
			Stage stage = null;
			Parent root = null;
			stage = (Stage) register.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("../view/register.fxml"));
			Scene scene = new Scene(root);

			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());
		}
		if (event.getSource() == cat_button) {
			System.out.println("blabla");
			Stage stage = null;
			Parent root = null;
			stage = (Stage) cat_button.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("../view/main_cat.fxml"));
			Scene scene = new Scene(root);

			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());
		}
		if (event.getSource() == cat_button_note) {
			System.out.println("blabla");
			Stage stage = null;
			Parent root = null;
			stage = (Stage) cat_button_note.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("../view/main_cat_note.fxml"));
			Scene scene = new Scene(root);

			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());
		}
		if (event.getSource() == cat_button_2) {
			Stage stage = null;
			Parent root = null;
			stage = (Stage) cat_button_2.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("../view/Main.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());
		}
		if (event.getSource() == cat_button_2_note) {
			Stage stage = null;
			Parent root = null;
			stage = (Stage) cat_button_2_note.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("../view/Main_note.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());
		}
	}

	@FXML
	private void handleNewRecette(MouseEvent event) throws IOException {
		if (event.getSource() == newRecette) {
			Stage stage = null;
			Parent root = null;
			stage = (Stage) newRecette.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("../view/CréerRecette.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
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

		if (event.getSource() == edit) {
			Stage stage = null;
			Parent root = null;
			stage = (Stage) edit.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("../view/Accueil.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());
		}

	}
	
	@FXML
	private void menuButton(MouseEvent event) throws IOException, InterruptedException {
		System.out.println("sfqsdfqddsqfqdsfdsqfdsqfdsqfdsfdsqf");
		EventHandler<ActionEvent> action = menuItemAction();

		disconnect = new MenuItem("Deconnection");
		compte = new MenuItem("Compte");
		about = new MenuItem("About");

		menu.getItems().clear();
		menu.getItems().addAll(compte, about, disconnect);

		disconnect.setOnAction(action);
		about.setOnAction(action);
		compte.setOnAction(action);
	}

	@FXML
	private void receipe_clicked(MouseEvent event) throws IOException, InterruptedException {
		if (event.getSource() == receipe1) {
			Stage stage = null;
			Parent root = null;
			stage = (Stage) edit.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("../view/Recette.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());
		}
		if (event.getSource() == receipe2) {
			Stage stage = null;
			Parent root = null;
			stage = (Stage) edit.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("../view/Recette_2.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());
		}
	}

	private boolean change(MouseEvent event, ImageView source, String img_1, String img_2, boolean b) {
		// TODO Auto-generated method stub
		if (event.getSource() == source && b) {
			System.out.println("not activated");
			Image image = new Image(img_1);
			source.setImage(image);
			b = false;
		} else if (event.getSource() == source && !b) {
			System.out.println("activated");

			Image image = new Image(img_2);
			source.setImage(image);
			b = true;
		}
		return b;
	}

	@FXML
	private void handle_add(MouseEvent event) throws IOException {
		if (event.getSource() == add) {
			Stage stage = null;
			Parent root = null;
			stage = (Stage) add.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("../view/Recette.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("../view/style.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {		
		set_image(cocktail, b.cocktail, "/image/cocktail.png", "/image/cocktail_2.png");
		set_image(apero, b.apero, "/image/apero.png", "/image/apero_2.png");
		set_image(dessert, b.dessert, "/image/dessert.png", "/image/dessert_2.png");
		set_image(entree, b.entree, "/image/entree.png", "/image/entree_2.png");
		set_image(sale, b.sale, "/image/sale.png", "/image/sale_2.png");
		set_image(sucre, b.sucre, "/image/sucre.png", "/image/sucre_2.png");
		set_image(plat, b.plat, "/image/plat.png", "/image/plat_2.png");
		set_image(glace, b.glace, "/image/glace.png", "/image/glace_2.png");
		set_image(chaud, b.chaud, "/image/chaud.png", "/image/chaud_2.png");
		set_image(froid, b.froid, "/image/froid.png", "/image/froid_2.png");
		
	}
}
