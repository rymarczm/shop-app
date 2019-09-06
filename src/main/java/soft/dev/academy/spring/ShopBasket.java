package soft.dev.academy.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.Random;
import java.util.UUID;

public class ShopBasket implements InitializingBean, DisposableBean {

    public String getName() {
        return name;
    }

    private String name;

    public ShopBasket(String name) {
        this.name = name;
    }

    private Long id;

    public void destroy() throws Exception {
        System.out.println("Destoy basket with id="+id);
    }

    public void afterPropertiesSet() throws Exception {
        Random random = new Random();
        id = random.nextLong() ;
    }

    public Long getId() {
        return id;
    }
}
