package ders27_ImmutableClass_DateAndTime;

public class C02_StringPool {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        //basit olusturmalar da strinpool olur referansı (stack mem)olusturmadan önce havuza bakar aynısı varmı
        //str1 str2 referansı aynı olur havuz mantıgından dolayı

        String str3 = new String("Java"); // once obje olusturur sonra referansa bakar

        String str4 = "";
        str4 = "Java";

        String str5 = "Ja";
        str5 = str5.concat("va");

        // == hem refrans hem deger aynı olamlı
        // equals sadece degerleri karsılastırır

        System.out.println(str1.equals(str2)); // true referansları aynıdır
        System.out.println(str1 == str2); // true

        System.out.println(str1.equals(str3)); // true
        System.out.println(str1==str3);//false referansları farklı new ile olustu

        System.out.println(str1.equals(str4)); // true
        System.out.println(str1 == str4); // true

        System.out.println(str1.equals(str5)); // true
        System.out.println(str1 == str5); // false
    }
}

