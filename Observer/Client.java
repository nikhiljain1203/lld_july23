package Observer;

public class Client {

    public static void main(String[] args) {

        EmailSender emailSender = new EmailSender();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Flipkart flipkart = Flipkart.getInstance();

        flipkart.orderPlaced();
    }

}
