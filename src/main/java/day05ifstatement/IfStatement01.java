package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

// kullanıcıdan alınan sayının tek mi çift mi old. yazin

        Scanner input = new Scanner(System.in);

        System.out.println("bir sayi giriniz: ");
        int s = input.nextInt();

        if (s%2==0){
            System.out.println("cift sayi");
        }
        if (s%2!=0){
            System.out.println("tektir");
        }
// ilk yöntem 2 kere kontrol edildiği için daha yavaş çalışır

// 2.YOL
        if (s%2==0){
            System.out.println("cift sayi");
        }
        else{
            System.out.println("tektir");
        }

//ex: bir sayının negatif pozitif ve ya nötr old. söyleyen kodu yazın

        System.out.println("sayi girin");
        double sayi=input.nextDouble();

        if (sayi<0){
            System.out.println("negatif");
        }
        else if (sayi>0){
            System.out.println("pozitif");
        }
        else {
            System.out.println("nötr");
        }






    }

}
