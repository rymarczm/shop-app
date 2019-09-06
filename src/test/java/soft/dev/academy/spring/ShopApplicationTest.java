package soft.dev.academy.spring;

        import org.junit.Assert;
        import org.junit.Test;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShopApplicationTest {

    @Test
    public void shouldLoadApplicationContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext("soft/dev/academy/spring/applicationContext.xml");
    }

    @Test
    public void shouldShop1IsSingleton() {
        ApplicationContext context = new ClassPathXmlApplicationContext("soft/dev/academy/spring/applicationContext.xml");
        Shop shop = (Shop)context.getBean("shop1");
        Shop sameShop = (Shop)context.getBean("shop1");
        Assert.assertEquals(shop, sameShop);
    }

    @Test
    public void shouldShop2IsNewObject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("soft/dev/academy/spring/applicationContext.xml");
        Shop shop = (Shop)context.getBean("shop2");
        Shop sameShop = (Shop)context.getBean("shop2");
        Assert.assertNotEquals(shop, sameShop);
    }
}