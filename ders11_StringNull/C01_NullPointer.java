package ders11_StringNull;

public class C01_NullPointer {
    public static void main(String[] args) {


        String str1=""; //bi deger atanmıs
        System.out.println(str1);
        System.out.println(str1.concat("Java"));//java

        String str2;// deger atanmadı yazmaz yazdırılamaz CTE verir  metot da alamaz
        //System.out.println(str2);kırmızı cizer
        //System.out.println(str2.concat(".")); deger atamnmadıgı icin metot ile kullanılamaz
        //System.out.println(str2+"asasa"); yine olamaz

        str2="Java candir";
        System.out.println(str2.concat("."));//Java candir.

        String str3=null;// deger atanmadı ama farkındayız diyoruz ama yazdırabiliriz

        System.out.println(str3);// null işaretlendigini yazdırır
        System.out.println(str3+"Java");//nullJava yazar + ile birlestirilebilir
       // System.out.println(str3.concat("java"));// hata verir metotla kullanılmaz
        //derleme zamanında sekle bakar ama calısınca hata verir

        //System.out.println(str3.toLowerCase());//.NullPointerException metot almaz







    }
}
