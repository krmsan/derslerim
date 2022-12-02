package ders24_constructors;

public class Rope {

     void swing(){
        System.out.println("swing");
    }

    public static void main(String[] args) {

        Rope rope=null;
        //rope.swing();//NullPointerException

        Rope rope1 =new Rope();
        rope1.swing();//swing

    }
}
