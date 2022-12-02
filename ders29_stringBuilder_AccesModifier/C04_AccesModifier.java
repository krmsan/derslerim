package ders29_stringBuilder_AccesModifier;

public class C04_AccesModifier {


        String isim="Ali";//default acces modifier bu clasatan ve package gindekilerden kullanılabilir
    // ama basına default yazılamaz  hata verir

    private String ad ="abc";
    private static int sayi=10;
    public static void main(String[] args) {

        System.out.println(sayi);//10
        sayi=200;
        System.out.println(sayi);//200
    }



}
