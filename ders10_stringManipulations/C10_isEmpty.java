package ders10_stringManipulations;

public class C10_isEmpty {
    public static void main(String[] args) {

        String str= "";
        System.out.println(str.isEmpty());//true
        System.out.println(str.isBlank());//true
        str="   ";
        System.out.println(str.isEmpty());//false
        System.out.println(str.isBlank());//true

        str ="x";
        System.out.println(str.isEmpty());//false
        System.out.println(str.isBlank());//false
        str="ali ";
        System.out.println(str.isEmpty());//false
        System.out.println(str.isBlank());//false

        System.out.println(str.length());//4

        str =null;
        //System.out.println(str.isEmpty());
        //System.out.println(str.isBlank());
    }
}
