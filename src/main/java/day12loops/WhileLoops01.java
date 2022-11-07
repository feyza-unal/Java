package day12loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

// Ex1: 3den 10a kadar tamsayiları aynı satırda ekrana yazdıran kodu yazın
        for (int i=3; i<11; i++){
            System.out.print(i+" ");
        }

        System.out.println();
//2.yol
        int i=3;
        while (i<11){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();

//Ex2: 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz
        int k=17;
        while (k>3){
            if (k%2==0) {
                System.out.print(k + " ");
            }
            k--;
        }
        System.out.println();

//Ex3: 12 den 15 ye kadar sayıların toplamını veren kodu yazınız
        int sum=0;
        int m=12;
        while (m < 16) {
            sum=sum+m;
            m++;
        }
        System.out.println(sum);
//Ex4: Size verilen bir tamsayini rakamlari toplamini ekrana yazdiran kodu yaziniz

        int sayi=123;
        int top=0;
        while (sayi>0) {
            top = top + sayi % 10;
            sayi = sayi / 10;
        }
            System.out.println(top);

//Ex5: Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz
//           3 ==> 3x1=3   3x2=6  3x3=9  ...  3x10=30

        System.out.println("sayi girin:");
        int s=input.nextInt();
        int n=1;
        while (n<11){  // 1 den 10a kadar sayılarla çarpıcaz
            System.out.println(s + "x"+n+"="+s*n);
            n++;
        }







} }
