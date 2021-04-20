import java.util.Scanner;

/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите число: ");
        double a=scan.nextDouble();
        System.out.print(a+"+15% = "+a*1.15);
    }
}
