package ders17_Scope;

public class C02_ClassLevelVariable {

   // class level variablar methodların dısında olusturulur
    //genel kural en ustte olustururulur
    static String hasteneIsmi ="yidiz hastanesi"; //class variable dır her yerden ulasılır
    static int hastaSayisi=23453;
    static String basHekimIsmi;
    String persIsmi="isim girilmedi"; // instance veya object variables dır
    String perstelefonu="tel girilmedi";
    int persYasi;

    public void sfds(){
        System.out.println(hastaSayisi);
    }

    public static void main(String[] args) {

        System.out.println(hasteneIsmi);

        System.out.println(basHekimIsmi);//null yazar
       // System.out.println(persYasi); yazamayız static degil
        // deger atanmamıs ise ; 0 false '' ve null atar(objeler için null)
        //System.out.println(persIsmi); static olmadıgı icin yazmaz



    }

    public static void method1(){
        System.out.println(hasteneIsmi);
        System.out.println(hastaSayisi);
        hastaSayisi++;
        //System.out.println(persIsmi); yine yazmaz static method cunku


    }
    public void method2(){
        System.out.println(hasteneIsmi);// static degisken de olsa yazar
        hastaSayisi++;
        System.out.println(persIsmi);// artık yazabiliriz method static degil
        System.out.println(persYasi);// 0 yazar


    }
}
