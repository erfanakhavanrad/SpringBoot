package session2;

import org.springframework.context.ApplicationEvent;

public class ErrorEvent extends ApplicationEvent {

    int number;

    public ErrorEvent(Object source, int number) {
        super(source);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
