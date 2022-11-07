package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {
//EX1- bir integer arraylistteki 7 hariç tüm elemanları 2 arttırınız

        List<Integer> ages=new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (Integer w:ages){
            if (w==7){
                continue; // 7yi görünce boşver
            }
            ages.set(ages.indexOf(w),w+2);  // w=w+2 listler böyle update edilemezler
        }
        System.out.println(ages);

//EX2- size verilen arraylistte 8(inclusive) ve 8den önceki tüm elemanları 2 katına çıkarınız
// inclusive olduğu için kontrolun üstüne yazdık

        List<Integer> nums=new ArrayList<>();
        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);
        for (Integer w:nums){
            nums.set(nums.indexOf(w),w*2); // 8i de dahil etmek için kontrolün üstüne koyduk
            if (w==8){
                break;
            }
      }
        System.out.println(nums);




    }
}
