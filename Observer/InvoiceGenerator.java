package Observer;

public class InvoiceGenerator implements OrderPlacedSubscriber{

    public InvoiceGenerator() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        generateInvoice();
    }

    private void generateInvoice() {
        System.out.println("Invoice is generating");
    }
}
