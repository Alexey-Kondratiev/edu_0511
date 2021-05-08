/*
* Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
* Коллекции вы создаёте сами
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n;
        ArrayList<Integer> nums1=new ArrayList<>();
        ArrayList<Integer> nums2=new ArrayList<>();
        for(int i=1;i<=20;i++) {
            n=(int)(Math.random()*20)-5;
            nums1.add(n);
            if(n>0 && n<10) nums2.add(n);
        }
    System.out.println(nums1);
    System.out.println(nums2);
    }
}
