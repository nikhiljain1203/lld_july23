package AdapterDesign;

import AdapterDesign.component.icicibank.IcIcIBankApi;

public class IciciBankApiAdapter implements BankApiAdapter {

    private IcIcIBankApi icIcIBankApi = new IcIcIBankApi();
    @Override
    public double getBalance(String accNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String from, String to, int amt) {
        return false;
    }
}
