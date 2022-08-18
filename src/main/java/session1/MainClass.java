package session1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Processor processor = applicationContext.getBean(Processor.class);
        processor.process("Spring course ");
    }
}
