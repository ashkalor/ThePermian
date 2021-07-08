package Controller;

import Model.Meal;
import Model.Orders;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

public class OrdersController implements Initializable {

    @FXML
    private Pane pane;

    @FXML
    private ScrollPane scroll;

    @FXML
    private GridPane grid;
    private Scene scene;
    private Stage stage;
    private Parent root;
    public void backHandler(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Views/MainMenu.fxml")));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<List<Meal>>orders= Orders.getOrders();
        int column=0;
        int row=0;
        scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        try {
            System.out.println(orders);
            for (List<Meal> order : orders) {
                System.out.println(order);
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("../Views/Order.fxml"));
                VBox vbox = fxmlLoader.load();
                OrderController orderController = fxmlLoader.getController();
                orderController.setOrderItem(order);
                if(column==3){
                    column=0;
                    row++;
                }
                grid.add(vbox, column++, row);

            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}