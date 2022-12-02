package ders12_loop;

public class C04_rakamlartop {
    public static void main(String[] args) {


        // rakamları top
        int sayi= 1453;

        String sayistr =""+sayi;  //  length almak için stringe cevirdik

        int birler =0;
        int rakamlarTop=0;

        for (int i = 1; i <=4; i++){    //  for (int i = 1; i <= sayistr.length() ;; i++)
            birler=sayi%10;
            rakamlarTop=rakamlarTop+birler;
            sayi=sayi/10;
        }
        System.out.println(rakamlarTop);
    }
}
