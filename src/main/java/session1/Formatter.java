package session1;

import org.springframework.stereotype.Component;

// @Component is no longer required because it's declared as @Bean in ApplicationConfig.class
//@Component
//public class Formatter {
//    public String format(String message) {
//        return "# " + message.toUpperCase() + "#";
//    }

public abstract class Formatter {
    public abstract String format(String message);
}
