package Test;

import com.ydlclass.*;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("atuowired.xml");
        User bean =  context.getBean(User.class);

        log.warn("{}:{}",Thread.currentThread().getName(),bean);
    }
    @Test
    public void IOCLifeCycle() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        A bean =  context.getBean(A.class);
        context.close();

    }




}
