package ders15_overloading_whileloop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

        // toplama
        // 0 a basarsa bitir
        // kac sayi gridigini ve toplamını bul

        Scanner scan=new Scanner(System.in);
        int sayi1=11;
        int sayac =0;
        int toplam=0;

        while (sayi1!=0){

            System.out.println("sayı gir"+"\n bitirmek icin 0'a bas");
            sayi1 = scan.nextInt();

            if (sayi1!=0){
                sayac++;
                toplam=toplam+sayi1;

            }
            System.out.println("girilen sayı adedi:"+sayac + "toplamı: "+toplam);
        }




    }
}
