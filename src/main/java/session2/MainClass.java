package session2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// TODO: 8/23/2022 Session 2 part 1 32:20 
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
//        NotificationService notificationService = applicationContext.getBean(NotificationService.class);
//        notificationService.notify("Hello! Session 2");
        Calculater calculater = applicationContext.getBean(Calculater.class);
        calculater.sqrt(-12);

    }
}
