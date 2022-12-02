package ders03_datacastigWrapperClass;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        //tam sayı gir
        //kac girilirse girilsin -128 ile 127 arası birdeger yaz
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi gir");

        int sayi1=scan.nextInt();
        byte sayi2= (byte) sayi1;
        System.out.println("girdiginiz"+sayi1+"donusen sayi:"+sayi2
        );
    }
}
