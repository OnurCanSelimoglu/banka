package OSelimoglu.Bank;

public class garantiBankasi extends BankService {
    public garantiBankasi(double bakiye) {
        super(bakiye);

    }

    public String getBankaAdi() {
        return "Garanti Bankası";
    }
}
