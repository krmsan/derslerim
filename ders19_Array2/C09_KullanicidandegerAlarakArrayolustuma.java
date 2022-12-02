package ders19_Array2;

import java.util.Arrays;
import java.util.Scanner;

public class C09_KullanicidandegerAlarakArrayolustuma {
    public static void main(String[] args) {
        //kullanıcıdan sayi al array olustur
        //bitirmek icin 0 baas
        Scanner scan = new Scanner(System.in);
        int[] arr = {0};
        int girilenSayi = 0;

        do {
            System.out.println("Arraye eklemek icin sayılar giriniz" +
                    "\nbitirmek icin 0 a basın");
            girilenSayi = scan.nextInt();

            if (arr[0] == 0) {
                arr[0] = girilenSayi;
            } else if (girilenSayi != 0) {
                arr = C08_ArrayeelemanEklemeMethodu.arrayeelemanEkle(arr, girilenSayi);


            }


        } while (girilenSayi != 0);
        System.out.println(Arrays.toString(arr));//[3, 5, 6, 4]

    }
}

