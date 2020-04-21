package pe.edu.dps.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList;

    public Broker() {
        orderList = new ArrayList<>();
    }

    public void takeOrder(Order order ) {
        orderList.add( order );
    }

    public void placeOrders() {
        for( Order order : orderList ) {
            order.execute();
        }
        orderList.clear();
    }
}
