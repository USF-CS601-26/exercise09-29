package factorymethod;

public class Main {

    static void main(String[] args) {
        NotificationService service =
                new EmailService();
        service.notifyUser("Your order has shipped.");
        service = new SMSService();
        service.notifyUser("Your order has shipped.");
    }
}