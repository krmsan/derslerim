package ders06_IfElseStatements;

public class C10_IfElseIfstatement {
    public static void main(String[] args) {

        //Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        //yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.
        //cinsiyet ve yasa bak
        // kadın 60 erkek 65

        char cinsiyet ='E';
        int yas =60;
        if (cinsiyet=='E' && yas>=65){
            System.out.println("emekli ol");
        } else if (cinsiyet=='E'&& yas<65 && yas>15 ) {
            System.out.println("emeklilik icin" + (65-yas)+ "daha calıs");
            System.out.println("cinsiyetinizi gir E veya K");
        } else if (cinsiyet!='E' && yas>=60) {
            System.out.println("kadın emekli ol");

        } else if (cinsiyet!='E' && yas<60 && yas>15 ) {
            System.out.println("kadn emeklilik icin "+ (60-yas)+ "daha calıs" );
        }else {
            System.out.println("gecersiz giris");
        }
    }
}
