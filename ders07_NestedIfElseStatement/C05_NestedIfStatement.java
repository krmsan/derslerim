package ders07_NestedIfElseStatement;

public class C05_NestedIfStatement {
    public static void main(String[] args) {

        ////- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //        //alirsa %15, yoksa %10 indirim yapin

        //Ana degisken kart olsun
        int urunAdi=10;
        boolean kart=true;

        double fiyat=10;
        double topfiyat=0;

        if (kart){
            // varsa
            if (urunAdi<0){
                System.out.println("hatalı gris");
            } else if (urunAdi<=10) {
                topfiyat=urunAdi*fiyat*0.85;
                System.out.println("%15 indirimli top fiyat"+ topfiyat);
                double x=0;
                x=fiyat-(fiyat*15/100);
                System.out.println("veya boyle :" + x * urunAdi);

            }else {
                topfiyat=urunAdi*fiyat*0.80;
                System.out.println("%20 indirimli top:" + topfiyat);
            }

        }else {
            //yoksa
            System.out.println("kart yok ise:");
            if (urunAdi<0){
                System.out.println("hatalı gris");
            } else if (urunAdi<=10) {
                topfiyat=urunAdi*fiyat*0.90;
                System.out.println("%10 indirimli top fiyat"+ topfiyat);

            }else {
                topfiyat=urunAdi*fiyat*0.85;
                System.out.println("%15 indirimli top:" + topfiyat);
            }
        }
    }
}
