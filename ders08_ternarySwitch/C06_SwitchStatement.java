package ders08_ternarySwitch;

public class C06_SwitchStatement {
    public static void main(String[] args) {
        //girilen gun no sunun ismi yazdır

        int gunNo = 4;

        if (gunNo == 1) {
            System.out.println("pazartesi");
        } else if (gunNo == 2) {
            System.out.println("salı");
        } else if (gunNo == 3) {
            System.out.println("carsamba");

        } else if (gunNo == 4) {
            System.out.println("persembe");

        } else if (gunNo == 5) {
            System.out.println("cuma");

        } else if (gunNo == 6) {
            System.out.println("cumartesi");

        } else if (gunNo == 7) {
            System.out.println("pazar");
        } else {
            System.out.println("yanlıs");

        }
        System.out.println("*****************");

        // switch ile yazallım
        switch (gunNo) {
            case 1:
                System.out.println("pazartesi");
            case 2:
                System.out.println("salı");
            case 3:
                System.out.println("carsamba");
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("ggecersiz");
        }


    }
}
