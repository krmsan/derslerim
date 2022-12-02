package ders07_NestedIfElseStatement;

import java.util.Scanner;

public class C01_IfElse {
    public static void main(String[] args) {
        //Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        //obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse

        Scanner scan= new Scanner(System.in);
        System.out.println("kilonuz");
        double kilo= scan.nextDouble();
        System.out.println("boy");
        double boy=scan.nextDouble();

        double vke=(kilo*10000/(boy*boy));
        System.out.println("vke niz :"+ vke);

        if (vke>30){
            System.out.println("obez");
        } else if (vke>25) {
            System.out.println("kilolu");

        } else if (vke>20) {
            System.out.println("normal");

        } else if (vke>0) {
            System.out.println("zayıf");

        }else {
            System.out.println("yanlıs giris");
        }

    }
}
