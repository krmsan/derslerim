package ders03_datacastigWrapperClass;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayi=20;
        //short sh= sayi; yazmaz cunku int kucuk olan short a atamaya calısıyor
        short sh= (short) sayi;
        System.out.println(sh);

        double dbl=23.5;
        int say= (int) dbl; //23
        System.out.println(dbl);

        say=15; //int
        byte byt= (byte) say;
        System.out.println("byt:"+byt);

        say=256;  // 0 yazar -128 den 127 ye kadar
         byt= (byte) say;
        System.out.println(byt);

        say=128;  // -128 yazar -128 den 127 ye kadar
        byt= (byte) say;
        System.out.println(byt);// -128 yazar

        say=130;  // -126 yazar -128 den 127 ye kadar
        byt= (byte) say;
        System.out.println(byt);
    }
}
