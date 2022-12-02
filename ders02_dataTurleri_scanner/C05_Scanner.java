package ders02_dataTurleri_scanner;
import java.util.Scanner;
public class C05_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan double ve int al
        ///toplamı ve carpımını bul

        Scanner scan = new Scanner(System.in);


        System.out.println("ondalklı sayı gir");
        double ondalikliSayi= scan.nextDouble();

        System.out.println("tam sayı gir");
        int tamSayi= scan.nextInt();

        System.out.println(ondalikliSayi+tamSayi);

        System.out.println("toplamı: " + (ondalikliSayi+tamSayi));
        System.out.println("carpımları: " + (ondalikliSayi*tamSayi));


    }
}
