package ders42_collections;

import java.util.List;
import java.util.Scanner;

public class C02_LinkedListsoru {
    public static void main(String[] args) {
        //2 string liste olustur
        // girmeyi bırakmak için 0 'a bas
        // iki liste olustuktan sonra output
        // liste1 : .....
        // liste2 : .....
        // ortak elemnetler : .........i
        System.out.println("once list1 i olustur");
        List<String> list1= new java.util.ArrayList<>(kullanicidanAlarakListOlustur());//ilginc oldu
       // List<String> list1= kullanicidanAlarakListOlustur();//retainAll ustu sarı boyalı duzeltince usteki gibi oluyo
        System.out.println("list2 olustur");
        List<String>list2=kullanicidanAlarakListOlustur();
        System.out.println("list1 = " + list1);//list1 = [a, b, f, e]
        System.out.println("list2 = " + list2);//list2 = [b, e, f, n]
        System.out.println("list1.retainAll(list2) = " + list1.retainAll(list2));//false
       list1.retainAll(list2);
        System.out.println(list1);//[b, f, e]

    }
    public static List<String> kullanicidanAlarakListOlustur(){
        Scanner scan=new Scanner(System.in);
       //
        String isim="";

        while (!scan.hasNextInt()){
            System.out.println("Listeye eklemek icin isim giriniz \nBitirmek icin sayi giriniz");
            isim+=scan.next()+" ";
        }

        isim=isim.trim();

        System.out.println(isim);
    if (scan.nextInt() == 0) {
        return List.of(isim.split(" "));
    }


        return List.of(isim.split(" "));
    }
}
