package ders32_inheritanceConstructorCall;

public class Araba {
    Araba(){
        System.out.println("Parametresiz Araba constructor");
    }

    Araba(String p1){
        System.out.println("Parametreli Araba constructor");
    }

    //deneme yaptım staic olmalı child dı da
    public void adresYazdir(){
        System.out.println("Okul Adres");
    }
}
