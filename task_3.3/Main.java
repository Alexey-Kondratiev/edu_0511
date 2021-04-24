/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если эти числа равны - пусть функция вернет true, а если не равны - false.
*/

import java.util.Scanner;

public class Main {
       
    public static boolean con(int a, int b) {
        if(a==b) return true;
        else return false;
    }

    public static void main(String[] args) {
    
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите два целых числа: ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println(con(a,b));       
    }
}
