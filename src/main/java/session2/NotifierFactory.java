package session2;

public class NotifierFactory {
    // Factory method
//    public static Notifier getNotifier() {
//        return new EmailNotifier();
//    }

//    FactoryBean
    public Notifier getNotifier() {
        return new EmailNotifier();
    }

}
