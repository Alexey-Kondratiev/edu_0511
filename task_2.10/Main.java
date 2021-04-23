/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] numbers=new int[5];
        String reply="нет";
        System.out.println("Введите 5 целых чисел: ");
        for (int i=0;i<5;i++) {
        numbers[i]=scan.nextInt();
        }
        for (int i=0;i<4;i++) {
        if (numbers[i+1]==numbers[i]) reply="да";
        }
        System.out.println(reply);  
    }
}
