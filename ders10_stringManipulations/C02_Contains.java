package ders10_stringManipulations;

public class C02_Contains {
    public static void main(String[] args) {

        String str= "Java ile kodlama cok zevkli";
        System.out.println(str.contains("cok"));//true
        System.out.println(str.contains("odla"));//true charSequence: char dizisi string olur
        System.out.println(str.contains("a"));//true
       // System.out.println(str.contains('s')); parametre olarak char kabul etmez ''
        System.out.println(str.contains("java"));//false

        String str2="Java";
        System.out.println(str.contains(str2));//true
         str.contains("asd");// biseye ata yada yazdır
        System.out.println("Java"+str.contains("Java ile k"));//javatrue
        System.out.println("Java"+str.contains(" "));//javatrue



    }
}
