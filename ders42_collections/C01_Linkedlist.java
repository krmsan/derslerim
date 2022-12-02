package ders42_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> ll1=new LinkedList<>();
        ll1.add("K");
        ll1.add("T");
        //linkedlist 3 tane ınterface i implement etmiştir
        // list queue. deque
        // ilk connrete clas oldugundan tum  absatract metotları override etmıstır
        // Linkedelist olustururken bu 3 den birinin ozelliklerini alabilir
        // linkedlist yazılırsa hepsini toptan alır
        // alabilirm

        List<String>ll2=new LinkedList<>();
        ll2.add("R");
        ll2.add("Z");
        ll2.add(0,"A");//A R Z
        ll2.addAll(2,ll1);
        System.out.println(ll2);//[A, R, K, T, Z]

        ll2.remove(3);//indexi yaz sil
        System.out.println(ll2);//[A, R, K, Z]

        String a="K";
        ll2.remove(a);//obje olmalı Integer gibi
        System.out.println(ll2);//[A, R, Z]
        System.out.println(ll2.retainAll(ll1));//true
        ll2.add("a");
        ll2.add("b");
        ll2.add("c");

        System.out.println(ll2);//[a, b, c]
        System.out.println("ll2.hashCode() = " + ll2.hashCode());//126145
        System.out.println("ll2.subList(1,2) = " + ll2.subList(1,2 ));//ll2.subList(1,2) = [b]

    }
}
