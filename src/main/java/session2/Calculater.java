package session2;

import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Calculater implements ApplicationEventPublisherAware {

    ApplicationEventPublisher applicationEventPublisher;

    public double sqrt(int number) {
        if (number < 0) {
            ErrorEvent errorEvent = new ErrorEvent(this, number);
            applicationEventPublisher.publishEvent(errorEvent);
        }
        return Math.sqrt(number);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
