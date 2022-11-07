package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
/*
            Kullanicidan gun sayisini aliniz ve gun ismini ekrana yazdiriniz
            1 ==> Pazar       2 ==> Pazartesi   ...
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Gun numarasini giriniz");
        byte gunNo = input.nextByte();

// 1. YOL if ile çözün

        if (gunNo==1){
            System.out.println("pazar");
        } else if (gunNo==2) {
            System.out.println("p.tesi");
        } else if (gunNo==3) {
            System.out.println("sali");
        } else if (gunNo==4) {
            System.out.println("çarş");
        } else if (gunNo==5) {
            System.out.println("perş");
        } else if (gunNo==6) {
                System.out.println("cuma");
        } else if (gunNo==7) {
                System.out.println("c.tesi");
        } else {
            System.out.println("1-7 arasi deger girin");
        }

// 2.YOL
        switch(gunNo){
            case 1:
                System.out.println("pazar");
                break;
            case 2:
                System.out.println("p.tesi");
                break;
            case 3:
                System.out.println("sali");
                break;
            case 4:
                System.out.println("çarş");
                break;
            case 5:
                System.out.println("perş");
                break;
            case 6:
                System.out.println("cuma");
                break;
            case 7:
                System.out.println("c.tesi");
                break;
            default:
                System.out.println("1-7 arasi deger girin");
        }














    }
}
