package Controller;

import Model.Cart;
import Model.Meal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class OrderSummaryController implements Initializable {

    @FXML
    private Pane pane;

    @FXML
    private ScrollPane scroll;

    @FXML
    private GridPane grid;

    private List<Meal> meals;
    private Scene scene;
    private Stage stage;
    private Parent root;
    public static List<Meal> orderItems = new ArrayList<>();

    public void finishHandler(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Views/Welcome.fxml")));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void backHandler(ActionEvent event) throws IOException {

        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Views/MainMenu.fxml")));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
        MainMenuController mainMenuController=new MainMenuController();

    }
    public void mainMenuHandler(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Views/MainMenu.fxml")));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Cart obj=new Cart();
        meals=obj.getCartItems();

        int count=0;
        for(Meal m:meals){
            Cart.cartItemsQuantity.put(m.getMid(), Collections.frequency(meals,m));
            if(!orderItems.contains(m)){
                orderItems.add(m);
            }
        }
        System.out.println(Cart.cartItemsQuantity.values());


    }
}
