import com.ydlclass.*;
import com.ydlclass.dao.OrderDao;
import com.ydlclass.env.MyPropertySource;
import com.ydlclass.listener.*;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;

@ImportResource("application.xml")
public class TestIoc {
    private static final Logger log = LoggerFactory.getLogger(TestIoc.class);
    @Test
    public void IOC() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserDao bean = context.getBean(UserDao.class);
        bean.hello();
    }
    @Test
    public void IOCStaticFactory() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserServers bean = (UserServers) context.getBean("servers");
        log.warn("{}:{}",Thread.currentThread().getName(),bean);

    }
    @Test
    public void IOCStaticFactory2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserServers bean = (UserServers) context.getBean("servers");
        bean.setUserDao(new UserDao());
        bean.hello();
        log.warn("{}:{}",Thread.currentThread().getName(),bean);
    }
    @Test
    public void IOCConstructor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserServers bean = (UserServers) context.getBean("userServers");

        bean.hello();
        log.warn("{}:{}",Thread.currentThread().getName(),bean);
    }
    @Test
    public void IOCUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        User bean =  context.getBean(User.class);

        log.warn("{}:{}",Thread.currentThread().getName(),bean);
    }
    @Test
    public void IOCAtuoWired() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        User bean =  context.getBean(User.class);

        log.warn("{}:{}",Thread.currentThread().getName(),bean);
    }
    @Test
    public void IOCLifeCycle() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        A bean =  context.getBean(A.class);
        context.close();

    }
    @Test
    public void testScan() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("scan.xml");
        OrderDao bean =  context.getBean(OrderDao.class);
        log.warn("{}:{}",Thread.currentThread().getName(),bean);

    }
    @Test
    public void testScan2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.register(OrderDao.class);
//        context.register(OrderService.class);
//        context.register(OrderController.class);
        context.scan("com.ydlclass");
        context.refresh();
        OrderDao bean =  context.getBean(OrderDao.class);
        log.warn("{}:{}",Thread.currentThread().getName(),bean);

    }
    @Test
    public void testEnv() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        ConfigurableEnvironment environment = context.getEnvironment();
        MutablePropertySources propertySources = environment.getPropertySources();

        propertySources.addFirst(new MyPropertySource("myProperties"));
        String property = environment.getProperty("myProperties");
        context.refresh();
        log.info("{}",property);
    }
    @Test
    public void testValue() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);
        Myconfig bean =  context.getBean(Myconfig.class);

        log.info("{}",bean);
    }
    @Test
    public void testListener() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MessageListener.class, ContextFinish.class);

        context.publishEvent(new OderEvent(new Order("123","tyb")));

    }


}
