package day16multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {
/*
Array veya Collection varsa "for-each-loop" kullanmak ilk tercihiniz olsun
Array veya Collection var ama "index" kullanmak zorundasiniz o zaman "for-each-loop" calismaz,
 "for-loop" veya "while-loop" veya "do-while-loop" kullanmalisiniz
*/

// Bir tane integer multidimensional array olusturunuz
// Bu array'deki tum sayilarin toplamini veren kodu yaziniz.

        int arr[][] = { {2, 5, 1}, {32, 75} };
        int sum=0;
        for (int[] w:arr){    // {2, 5, 1}, {32, 75}
            for (int k:w){    // {2, 5, 1} bitince de 32,75
                sum=sum+k;
            }
        }
        System.out.println(sum);  // 115

// Bir multidimensional array'i normal array'e ceviren kodu yaziniz
// { {2, 5, 1}, {32, 75} } ==> { 2, 5, 1, 32, 75}

// 1- eleman sayisini bul
// 2- yeni array oluştur
// 3- yeni arrayin uzunluğu orjinal arrayin uzunluğuna eşit olmalı

        int brr[][]={ {2, 5, 1}, {32, 75} };
        int elemanSayisi=0;
        for (int[] w:brr){
            elemanSayisi=elemanSayisi+w.length;
        }
        System.out.println(elemanSayisi);

        int crr[]=new int[elemanSayisi];  // [0,0,0,0,0]
        int idx=0;
        for (int[] w:brr){   // [[2, 5, 1], [32, 75]]
            for (int k:w){   // [2, 5, 1]
                crr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(crr));











    }
}
