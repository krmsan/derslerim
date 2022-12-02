package ders12_loop;

public class C02_Forloops {

    public static void main(String[] args) {

        for (int i =0; i<=10; i++){
            System.out.print(i+" ");
        }
        System.out.println("");

        for (int i =0; i<=10; ++i){
            System.out.print(i + " ");
        }
        System.out.println("b");

        // 2 basamaklı 7 ile bolunen yan yana yaz
        for (int i =10; i<100; i++){
            if (i%7==0){
                System.out.print(i+"a");
            }

        }
        System.out.println("c");
        // 13 den basla 100 kadar 7 ser 7 ser artır
        for (int i =13; i<=100; i+=7){
            System.out.print(i+" ");
        }
        System.out.println("d");
        // 1 den 10 kareleri yaz
        for (int i=1; i<=10; i++){
            System.out.print(i*i+ " ");
        }

    }
}
