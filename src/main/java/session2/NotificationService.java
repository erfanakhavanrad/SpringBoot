package session2;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public abstract class NotificationService {

//    Notifier notifier;

    // This if for Constructor Injection
//    public NotificationService(Notifier notifier) {
//        this.notifier = notifier;
//    }
    String subject;
//
//    @Autowired
//    @NotifierType("advanced")
    Notifier advancedNotifier;

    @PostConstruct
    public void init() {
        System.out.println("Notification service is ready.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Notification service is destroyed.");
    }

    public void notify(String message) {
        String styled = "[Subject:" + subject + "] [content:" + message + "]";
        getNotifier().notify(styled);
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public abstract Notifier getNotifier();

    public void setAdvancedNotifier(Notifier advancedNotifier) {
        this.advancedNotifier = advancedNotifier;
    }

    //    This setter is for using Setter Injection
//    public void setNotifier(Notifier notifier) {
//        this.notifier = notifier;
//    }
}
