package ders22_arrayList;

public class C04_ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 4, 2, 6, 9, 6, 4, 5};
        // 5 den buyukleritoplayalım
        int tolam = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 5) {
                tolam += arr[i];
            }
        }
        System.out.println("for ile: "+tolam);
        /////////////////////////////////////////////////
        tolam=0;
        for (int each : arr
             ) {
            if (each>5){
                tolam+=each;
            }
        }
        System.out.println("for each : "+tolam);
    }
}
