package OSelimoglu.Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
@SpringBootApplication

public class BankApplication  {


	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
		Scanner scan=new Scanner(System.in);

		System.out.println("Banka Seçiniz :");
		System.out.println("1-) Garanti Bankası");
		System.out.println("2-) Ziraat Bankası");


		int secim=scan.nextInt();


		User user =new User();

		garantiBankasi garantiBankasi = new garantiBankasi(7000); // örnek bakiye
		if(secim==1)
		{
			garantiBankasi.getYatirilanpara();
		}


		ziraatBankasi ziraatBankasi = new ziraatBankasi(5000); //örnek bakiye
		if(secim==2){ziraatBankasi.getYatirilanpara();}



					switch (secim) {

						case 1 -> {
							System.out.println(user.getAdi()+" " +user.getSoyadi()+ " Adına " + garantiBankasi.getBankaAdi() + "na " + garantiBankasi.getYatanpara() + " tl para yatırıldı.");
							System.out.print("Toplam Bakiye " + garantiBankasi.getToplam() + "tl");
						}
						case 2 -> {
							System.out.println(user.getAdi() +" "+user.getSoyadi()+ " Adına " + ziraatBankasi.getBankaAdi() + "na " + ziraatBankasi.getYatanpara() + " tl para yatırıldı.");
							System.out.print("Toplam Bakiye " + ziraatBankasi.getToplam() + "tl");
						}
						default -> System.out.println("Hata");
					}
		}




	}