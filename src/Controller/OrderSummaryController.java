package Controller;

import Model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.*;

public class OrderSummaryController implements Initializable {


    @FXML
    private GridPane grid;
    @FXML
    private Label totalPriceLabel;

    @FXML
    private ScrollPane scroll;
    private Scene scene;
    private Stage stage;
    private Parent root;
    private Double totalPrice=0.0;
    Cart obj=new Cart();
    Order order=new Order();
    private static Integer incrementer =0 ;

    public void finishHandler(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Views/Orders.fxml")));
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
        List<Meal> cartItems=new ArrayList<>();
        order.setMeals(obj.getCartItems());
        List<Meal> meals=order.getMeals();
        scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        for(Meal m:meals){
            Cart.cartItemsQuantity.put(m.getMid(), Collections.frequency(meals,m));
            if(!cartItems.contains(m)){
                cartItems.add(m);
            }
        }
        System.out.println(Cart.cartItemsQuantity.values());
        int column=0;
        int row=0;
        double cartItemPrice;
        try {
            for (Meal meal : cartItems) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("../Views/CartItem.fxml"));
                HBox hbox = fxmlLoader.load();
                CartItemController cartItemController = fxmlLoader.getController();
                cartItemController.setMealItem(meal);
                grid.add(hbox, column, row++);
                cartItemPrice=(meal.getMealPrice()*(Cart.cartItemsQuantity.get(meal.getMid())));
                totalPrice += cartItemPrice;
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        totalPriceLabel.setText("Total Price: "+ Main.CURRENCY+totalPrice);
        if(!cartItems.isEmpty()){
        Orders.addOrders(cartItems);
        Orders.orderIds.put(++incrementer,cartItems);
        }
        obj.clearCart();
        Main.ENCuisine=false;
        Main.INCuisine=false;
        Main.ENCuisine=false;
        Main.ITCuisine=false;
        Main.JACuisine=false;
        Main.CHCuisine=false;
        Main.FRCuisine=false;
        int bufferSize= 8*1024;
        File file=new File("D:/Software Development/java/ThePermian/src/Data/orders.txt");
        try {
            if(file.createNewFile()) {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:/Software Development/java/ThePermian/src/Data/orders.txt", false), bufferSize);
                bufferedWriter.write("============================================\n");
                bufferedWriter.write("                     BILL");
                bufferedWriter.newLine();
                bufferedWriter.write("============================================");
                bufferedWriter.newLine();
                bufferedWriter.flush();
                String data = String.format("%-25s %s    %s \r\n", "Item", "Quantity", "Price");
                bufferedWriter.write(data);
                bufferedWriter.write("--------------------------------------------");
                bufferedWriter.newLine();
                for (Meal m : cartItems) {
                    cartItemPrice = (m.getMealPrice() * (Cart.cartItemsQuantity.get(m.getMid())));
                    data = String.format("%-25s  %s%3x   %10.2f \r\n", m.getMealName(), "x", Cart.cartItemsQuantity.get(m.getMid()), cartItemPrice);
                    bufferedWriter.write(data);
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                }
                bufferedWriter.write("============================================");
                bufferedWriter.newLine();
                data = String.format("%s %x                    %s %5.2f", "OrderID:", incrementer, "TOTAL:", totalPrice);
                bufferedWriter.write(data);
                bufferedWriter.newLine();
                bufferedWriter.write("============================================");
                bufferedWriter.newLine();
                bufferedWriter.newLine();
                bufferedWriter.newLine();
                bufferedWriter.close();
            }else{
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:/Software Development/java/ThePermian/src/Data/orders.txt", true), bufferSize);
                bufferedWriter.write("============================================\n");
                bufferedWriter.write("                     BILL");
                bufferedWriter.newLine();
                bufferedWriter.write("============================================");
                bufferedWriter.newLine();
                bufferedWriter.flush();
                String data = String.format("%-25s %s    %s \r\n", "Item", "Quantity", "Price");
                bufferedWriter.write(data);
                bufferedWriter.write("--------------------------------------------");
                bufferedWriter.newLine();
                for (Meal m : cartItems) {
                    cartItemPrice = (m.getMealPrice() * (Cart.cartItemsQuantity.get(m.getMid())));
                    data = String.format("%-25s  %s%3x   %10.2f \r\n", m.getMealName(), "x", Cart.cartItemsQuantity.get(m.getMid()), cartItemPrice);
                    bufferedWriter.write(data);
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                }
                bufferedWriter.write("============================================");
                bufferedWriter.newLine();
                data = String.format("%s %x                    %s %5.2f", "OrderID:", incrementer, "TOTAL:", totalPrice);
                bufferedWriter.write(data);
                bufferedWriter.newLine();
                bufferedWriter.write("============================================");
                bufferedWriter.newLine();
                bufferedWriter.newLine();
                bufferedWriter.newLine();
                bufferedWriter.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
