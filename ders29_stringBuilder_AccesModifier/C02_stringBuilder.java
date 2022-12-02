package ders29_stringBuilder_AccesModifier;

public class C02_stringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java Candir");//
        System.out.println(sb1.reverse());//ridnaC avaJ
        System.out.println("muitabledir. metodla kalıcı oldu:"+sb1);//ridnaC avaJ

        System.out.println(sb1.insert(0,"."));//.ridnaC avaJ
        System.out.println(sb1);//.ridnaC avaJ

        sb1.reverse();
        System.out.println(sb1);//Java Candir.

        StringBuilder sb2=new StringBuilder("Java Candir.");
        String str="Java Candir.";
        //System.out.println(sb2==str);farklı iki data turu karsılastırılamaz
        System.out.println(sb1==sb2);//false içerik aynı olsa bile
        System.out.println(sb1==sb1);//true sadece kendisi ile true verir

        System.out.println(sb1.equals(sb2));//false içerik aynı olsa bile
        System.out.println(sb1.equals(sb1));//true

        System.out.println(sb1.equals(str));//false CTE vermez ama herzaman false olur

        System.out.println(sb1.compareTo(sb2));//0
        StringBuilder sb3=new StringBuilder("Java Kandir"); //'A' da albiliyor
        System.out.println(sb1.compareTo(sb3));//-8 C K dan 8 geride  -8  Hala olsa 2 verecekti

        //sb3.compareTo() tamamen aynı ise 0 verir yoksa ilk farklı harfe bakar ve harf farkını verir
        // tamamen aynı mı sorusu cevabı








    }
}
