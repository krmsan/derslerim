package ders09_String;

public class C05_length {
    public static void main(String[] args) {

        String str = "Uzunkavaklaralindayataruyumazoglu";
        System.out.println(str.length());//33

        System.out.println(str.charAt(32));//u
        System.out.println(str.charAt(str.length()-1));//u
        System.out.println(str.charAt(str.length()-2) + ""+ str.charAt(str.length()-1));//lu "" yoksa rakam yazar char cunku



    }
}
