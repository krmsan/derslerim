package ders07_NestedIfElseStatement;

public class C03_nestedIf {
    public static void main(String[] args) {
        //Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        //yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.
        //cinsiyet ve yasa bak
        // kadın 60 erkek 65

        char cinsiyet='K';
        int yas =14;

        //ana degisken cinsiyet olsun

        if (cinsiyet=='k' || cinsiyet=='K'){
            //kadın

            if (yas<15){
                System.out.println("hatalı yas girisi");
            } else if (yas<60) {
                System.out.println("emekli olmak icin:"+ (60-yas) +"yıl daha caıls" );

            }else {
                System.out.println(" Kadın için emekli ol");
            }


        } else if (cinsiyet=='e' || cinsiyet=='E') {
            //erkek

            if (yas<15){
                System.out.println("hatalı yas girisi");
            } else if (yas<65) {
                System.out.println("emekli olmak icin:"+ (65-yas) +"yıl daha caıls" );

            }else {
                System.out.println("emekli ol erkek");
            }



        }else {
            System.out.println("yanlıs cinsiyet girisi");
        }


    }
}
