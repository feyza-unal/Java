package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays02 {
    public static void main(String[] args) {


//MultiDimensionalArray kisa yoldan nasil olusturulur?
        char arr[][]= {{'a','b'},{'C','D','E'},{'?'}};   // 2. katmandaki boyutları farklı yapmış olduk
        System.out.println(Arrays.deepToString(arr));  // [[a, b], [C, D, E], [?]]


//Bir String multidimensional array'de icinde "a" olan elemanlari konsola yazdiriniz.

        String brr[][] = { {"learn", "java", "it"}, {"is", "easy"} };

        for (String[] w:brr){
            for (String k:w){   // iç içe array olduğu için
                if (k.contains("a")){
                    System.out.print(k+" ");   //  learn java easy
                }
            }
        }













    }
}
