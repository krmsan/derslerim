package ders09_String;

public class C02_Equals {
    public static void main(String[] args) {

        String str ="Ali";
        String str2 ="ali";

        String str3=new String("Ali");
        String str4="Ali";

        System.out.println(str==str2);//false
        System.out.println(str==str3);//false   ????? yanlıslar olmasın diye equals()metotu kullan
        System.out.println(str==str4);//true
        System.out.println(str.equals(str2));//false
        System.out.println(str.equals(str3));//true simdi dogru oldu
        System.out.println(str.equals(str4));//true




    }
}
