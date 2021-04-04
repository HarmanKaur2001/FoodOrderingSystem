package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer extends Person{
    private int orderId;
    private ArrayList<String> orders;
    
    public Customer(String firstName, String lastName, String address, String gender, LocalDate birthday, int orderId) {
        super(firstName, lastName, address, gender, birthday);
        setOrderId(orderId);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        if(orderId >=5)
            this.orderId = orderId;
        else
            throw new IllegalArgumentException("order id must be greater or equals than 5");
    }

    public ArrayList<String> getOrders() {
        return orders;
    }

    public void addOrders(String items) {
        if(items.matches("cake"))
            orders.add(items);
        else 
            throw new IllegalArgumentException("Not contains the items");
    }
}
