package ders18_Array;

public class C01_Arrays {
    public static void main(String[] args) {
        int [] arr1 ={2,4,6,8,10};
        //elementine ulasmak için ubdate etmek
        System.out.println(arr1[2]);//6
        arr1[3]=20;
        System.out.println(arr1[3]);//20
        System.out.println(arr1.length);//5
//        son element

        System.out.println(arr1[arr1.length-1]);//10
        // tum elementlerı yaz

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+ " ");//2 4 6 20 10

           // arr1[5]=35;   // RTE verir cte olmaz run time hata index dısında en fazla 4 index var


        }
    }
}
