package ders04_matematikselIslemler;

public class C08_Pre_Post_Increment {
    public static void main(String[] args) {
        int x=3;

        int y= 2 * ++x;//8

        int z= 5 + y--;//13
        System.out.println(x+y+z);//24


    }
}
