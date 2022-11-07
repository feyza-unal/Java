package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
//  Kullanıcıdan yas degerini alan ve yasin hangi evrede
//  olduğunu asagidaki tabloya olduğunu asagidaki tabloya

//  0 - 4 => baby
//  5 - 12 => child
//  13 - 20 => teenager
//  21 - 30 => adult
//  else (not expected age)

        Scanner input = new Scanner(System.in);

        System.out.println("Yas giriniz:");
        int yas = input.nextInt();

//  hocanın yöntemi:

        if(yas<0){
            System.out.println("Gecerli yas giriniz");
        }else if(yas<5){
            System.out.println("Bebek");
        }else if(yas<13){
            System.out.println("Cocuk");
        }else if(yas<21){
            System.out.println("Genc");
        }else if(yas<31){
            System.out.println("Yetiskin");
        }else{
            System.out.println("Tanimlanmamis evre...");
        }





// benim kodum
/*
        if (yas>=0 && yas<=4){
            System.out.println("baby");
        }
        else if (yas>=5 && yas<=12) {
            System.out.println("child");
        } else if (yas>=13 && yas<=20) {
            System.out.println("teenager");
        } else if (yas>=21 && yas<=30) {
            System.out.println("adult");
        }else{
            System.out.println("not expected age");
        }
*/

    }
}

