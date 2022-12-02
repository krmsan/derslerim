package ders25_staticKeyword;

public class C04_PassByValue {

    public static void main(String[] args) {

        double fiyat = 100;

        System.out.println(indirimUygula(fiyat));// 90

        System.out.println(fiyat); // 100
    }

    public static double indirimUygula(double fyt) {
        // %10 indirim yapsin

        fyt= fyt*0.9;  // fiyata atama yaptik kalici olarak 90 oldu

        return fyt;
    }
}
