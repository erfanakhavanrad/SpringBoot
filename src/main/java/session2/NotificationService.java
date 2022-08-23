package session2;

public abstract class NotificationService {

//    Notifier notifier;

    // This if for Constructor Injection
//    public NotificationService(Notifier notifier) {
//        this.notifier = notifier;
//    }

    public void notify(String message) {
        String styled = "[Subject:Notification] [content:" + message + "]";
        getNotifier().notify(styled);
    }

    public abstract Notifier getNotifier();

//    This setter is for using Setter Injection
//    public void setNotifier(Notifier notifier) {
//        this.notifier = notifier;
//    }
}
