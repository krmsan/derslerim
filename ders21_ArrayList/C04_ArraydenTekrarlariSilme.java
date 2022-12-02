package ders21_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {
        //tekrar eden sayilari bir kere olacak sekilde array i düzenleyin
        int[] arr={1,2,3,4,5,6,7,1,1,1,2,2,2,4,3,4,4,};

        List<Integer> tekrarsizListe=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!tekrarsizListe.contains(arr[i])){
                tekrarsizListe.add(arr[i]);
            }

        }
        System.out.println(tekrarsizListe);//[1, 2, 3, 4, 5, 6, 7]


        arr=new int[tekrarsizListe.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=tekrarsizListe.get(i);


        }
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 7]
    }
}
