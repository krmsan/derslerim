package ders17_Scope;

public class C01_LocalVariables {
    static String st="sdf";
    char ch;
    int sy=6;
    public static void main(String[] args) {
        // bir method'un icerisinde olusturulan variable'larin scope'u
        // icinde olusturulduklari method'dur
        // o method'un disindan ULASILAMAZLAR

       // static String st="sdf"; metotun içinde static var olmaz

        int sayi=10;
        String isim="Ramazan";
        // System.out.println(dogruMu);

        for (int i = 0; i <10 ; i++) {
            String adres="Ankara";
        // bir loop icerisinde olusturulan variabler sadece o loop icerisinde gecerlidir
        }

        // System.out.println(adres);

        double pi;

        // System.out.println(pi);
        // local variable'lar deger atamadan olusturulabilir ancak KULLANILAMAZ
        // kullanmadan once deger atanmis OLMALIDIR.

        // dogruMu=true; baska bi static methodda da olsa burda gozukmez
method1();
    }

    public static void method1(){

       // sy=8; static olunca instance gormedi
        C01_LocalVariables obje=new C01_LocalVariables();
        obje.met();//obje olusunca static olmayan metotu goruyor
        obje.sy=9;//aynı sekilde sy yi boylece gormus oldu
        System.out.println("obje.ch = " + obje.ch);// default deger hiçliktir char ın bisey yok ama konsol kare gibi bişey gosteriyor anla diye
        st="kjhkj";
        System.out.println(st);
        // System.out.println(sayi);
        // isim ="tugay";

        boolean dogruMu=true;

    }
    public void met(){
       // static String str3="sdf";method içinde static var olmaz
        int ins=6;

        st="fgh";
        System.out.println(st); //clas level static olunca heryer goruyor
        sy=9;
        System.out.println(sy);//instance olunca gordu
    }
}
