package ders11_StringNull;

public class C05_Repeat_trim {
    public static void main(String[] args) {
        String str = "Java guzeldir ";
        System.out.println(str.repeat(4));//4 defa yazar

        str = "     java    ";

        System.out.println(str.length());//13

        str = str.trim();

        System.out.println(str);//java
        System.out.println(str.length());//4

    }
}
