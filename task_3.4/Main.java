/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если их сумма больше 10 - пусть функция вернет true, а если нет - false.
*/

import java.util.Scanner;

public class Main {
       
    public static boolean con(int a, int b) {
        if(a+b>10) return true;
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
