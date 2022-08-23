package session2;

public class EmailNotifier implements Notifier {
    @Override
    public void notify(String message) {
        System.out.println("Email is sending with message: " + message);
    }
}
