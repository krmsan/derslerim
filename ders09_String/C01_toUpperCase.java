package ders09_String;

import java.util.Locale;

public class C01_toUpperCase {
    public static void main(String[] args) {


        System.out.println("dsakjdask".toUpperCase());
        String str="java mutluluk";
        System.out.println(str.toUpperCase());

        System.out.println(str);//java mutluluk

        str=str.toUpperCase();
        System.out.println(str);// JAVA MUTLULUK
        str ="ince mehmet";

        str =str.toUpperCase();
        System.out.println(str);//INCE MEHMET

        //str=str.toLowerCase();
        //System.out.println(str);//ince mehmet
        System.out.println(str.toLowerCase());// ince

        System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));//ınce




    }
}
