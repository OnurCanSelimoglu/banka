package OSelimoglu.Bank;

import java.util.Scanner;

public class BankService  {
    protected double Bakiye;
    public double yatirilanpara;

    Scanner scan=new Scanner(System.in);


    public void getYatirilanpara()
    {
        System.out.println("Yatırılacak tutar");
        yatirilanpara=scan.nextDouble();
    }











    public BankService(double Bakiye ) {



        this.Bakiye = Bakiye;
        this.yatirilanpara=getYatanpara();




    }

    public double getToplam(){
        return this.Bakiye + this.yatirilanpara;
    }
    public double getYatanpara(){

        return this.yatirilanpara;
    }
}

