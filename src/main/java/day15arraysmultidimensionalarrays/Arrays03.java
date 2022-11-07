package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

//Example 1: Bir String'deki sesli harflerin sayisini bulan kodu yaziniz
//           a - e - i - o - u - A - E - I - O - U


        String str = "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";
        str=str.toLowerCase();
        String harfler[]=str.split("");
        System.out.println(Arrays.toString(harfler));
        int counter=0;
        for (String w:harfler){
            switch (w) {
                case "a":
                    counter++;
                    break;
                case "e":
                    counter++;
                    break;
                case "i":
                    counter++;
                    break;
                case "o":
                    counter++;
                    break;
                case "u":
                    counter++;
                    break;
                default:
                    break;
            }
        }
    ////////////// 2. YOL ////////////////
        int sayac=0;
        System.out.println(counter);
        for (String w:harfler){
            switch (w) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    sayac++;
                    break;
            }
        }
        System.out.println(sayac);















    }
}
