package ders05_concatination_operatorler;

public class C02_ {
    public static void main(String[] args) {

        int a=10;
        int b=15;
        System.out.println(a == b);//false
        System.out.println(a==b-5);//true
        boolean c;
        System.out.println(c=15==b);//true ve c=15 degil
        c=15*a==10*b;
        System.out.println(c);//true

        System.out.println(a!=b);//true
        System.out.println(a!=b-5);//false

        System.out.println(c=15>=b && a<0);//false and && ise ilk yanlısta biter & ise hepsine bakar

        System.out.println(a>b || b>0);//true || veya








    }
}
