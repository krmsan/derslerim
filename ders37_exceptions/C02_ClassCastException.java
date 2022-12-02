package ders37_exceptions;

public class C02_ClassCastException {
    public static void main(String[] args) {
        short sayi1=23;
        int sayi2=sayi1;

        Short sayi3=23;
       // Integer sayi4=sayi3; olmaz cunku bunlar class

        Object obj=sayi3;
        System.out.println("Short tan objeya cast edince: "+obj);

        Integer sayi5=(Integer) obj;//ClassCastException verir
        System.out.println("Short datayi obje uzerinden ıneteger a cevirince : "+sayi5);//uckagit yemez


    }
}
