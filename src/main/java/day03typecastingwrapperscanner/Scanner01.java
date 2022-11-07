package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {
    // SCANNER KULLANICIDAN DATA ALMAYA YARAR
    // KULLANICI İLE ETKİLEŞİM KURMAMIZI SAĞLAR
    // SCANNER JAVANIN util KÜTÜPHANESİNDEDİR

    public static void main(String[] args) {

        // Scanner yazıp enter dersek otomatik import eder.


        //  Kullanıcıdan data almak için yapılması gerekenler

        //  1.Adım Scanner Class'ından object oluşturun

        Scanner input = new Scanner(System.in);

        // 2.Adım Kullanıcıya ne yapacağını söyle

        System.out.println("hey kullanici yasini gir :");

        // 3.Adım Kullancıdan aldığınız datayı bir variable içine koyun
        byte age=input.nextByte();

        System.out.println("hey kullanici yasin: " +age);


    }
}
