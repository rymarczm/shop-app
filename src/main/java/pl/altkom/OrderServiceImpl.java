package pl.altkom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class OrderServiceImpl implements OrderService {

    @Autowired
    @Qualifier("orderDaoInMemory")
    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void save() {
        System.out.println("save order service");
        orderDao.save();
    }
}
