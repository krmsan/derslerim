package ders03_datacastigWrapperClass;

public class C05_WrapperClass {
    public static void main(String[] args) {
        int sayi=10;
        String str="Java ";
        //sayi. bisey olmaz metod almaz primitive int cunku ama wrapper classla yapılabilir.

        //String.valueOf(str);
        char krk='b';
        Character krkWrapper='c';
        System.out.println(Character.isLetter('5'));//false
        System.out.println(Character.isDigit('7'));//true


        String str1="123";
        String str2="12";
        //topla bunları

        System.out.println(str1+str2);//12312
        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));//135
        // İnteger.parseİnteger(str) yazınca rakam gibi topalar str int a cevrilir

        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Short.MIN_VALUE);//-32768



    }
}
