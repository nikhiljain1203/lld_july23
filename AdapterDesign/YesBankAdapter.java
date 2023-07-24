package AdapterDesign;

import AdapterDesign.component.yesbank.YesBankApi;

public class YesBankAdapter implements BankApiAdapter {
    private YesBankApi yesBankApi = new
            YesBankApi();
    @Override
    public double getBalance(String accNumber) {
        //double balance = yesBankApi.checkBalance(accNumber);
        return 0;
    }

    @Override
    public boolean sendMoney(String from, String to, int amt) {
        return false;
    }
}
