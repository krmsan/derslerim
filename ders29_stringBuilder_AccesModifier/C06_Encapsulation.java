package ders29_stringBuilder_AccesModifier;

import java.util.ArrayList;
import java.util.List;

public class C06_Encapsulation {
    /*
    gorme (read) veya degistirme (write) bagımsız olarak
    duzenlemek istenebilir

    baska claslardan erisim sınılandırılabilir

    ulasılabilene hem okuma hem yazma yapılabilirken
    ulasılamayana ne okunur ne yazılır

     yetki sınırlama yapmak istersek

     birlikete (read ve write ) yapılacaksa acces modifier
     yeterli olur

     eger read and write ayrılacaksa access modifier
     yeterli olmaz

     Encapsulation ( getter ve setter metotları)kullan

     */
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(5);

        sayilar.get(1);// okumaya izin var(read)
       // sayilar.get(1)=10; atamaya izin yok (write)

        //System.out.println(sayilar.set(1)); set varsa
        //mutlaka deger atamalıyız (write)


    }
}
