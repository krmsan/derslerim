package ders35_exception;

import java.util.Scanner;

public class C03_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        //bir index isteyin verilen array de indekste ki elementi yazdir

        int[] arr={1,2,3,4,5,6,7,8,9};
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir index giriniz");
        int index=scanner.nextInt();

        try {
            System.out.println(arr[index]);//ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException hata) {
            System.out.println("hata.getMessage() = " + hata.getMessage());//hata.getMessage() = Index 34 out of bounds for length 9
            hata.printStackTrace();//tum hata mesajını verir ama kodlar calısmaya devam eder
            //java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 9
            //	at ders35_exception.C03_ArrayIndexOutOfBoundsException.main(C03_ArrayIndexOutOfBoundsException.java:15)
            //catch blogunda hicbir kod olamsa bile normal calısmaya devam eder
            // ne yazdıracagın senın elinde istersen yazdırma veya sablon ifade kullan b
        }

        //  C03_ArrayIndexOutOfBoundsException.java:14    Index 9 out of bounds for length 9


    }
}
