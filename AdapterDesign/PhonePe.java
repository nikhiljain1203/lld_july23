package AdapterDesign;

public class PhonePe {
    private BankApiAdapter bankAPI;

    public PhonePe(BankApiAdapter bankAPI) {
        this.bankAPI = bankAPI;
    }

    double doSomething() throws InterruptedException {
        double currentBalance = bankAPI.getBalance("accountNumber");
        Thread.sleep(25 * 24 * 60 * 60 * 1000);
        return currentBalance * 2;
    }
}
