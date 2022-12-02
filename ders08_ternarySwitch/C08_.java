package ders08_ternarySwitch;

public class C08_ {

    public static void main(String[] args) {


        //Soru 6- Kullanicidan ay numarasini alip mevsimi yazdirin.

        int ayNO = 1;
        switch (ayNO) {

            case 12:
            case 1:
            case 2:
                System.out.println("kıs");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilk bahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("son bahar");
                break;
            default:
                System.out.println("gecersiz");
        }

                System.out.println("**********if il yapalım********");
                            // if ile
                if (ayNO == 1 || ayNO == 2 || ayNO == 12) {
                    System.out.println("kıs");

                } else if (ayNO == 3 || ayNO == 4 || ayNO == 5) {
                    System.out.println("ilk bahar");
                } else if (ayNO == 6 || ayNO == 7 || ayNO == 8) {
                    System.out.println("yaz");
                } else if (ayNO == 9 || ayNO == 10 || ayNO == 11) {
                    System.out.println("son bahar");
                } else{
                    System.out.println("gecersiz");
                }
    }

}


