package ders15_overloading_whileloop;

import java.util.Scanner;

public class C08_faktoryel {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("sayı gir");
        int sayi = scan.nextInt();

        int x = faktoriyelHesapla1(sayi);

        System.out.println(x);//24 kullanıcıdan gelen
        System.out.println(faktoriyelHesapla1(5));//120

        faktoriyelHesapla(6);//720 void olan

        //System.out.println(faktoriyelHesapla(5)); void yazmaz içi
    }

    public static void faktoriyelHesapla(int sayi) {
        int sonuc = 1;

        while (sayi > 0) {
            sonuc = sonuc * sayi;  // sonuc*=sayi
            sayi--;

        }
        System.out.println(sonuc);
        //saidinf(5)
        // saidinf(5)=5*saidinf(4)
        // saidinf(4)=4*saidinf(3)
        // saidinf(3)=3*saidinf(2)
        // saidinf(2)=2*saidinf(1)
        // saidinf(1)=1
        // 5*4*3*2*1

    }
    public static int saidinf(int sayi){
        if(sayi > 1){
            int sondeg=sayi*saidinf(sayi -1);
            return sondeg;

        }else{
            return sayi;
        }

    }


    public static int faktoriyelHesapla1(int sayi) {
        int sonuc = 1;

        while (sayi > 0) {
            sonuc = sonuc * sayi;  // sonuc*=sayi
            sayi--;

        }
        return sonuc;

    }
}
