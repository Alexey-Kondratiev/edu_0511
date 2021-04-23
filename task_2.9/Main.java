/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] numbers=new int[5];
        String reply="нет";
        System.out.println("Введите 5 целых чисел: ");
        for (int i=0;i<5;i++){
        numbers[i]=scan.nextInt();
        if (numbers[i]==5) reply="да";
        }
        System.out.println(reply);  
    }
}
