package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08_doWhile {
    public static void main(String[] args) {

        System.out.println(listeOlustur());
    }

    public static List<String> listeOlustur() {

        List<String> isimler = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        String girilenIsim;
        do {

            System.out.println("Lutfen listeye eklemek icin isim giriniz" +
                    "\nBitirmek icin q'ya basin");
            girilenIsim = scan.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")) {
                isimler.add(girilenIsim);
            }
        } while (!girilenIsim.equalsIgnoreCase("q"));//true oldugu surece do tekrar calısır  false alta gecer

        return isimler;
    }
}
