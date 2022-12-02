package ders07_NestedIfElseStatement;

import java.util.Scanner;

public class C02_IfElseIfStatement {
    public static void main(String[] args) {

        //- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        Scanner scan = new Scanner(System.in);
        System.out.println("urun adedi");
        int urunAdedi = scan.nextInt();

        System.out.println("liste fiyati");
        double fiyat = scan.nextDouble();

        System.out.println("musteri kartı varmı");
        boolean kartVarmi = true;

        double topFiyat = 0;

        //if (urunAdedi>10 && kartVarmı==true){
        //  System.out.println("yuzde 20 mi indirim: " + (fiyat-fiyat*20/100));
        // }

        //boolean kartVarmı=true;
        boolean kartVarmı = false;
        if (kartVarmı == true && urunAdedi >= 10) {
            topFiyat = urunAdedi * fiyat * (0.8);  //top=urun*(x=fiy-0.2*fiy)
            System.out.println("%20 indirimli: " + topFiyat);
        } else if (kartVarmı == true && urunAdedi < 10 && urunAdedi > 0) {
            topFiyat = urunAdedi * fiyat * (0.85);
            System.out.println("%15 indirimli: " + topFiyat);

        } else if (kartVarmı == false && urunAdedi >= 10) {
            topFiyat = urunAdedi * fiyat * (0.85);
            System.out.println("%15 indirimli :" + topFiyat);

        } else if (kartVarmı == false && urunAdedi < 10 && urunAdedi > 0) {
            topFiyat = urunAdedi * fiyat * (0.90);
            System.out.println("%10 indirimli: " + topFiyat);

        } else {
            System.out.println("gecersiz giris");

        }
    }
}
