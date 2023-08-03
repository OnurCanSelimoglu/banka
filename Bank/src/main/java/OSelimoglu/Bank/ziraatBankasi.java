package OSelimoglu.Bank;

public class ziraatBankasi extends BankService {
    public ziraatBankasi(double bakiye) {
        super(bakiye);

    }

    public String getBankaAdi() {
        return "Ziraat Bankası";
    }
}