package ders10_stringManipulations;

public class C08_lastIndexOf {
    public static void main(String[] args) {
        String str= "Java hafiften beyin yakıyor";
        System.out.println(str.lastIndexOf("a"));//21
        System.out.println(str.lastIndexOf('e'));// char 15
        System.out.println(str.lastIndexOf("java"));// -1
        System.out.println(str.lastIndexOf("Java"));// 0
        System.out.println(str.lastIndexOf("e",14));//11


    }
}
