package ders30_encapsulation;

public class C01_Encapsulations {
    public static void main(String[] args) {
        AEncapsuleClass pers1 = new AEncapsuleClass();
        //pers1.hastaneIsmi="Java Hastanesi";  private oldugu icin gorulemez
        // pers1.hastaUcreti=10000; private oldugu icin kullanilamaz
        //pers1.hemsireAdresi="Ankara"; private oldugundan ulasilamaz
        // pers1.hemsireIsmi="Yildiz Yildiz";
        System.out.println(pers1.getHastaneIsmi()); // Yildiz Hastanesi
        pers1.setHastaUcreti(500);
        // getter ve setter method'lari
        // bazen de erisimi sinirlandirmak icin degil
        // kullanicilarin islevi iyi anlamasi icin kullanilir
        System.out.println(pers1.getHemsireAdresi());//merhaba
        pers1.setHemsireAdresi("Istanbul");//null
        System.out.println(pers1.getHemsireIsmi());//null
        System.out.println(pers1.getHemsireAdresi());//meraba istanbul

        pers1.sayi=7; //private degil atama yapabildik

        System.out.println(pers1.getSayi());//0
        System.out.println(pers1.str);//null

        System.out.println(AEncapsuleClass.str);//null
    }
}