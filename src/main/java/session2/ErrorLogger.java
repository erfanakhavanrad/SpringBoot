package session2;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ErrorLogger implements ApplicationListener<ErrorEvent> {
    @Override
    public void onApplicationEvent(ErrorEvent event) {
        System.out.println("SQRT error with input: " + event.getNumber());
    }
}
