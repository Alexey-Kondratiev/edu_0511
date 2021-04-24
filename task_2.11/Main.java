/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] numbers=new int[11];
        int sum=0;
        int i=0;
        System.out.println("Введите целые числа: ");
        while (sum<=10) {
        numbers[i]=scan.nextInt();
        sum=sum+numbers[i];
        i++;
        }
        System.out.println(i+" элемента(ов)");  
    }
}
