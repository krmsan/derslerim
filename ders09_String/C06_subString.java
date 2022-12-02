package ders09_String;

public class C06_subString {
    public static void main(String[] args) {

        String str = "Java ogren, isi kap";

        System.out.println(str.substring(5));// ogren, isi kap
        System.out.println(str.substring(0));// Java ogren, isi kap
        System.out.println(str.length());//19

        // son karakteri String yaz normalde char olur karakter

        System.out.println(str.charAt(str.length() - 1));//p
        String sonHarf =""+ str.charAt(str.length()-1);// "" ekledikki string olsun.
        sonHarf =str.substring(str.length()-1);
        System.out.println(sonHarf);//p

        //  son indexi karakteri upper case yazdır

        System.out.println(str.substring(str.length()-1).toUpperCase());//P

        // son 3 harfi buyuk yaz

        System.out.println(str.substring(str.length()-3).toUpperCase());//KAP


    }
}
