package ders29_stringBuilder_AccesModifier;

public class C05_Accesm {
    public static void main(String[] args) {

        C04_AccesModifier obj =new C04_AccesModifier();

        obj.isim="tugay"; //yeni atama yaptık
        System.out.println(obj.isim);//tugay

        //System.out.println(obj.ad);private ulasamayız
        //System.out.println(obj.sayi);private ti gelmez sayi

        C04_AccesModifier obj2=new C04_AccesModifier();
        System.out.println(obj2.isim);//Ali  c04 te boyleydi

    }
}
