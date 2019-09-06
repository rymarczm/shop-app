package soft.dev.academy.spring;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class OrderConfig {

    @Bean(name = "orderDao")
    public OrderDao orderDao() {
        return new OrderDaoImpl();
    }

    @Bean(name = "orderDaoInMemory")
    public OrderDao orderDaoInMemory() {
        return new OrderDaoInMemoryImpl();
    }

    @Bean(name = "orderService")
    public OrderService orderService() {
        return new OrderServiceImpl();
    }
}
