package ders07_NestedIfElseStatement;

public class C04_NestedIfElse {
    public static void main(String[] args) {

        //Yasa gore

        int yas = 65;
        char cinsiyet = 'k';


        if (yas < 15) {
            System.out.println("hatalı giris");


        } else if (yas < 60) {
            // emekli olamaz cinsiyet calısması gereken yılı belirler

            System.out.println("emekli olamazsın");
            if (cinsiyet == 'K' || cinsiyet == 'k') {
                System.out.println("meeklilik ici" + (60 - yas) + "yıl daha calıs");
            } else if (cinsiyet == 'E' || cinsiyet == 'e') {
                System.out.println("emeklilige" + (65 - yas) + "daha var");

            } else {
                System.out.println("atalı cinsiyrt girisi");
            }

        } else if (yas < 65) {
            //kadın ise emekli erkek ise yasa baglı
            if (cinsiyet == 'K' || cinsiyet == 'k') {
                System.out.println("emekli olabilir");
            } else if (cinsiyet == 'E' || cinsiyet == 'e') {
                System.out.println(" erkek ise emeklilige" + (65 - yas) + "daha var");

            } else {
                System.out.println("hatalı cinsiyrt girisi");
            }

        } else {
            System.out.println("emekli olabilirsiniz");
        }


        //yeni deneme    nested iç içe demek
        String cins = "Kadin";
        int yasi = 61;

        if (cins == "Kadin" && yasi >= 60) {
            System.out.println("Kdınlar emekli");
        } else if (cins == "E" && yasi >= 65) {
            System.out.println("erkekler emekli");

        } else {
            System.out.println("hatalı giris");
        }


    }
}
