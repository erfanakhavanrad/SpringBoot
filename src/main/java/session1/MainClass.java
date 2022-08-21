package session1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MainClass {
    // Old version using XML files.
    public static void oldMain(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Processor processor = applicationContext.getBean(Processor.class);
        processor.process("Spring course ");
    }

    // Preferred version for nowadays
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Processor processor = applicationContext.getBean(Processor.class);
        processor.process("Spring course ");

        Date date = applicationContext.getBean(Date.class);
        System.out.println(date);

        date = applicationContext.getBean(Date.class);
        System.out.println(date);

        date = applicationContext.getBean(Date.class);
        System.out.println(date);

        InstituteDescription instituteDescription = applicationContext.getBean(InstituteDescription.class);
        System.out.println(instituteDescription);


    }

}
