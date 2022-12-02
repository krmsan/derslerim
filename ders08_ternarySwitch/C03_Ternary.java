package ders08_ternarySwitch;

public class C03_Ternary {
    public static void main(String[] args) {

        int a = 5;
        // a%2==0 ? "cift sayi" :"tek sayı" //yanlış olur sonuc üretir ternary ya atama yap yada yazdır.
        String sonuc = a % 2 == 0 ? "cift sayi" : "tek sayı";
        System.out.println(sonuc);
        System.out.println(a % 2 == 0 ? "cift sayi" : "tek sayı");
        //
        // String sonuc2=a>10 ?"buyuk sayı":2*a;// yanlış 2*a string degil CTE verir

        String sonuc2=a>10 ?"buyuk sayı":""+2*a;// cte vermemesi için




    }
}
