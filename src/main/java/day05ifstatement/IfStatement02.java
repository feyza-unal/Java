package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//ex: kullanıcı gün numarasını girsin kod ismini yazsın
        System.out.println("bir sayi girin:");
        int sayi=input.nextInt();
        if (sayi==1){
            System.out.println("sunday");
        } else if (sayi==2) {
            System.out.println("monday");
        } else if (sayi==3) {
            System.out.println("tuesday");
        } else if (sayi==4) {
            System.out.println("wednesday");
        } else if (sayi==5) {
            System.out.println("thursday");
        } else if (sayi==6) {
            System.out.println("friday");
        }else if (sayi==7){
            System.out.println("saturday");
        }else{
            System.out.println("1-7 arasi sayi girin");

        }

    }
}
