package ders35_exception;

public class C02_AritmeticException {
    public static void main(String[] args) {

        //iki sayıyı bolup tam kısmı yaz

        int sayi1= 20;
        int sayi2=10;

        try {
            //riski öngördügumuz kodlar   calıştırmayi dene diyoruz
            System.out.println(sayi1/sayi2);//ArithmeticException     : / by zero   ctrl alt t  suuraund with

            System.out.println("bu satır calısır mı? eger exception olusursa calısmaz ,ust satır");

        } catch (Exception e) {
            //catch (Exception e) ongordumuz risk
            System.out.println("sayı 0 a bolunmez");
            //catch blogu risk gerceklesirse yapılacaklar kodlar  / exceotion ile karşılasırsa calısacak
            //throw new RuntimeException(e);  bu otamatik geliyor siliyoruz
        }
        //at ders35_exception.C02_AritmeticException.main(C02_AritmeticException.java:11)

        //bazı hatalar if else ile handle edilebilir

        if (sayi2!=0){
            System.out.println(sayi1/sayi2);
        }else System.out.println("0 a bolunmez");

    }
}
