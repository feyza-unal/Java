package day10StringManipulations;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {
// EX: 1) Ekrana 5 kere "Hi" yazdırın
// for loop

        for ( int i=1 ; i<6 ; i++  ){

            System.out.println("Hi");

        }

//      i=i+3 <=> i+=3


// EX: 2) 4den 7ye kadar tüm sayıları ekrana yazdırın
        for (int i=4; i<8 ; i++){
            System.out.println(i);
        }

        System.out.println( );

// EX: 3)14 den 5 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz


        for (int x=14; x>4; x--){
            System.out.println(x);
        }


// EX: 4) 14den 5e kadar çift sayılar

        for (int i=14; i>4; i-=2){  //yada i=i-2
                System.out.println("i "+i);
        }

        System.out.println();
//2.yol
        for (int i=14; i>4; i--){
            if (i%2==0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();

//EX: 5) 28 den 157 e kadar tum tek tamsayilari ekrana yazdiran kodu yaziniz

        for (int i=28; i<158; i++){
            if (i%2!=0)                    // 1 yerine 0'a eşit değil de
                System.out.print(i+ " ");;
        }

        System.out.println();

//EX: 6) "Java" String'ini "J*a*v*a*" String'ine ceviren kodu yaziniz

        String str="Java";
        for (int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+"*");
        }
        System.out.println();

// EX: 7) stringdeki tekrarsız karakterleri yazın
//          "Hellooo"
        String ss="Hellooo Ali";
        for (int i=0; i<ss.length() ; i++ ){
            char c= ss.charAt(i);
            if (ss.indexOf(c)== ss.lastIndexOf(c)){  // indekslere bakıyoruz eğer ilk indeks ve son indeks numaraları
                // aynı ise tekrarsız demek
                System.out.print(c); //He Ai space de tekrarsız
            }

        }


    }








    }

