package ders25_staticKeyword;

public class YeniCalisma {
    static int sayi = 20;
    int yas = 10;

    public YeniCalisma() {   //constructor
        sayi++;
        yas++;
    }

    public static int metod() {
        return 2 * sayi;
    }
    public static int metod2(YeniCalisma x) {
        x.yas++;

        return 0;
    }

    public static int metod3(String x) {

        return 0;
    }


    public static void main(String[] args) {
        YeniCalisma obj2 = new YeniCalisma();
        obj2.sayi++;
        YeniCalisma.sayi++;
        obj2.yas++;
        metod2(obj2);
        String s = new String();
        s="xx";
        metod3(s);

        System.out.println("yas"+obj2.yas);
        System.out.println(obj2.sayi);
        System.out.println("yen obj:"+YeniCalisma.sayi);
        YeniCalisma obj = new YeniCalisma();
        System.out.println(obj.sayi);
        System.out.println("--------------------------");

        int sonuc = obj.metod();//obj ustunden cagırmıs
        sonuc = obj2.metod();

        YeniCalisma obj3 = new YeniCalisma();

        System.out.println(sonuc);//44
        System.out.println(obj.yas + " " + obj2.yas + "  " + obj.sayi + " obj.sayi= " + YeniCalisma.sayi);

        sonuc = obj.metod();
        sonuc=YeniCalisma.metod();//aynı sey usttekiyle
        System.out.println(sonuc);//46
    }
}
