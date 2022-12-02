package ders08_ternarySwitch;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {

        //JDK J: Java  D: Development K: Kit
        //bir harf al JDK ise yazdır
        //degilse gecersiz yaz

        Scanner scan = new Scanner(System.in);
        System.out.println("harf gir");
        char harf = scan.next().charAt(0);
        switch (harf) {
            case 'J':
            case 'j':
                System.out.println("Java");
                break;
            case 'D':
            case 'd':
                System.out.println("Development");
                break;
            case 'K':
            case 'k':
                System.out.println("Kit");
                break;
            default:
                System.out.println("gecersiz");
        }
    }
}
