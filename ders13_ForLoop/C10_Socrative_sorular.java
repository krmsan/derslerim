package ders13_ForLoop;

public class C10_Socrative_sorular {
    public static void main(String[] args) {


        int sum = 0;
        for (int i = 10; i > 0; i = i - 5) {
            sum = sum + i;
            System.out.println(sum);
        }
        System.out.println(sum);


        for (char i = 'f'; i > 'a'; i--) {
            System.out.print(i + " ");//fdb
            i--;
        }


        for (int i = 1; i <= 5; i++) {
            for (int j = (5 - i); j > 1; j--) {
                System.out.print(i + j);

            }
            System.out.println();
        }
    }
}
