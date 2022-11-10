package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

// Ex1: Asagidaki sekli ekrana yazdiran kodu yazinin
//       ****      aşağı doğru dış loop sağa doğru iç loop
//       ****
//       ****
/*
        for (int i=1; i<4; i++){         // bu yıldız koymaz satır için yazdık
            for (int k=1; k<5; k++){
                System.out.print("*");
            }
            System.out.println();        // buraya * yazdırılmaz. * yazarsam sağa doğru birer yıldız ekler

        }


        System.out.println();
//Ex2: yukarıdaki şekli kullanıcıdan satır ve sütun sayılarını alarak yapın

        System.out.println("satır sayisi girin: ");
        int satir=input.nextInt();

        System.out.println("sutun sayisi girin: ");
        int sutun=input.nextInt();

        System.out.println("karakter secin:");
        char ch=input.next().charAt(0);

        for (int i=0; i<satir; i++){
            for (int k=0; k<sutun; k++){
                System.out.print(ch);
            }
            System.out.println();
        }
*/
//Ex3: Aşağıdaki şekli çizen kodu yazınız.
/*
              1
              1 2
              1 2 3
              1 2 3 4
              1 2 3 4 5

        for (int i=1; i<6; i++){
            for (int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }

 */
//Aşağıdaki şekli çizen kodu yazınız.
/*
         * * * *    ->satır kadar sütun var
         * * *
         * *
         *

        int row=4;
        for (int i=1; i<=row; i++){
            for (int k=row; k>=i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
*/

    }
}
