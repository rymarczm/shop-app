package soft.dev.academy.spring;

public class OrderDaoInMemoryImpl implements OrderDao {

    public void save() {
        System.out.println("save memory order dao");
    }
}
