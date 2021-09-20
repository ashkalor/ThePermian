package Controller;

import Model.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OrderController {


    @FXML
    private Label orderIdLabel;

    @FXML
    private ScrollPane scroll;

    @FXML
    private GridPane grid;



    public void setOrderItem(List<Meal> meals) {

        Set set = Orders.orderIds.entrySet();
        Iterator it= set.iterator();
        while(it.hasNext()){
            Map.Entry me=(Map.Entry)it.next();
            if(me.getValue()==meals){
                orderIdLabel.setText("Order ID: "+String.valueOf(me.getKey()));
            }
        }

        try {
            int column=0;
            int row=0;
            for (Meal m : meals) {
                scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("../Views/OrderItem.fxml"));
                HBox hbox = fxmlLoader.load();
                OrderItemController orderController = fxmlLoader.getController();
                orderController.setOrderItem(m);
                grid.add(hbox, column, row++);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
