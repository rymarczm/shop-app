package pl.altkom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShopApplication {

    public static void main(String[] args) {
	// write your code here
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "pl/altkom/applicationContext.xml");
        Shop shop1=(Shop)applicationContext.getBean("shop1");
        System.out.println(shop1.getName());
        Shop shop2 = (Shop)applicationContext.getBean("shop2");
        System.out.println(shop2.getName());
        ShopBasket shopBasket = (ShopBasket)applicationContext.getBean("shopBasket");
        System.out.println(shopBasket.getId());
        System.out.println(shopBasket.getName());
        ((ClassPathXmlApplicationContext) applicationContext).refresh();
        OrderService orderService = (OrderService) applicationContext.getBean("orderService");
        orderService.save();
    }
}
