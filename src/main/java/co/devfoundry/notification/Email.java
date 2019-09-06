package co.devfoundry.notification;

import co.devfoundry.order.Order;

public class Email implements Observer{
    public void update(Order order){
        System.out.println("Email - Zamówienie nr: " + order.getOrderNumber() + " zmieniło status na " + order.getOrderStatus());
    }


}
