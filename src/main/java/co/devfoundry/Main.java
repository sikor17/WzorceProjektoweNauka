package co.devfoundry;

import co.devfoundry.notification.Email;
import co.devfoundry.notification.MobileApp;
import co.devfoundry.notification.TextMessage;
import co.devfoundry.order.Order;
import co.devfoundry.order.OrderStatus;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(110l, OrderStatus.ZAREJESTROWANE);
        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();
    order.registerObserver(textMessage);
    order.registerObserver(mobileApp);
    order.registerObserver(email);
    order.notifyObserver();
        System.out.println("---------------------------------");

    order.changeOrderStatus(OrderStatus.WYSŁANE);
    order.unregisterObserver(email);
        System.out.println("---------------------------------");
    order.changeOrderStatus(OrderStatus.ODEBRANE)
    ;

    }
}
