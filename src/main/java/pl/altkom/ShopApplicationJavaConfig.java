package pl.altkom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShopApplicationJavaConfig {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(OrderConfig.class);
        OrderService orderService = (OrderService) applicationContext.getBean("orderService");
        orderService.save();
    }
}
