package ders04_matematikselIslemler;

public class C07_Pre_PostIncrement {
    public static void main(String[] args) {
        int a=10;
        int b =a++;//10
        int c =++b;//11
        System.out.println("a:" + a +",b:"+b+",c:"+c);

        a=20;
        b=++a;//21
        c=a++;//21
        System.out.println("" +a+b+c);

        a=30;
        System.out.println(a++);//30
        System.out.println(--a);//30
        System.out.println(a--);//30
        System.out.println(a);//29




    }
}
