package ders27_ImmutableClass_DateAndTime;

public class C03_StringPool {
    public static void main(String[] args) {


        String a = ""; // string hepsini stringlestirir
        a += 2;
        a += 'c';
        a += false;// her seferinde yeni point atar artık 2cfalse havuzdadır ama ekleyerek gittik a havuzda degil

        if (a == "2cfalse") System.out.println("==");// yeni atamalr yapmıs referanslar degisti deger aynı olsada
        if (a.equals("2cfalse")) System.out.println("equals");//equals yazar


        String s="Hello";
        String t= new String(s);
        if ("Hello".equals(s)) System.out.println("one");
        if(t==s)System.out.println("two");
        if(t.equals(s)) System.out.println("three");
        if("Hello"==s)System.out.println("four");
        if("Hello"==t)System.out.println("five");
    }
}
