package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {


        // Kullanıcıdan bir dikdörtgenin en ve boyunu alıp alan ve çevresini hesaplayan kodu yazin.

        Scanner input = new Scanner(System.in);

        System.out.println("kısa kenar gir:");
        int kisaKenar = input.nextInt();
        System.out.println("uzun kenari gir:");
        int uzunKenar = input.nextInt();

        System.out.println("çevresi: "+ 2*(kisaKenar+uzunKenar));
        System.out.println("alan: "+ kisaKenar*uzunKenar);

    }
}
