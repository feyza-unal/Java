package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

//Array'lerin içine "primitive data type" ve reference yerleştirilir.
//strinlerin kendisi değil adresleri arrayde

        String str[]=new String[3];
        str[0]="Java";
        str[1]="did";
        str[2]="surprise you";
        System.out.println(Arrays.toString(str));   //yazdırabilmek için elemanları stringe çevirdik

//String bir Array olusturunuz ve  "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz

        String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};
        for( String w : arr ){
            System.out.print(w+" ");
            if (w.equals("Tom")){
                break;
            }
        }
        System.out.println();

//"Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz

        for (String w : arr ){
            if (w.equals("Tom") || w.equals("Jane")) {
                continue;
            }
            System.out.print(w+" ");

        }
        System.out.println();

//Example 3: Bir ogretmenin sinfindaki ogrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz.
// ( Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz )

        System.out.println("kac ogrenci ismi gireceksiniz?:");
        int stdnum=input.nextInt();
        String names[]=new String[stdnum];
        System.out.println("girisi sonlandirmak için q harfine basın. devam etmek için herhangi bir yere basın");

        for (int i=0; i<stdnum; i++){
            System.out.println((i+1)+". ogrenci ismini girin:");
            String stdName=input.next();


            if (stdName.equalsIgnoreCase("Q")){
                break;
            }
            names[i]=stdName;
        }
        System.out.print(Arrays.toString(names)+" ");







    }
}
