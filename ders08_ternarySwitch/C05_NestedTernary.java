package ders08_ternarySwitch;

public class C05_NestedTernary {
    public static void main(String[] args) {
        //Ornek : Kullanicidan bir tamsayi alin.
        //Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani
        //yazdirin
        //Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden
        //uygun olani yazdirin
        int sayi = 20;
        if (sayi > 0) {
            //cift sayı mı dedil mi
            System.out.println(sayi % 2 == 0 ? "cift" : "degi");
        } else {
            //3 basamaklı mı degil mi
            System.out.println(sayi < -99 && sayi > -1000 ? "3 basamaklı" : "3 basamaklı degil");
        }

        String sonuc = sayi > 0
                ?
                sayi % 2 == 0 ? "Cift" : " cift degil"
                :
                sayi < -99 && sayi > 1000 ? "3basamaklısayi" : "degil";
        System.out.println(sonuc);

        int a = 1;
        int b = 20;
        System.out.println(a > 5 ? a > 0 ? 100 : 50 : a < 20 ? a + 5 : a - 5);

    }
}
