package ders03_datacastigWrapperClass;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {
        char x='a';
        char y='b';
        System.out.println(x);//a
        System.out.println("char top:"+ x+y);//ab
        System.out.println(x+y);// 195
        System.out.println(""+(x+y));//195

        String cev=""+(x+y);
        System.out.println(cev);//195
        int str =Integer.parseInt(cev);// string i int yaptık
        System.out.println(str);//195

        String cb="12"+x+y;
        System.out.println(cb);//12ab
        System.out.println('a'+'b'); //97 + 98 = 195

        System.out.println(cev+5);//1955 yazar cunku string
        System.out.println(Integer.parseInt(cev)+5);// 200 yapar int cevirdik cunku
        System.out.println(Integer.parseInt(cev+1)+5);//1956 topladı 6 ekledi 195 e

        Scanner scan=new Scanner(System.in);

        System.out.println("bir karakter gir");
        char girilenKrk=scan.next().charAt(0);
        int dnm=(char)(girilenKrk+1);
        int dnm2=(char) (girilenKrk+2);
        System.out.println(dnm+dnm2);//197
        System.out.println(""+dnm+dnm2);//9899
        System.out.println(girilenKrk);//a

        System.out.println('a'+(girilenKrk)+(girilenKrk+1)+(girilenKrk+2)+(girilenKrk+3));//491
        System.out.println((char)(girilenKrk+1)+ (char)(girilenKrk+2)+(char)(girilenKrk+3));//297
        System.out.println(""+ (char)(girilenKrk+1)+ (char)(girilenKrk+2)+(char)(girilenKrk+3));// bcd

        System.out.println(""+ (girilenKrk+1)+(girilenKrk+2)+(girilenKrk+3));//9899100 yazar

    }
}
