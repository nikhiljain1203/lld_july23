package Observer;

import java.io.FileReader;

public class EmailSender implements OrderPlacedSubscriber{

    public EmailSender() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void announceOrderPlaced() {
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("Email is sending");
    }
}
