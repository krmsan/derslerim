package ders09_String;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali";
        String str3="ALI";

        System.out.println(str1.equals(str2));// false
        System.out.println(str1.equals(str3));// false

        System.out.println(str1.equalsIgnoreCase(str2));// true
        System.out.println(str1.equalsIgnoreCase(str3));// true

        System.out.println(str1.equalsIgnoreCase("Ali"));// true
        System.out.println(str1.equalsIgnoreCase("Ali Can"));//false
        System.out.println(str1.equalsIgnoreCase(str3));//true
        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str1.equalsIgnoreCase("ALİ"));//true
        System.out.println(str1.equalsIgnoreCase("alı"));// true




    }
}
