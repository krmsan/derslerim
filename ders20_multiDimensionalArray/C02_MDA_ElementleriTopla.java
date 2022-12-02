package ders20_multiDimensionalArray;

import java.util.Arrays;

public class C02_MDA_ElementleriTopla {
    public static void main(String[] args) {


        int[] arr1 = {3, 5, 7, 8};
        int toplam = 0;
        for (int i = 0; i < arr1.length; i++) {
            toplam += arr1[i];

        }
        System.out.println("tek katlı array toplamı:" + toplam);//23
        //////////////////////////////////////////
        int[][] arr = {{1, 2}, {3, 4, 5}, {7}};
        toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam += arr[i][j];
            }
        }
        System.out.println("2 katlı array toplamı: " + toplam);//22
/////////////////////////////////////////////////////////////////
        toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            int[] arr2 = arr[i];
            for (int j = 0; j < arr2.length; j++)
                toplam += arr2[j];
        }

        System.out.println("arr2 li olan top:" + toplam);


    }

    public static int[] twoSum(int[] nums, int target) {
        int[] x={0,0};
        for (int i = 0; i < nums.length; i++) {
            int hedef=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==hedef){
                    x[0]=i;
                    x[1]=j;
                    break;
                }
            }
        }
        return x;


    }

        public int[] twoSum2(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[] { i, j };
                    }
                }
            }
            // In case there is no solution, we'll just return null
            return null;
        }

}
