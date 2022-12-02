package ders10_stringManipulations;

public class C06_indexof {
    public static void main(String[] args) {

        String str="Ahmet hoca ile hersey clear";
        System.out.println(str.indexOf("a"));//9 ilk a indexi
        System.out.println(str.indexOf('c'));// 8
        System.out.println(str.indexOf("hersey"));//15 h nin kini alır hersey i blok kabul eder
        System.out.println(str.indexOf("e",9));//13
        System.out.println(str.indexOf("e",14));//16    13 yazarsam 13 getiriyor
        //2. c nin inndexini bul
        int ilkc=str.indexOf("c");//8
        System.out.println(str.indexOf("c",ilkc+1));//22
        System.out.println(str.indexOf("ali"));//-1
        System.out.println(str.indexOf("x"));//-1







    }
}
