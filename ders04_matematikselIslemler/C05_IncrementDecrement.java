package ders04_matematikselIslemler;

public class C05_IncrementDecrement {
    public static void main(String[] args) {
        int sayi=10;

        sayi=sayi+3;
        System.out.println(sayi);

        sayi += 3;
        System.out.println(sayi);

        int s =10;
        s=s+1;
        System.out.println(s);

        s +=1;
        System.out.println(s);

        s++;
        System.out.println(s);

        ++s;
        System.out.println(s);

        int t=10;
        t=t-1;//9
        t-=1;//8
        t--;//7
        --t;//6
        System.out.println(t);

    }
}
