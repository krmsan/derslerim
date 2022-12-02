package ders17_Scope;

public class C03_ObjectVariables {
    static String hasteneIsmi = "yidiz hastanesi";
    static int hastaSayisi = 23453;
    static String basHekimIsmi;
    String persIsmi = "isim girilmedi";
    String perstelefonu;
    int persYasi;

    //class level variable ların scope u tum clas static ile isaretlenenlere class variable de denir.her yerden ulasılabilir
    //static degilse instance varable deniir object variable da denir


    public static void main(String[] args) {

        C03_ObjectVariables objectVrb = new C03_ObjectVariables();
        String abc =objectVrb.persIsmi;
        System.out.println(objectVrb.persIsmi);

        st();


    }

    public static void st() {
        hastaSayisi++;
        System.out.println("method sonucu=>" + hastaSayisi);


    }
}
