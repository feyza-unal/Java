package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {
    public static void main(String[] args) {
//Bir Array'in elemanlari Array ise bu Array'ler "Multidimensional Array" dir.

//Multidimensional Array nasil olusturulur?
        int arr[][]=new int[3][2];
        System.out.println(Arrays.deepToString(arr));

//Multidimensional Array'lere eleman ekleme nasil yapilir?

        arr[0][0]=3;
        arr[0][1]=-4;
        arr[1][0]=6;
        arr[1][1]=18;
        arr[2][0]=-7;
        arr[2][1]=0;

//Multidimensional Array console'a nasil yazdirilir?

        System.out.println(Arrays.deepToString(arr));  // [[3, -4], [6, 18], [-7, 0]]

//Multidimensional Array'lerde Array elemanlardan biri nasil yazdirilir?

        System.out.println(Arrays.toString(arr[1]));  //[6, 18] ->array olduğu için Arrays.toString ile yazdırdık. ilk katmanın 1. indeksi

//Multidimensional Array'lerde ic Array'lerdeki elemanlar nasil yazdirilir?

        System.out.println(arr[0][1]);  // -4 -> int olduğu için direk yazdırabiliriz


//Example 1: String bir Multidimesional Array olusturunuz.
//           Elemanlari ekleyiniz
//           Toplam eleman sayisini ekrana yazdiran kodu yaziniz

        String str[][]=new String[4][3];
        str[0][0]="A";
        str[0][1]="B";
        str[0][2]="C";

        str[1][0]="D";
        str[1][1]="E";
        str[1][2]="F";

        str[2][0]="G";
        str[2][1]="H";
        str[2][2]="I";

        str[3][0]="J";
        str[3][1]="K";
        str[3][2]="L";

        System.out.println(Arrays.deepToString(str));

        int sum=0;
        for (String[] w:str){   // elemanlar array olduğu için String[] diyoruz
            sum=sum+w.length;   // 2. katmandaki arraylerin uzunluğuna bakıyoruz
            // // [ [A, B, C], [D, E, F], [G, H, I], [J, K, L] ]  önce 0. indeks-> 3 sonra 1. indeks ->3
        }

        System.out.println(sum);










    }
}
