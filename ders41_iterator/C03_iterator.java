package ders41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_iterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        //iterator kullanarak bu listeden 15 ile 35 arasındaki sayilari silin
        Iterator<Integer> it1 = sayilar.iterator();
        Integer element;

        while (it1.hasNext()) {
            element = (Integer) it1.next();//it1.next()  bu bir obje dondurur cast yaptık Integera

            if (element > 15 && element < 35) {
                it1.remove();
            }
        }
        System.out.println(sayilar);//[10, 40]

        sayilar.add(20);
        sayilar.add(30);
        System.out.println(sayilar);//[10, 40, 20, 30]

        //tum elementleri silelim

        Iterator it2 = sayilar.iterator();

        it2.next();
        it2.remove();//bunu direk yazarsak hata verir cunku it2.next(); demedik içi bos hata verir uste ekleyelim
        System.out.println(sayilar);//[40, 20, 30]
        it2.next();
        it2.remove();
        System.out.println(sayilar);//[20, 30]


        while (it2.hasNext()){
            it2.next();// silmeden önce yuklen diyoruz
            it2.remove();
        }
        System.out.println(sayilar);//[]
    }
}
