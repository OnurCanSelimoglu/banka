package OSelimoglu.Bank;

import lombok.Getter;

@Getter
public class User {
    private String adi="onur can";
    private String soyadi="selimoğlu";

    public void setAdi(String adi)
    {
        this.adi=adi;
    }

    public void setSoyadi(String soyadi)
    {
        this.soyadi=soyadi;
    }

}

