package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class example_1 {
// part 1: create list of 5 numbers from user input
// sort the list in reverse order and print it
// shuffle the list and print it
// rotate right by 3 places and print it

// part 2: find the max number and min number, print them
// replace all max number with min number

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            System.out.println("Lutfen "+(i+1)+". sayiyi giriniz ");
            arrList.add(input.nextInt());
        }
        System.out.println(arrList);//[3, 5, 7, 13, 15]
        Collections.sort(arrList,Collections.reverseOrder());
        System.out.println("Tersten siraladiktan sonra arrList "+arrList);

        Collections.shuffle(arrList);//rastgele karistirir
        System.out.println("Karistirdiktan sonra arrList "+arrList);

        Collections.rotate(arrList,3);//belirtilen listedeki ogeleri kaydirir
        System.out.println("3' saga kaydirdiktan sonra arrList "+arrList);

        Integer max=Collections.max(arrList);
        Integer min=Collections.min(arrList);
        System.out.println(" arrListedeki max eleman "+max);
        System.out.println(" arrListedeki min eleman "+min);

        Collections.replaceAll(arrList,max,min);
        System.out.println("max degerlerin yerine min yerlestirilmis arrList "+arrList);

    }







}
