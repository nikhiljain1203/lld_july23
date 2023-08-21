package Models;

public class Payment extends BaseEntity{
    private PaymentMode paymentMode;
    private int amount;
    private PaymentStatus paymentStatus;
    private String referenceId;
}
