package ders10_stringManipulations;

public class C03_StartsWith {
    public static void main(String[] args) {

        String str ="manti acarken java ogrenilmez";

        System.out.println(str.startsWith("Manti"));//false
        System.out.println(str.startsWith("m"));//true
        System.out.println(str.startsWith("manti acarken java"));//true
        System.out.println(str.startsWith(""));//true
        System.out.println(str.startsWith("acarken", 6));//true
        System.out.println(str.startsWith("manti",0));//true
        System.out.println("ne"+str.startsWith("",0));//netrue







    }
}
