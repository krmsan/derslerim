package ders15_overloading_whileloop;

public class C02_Overloading {
    public static void main(String[] args) {


        carpim(3,5);
        carpim(3.5,10);


    }

    public static void carpim(int sayi1, int sayi2) {
        System.out.println(" iki int carpimi :" + sayi1 * sayi2);
    }

    // aynı isme ve signature sahip iki metot olmaz
    //    public  static void carpim(int sayi1, int sayi2){
    //        System.out.println(" iki int carpimi :"+sayi1*sayi2);
    //    }

    public static void carpim(int sayi3, int sayi4, int sayi5) {      //problem yapmaz 3 tane int oldu
        System.out.println(" uc int carpimi :" + sayi3 * sayi4 * sayi5);
    }
    public  static void carpim(double sayi1, int sayi2){    // problem yapmaz double dedik birine
        System.out.println(" iki sayi carpimi :"+sayi1*sayi2);
    }

}
