/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Сумма вклада: ");
        double deposit=scan.nextDouble();
        System.out.print("%% годовых: ");
        double percent=scan.nextDouble();
        for(int i=1;i<6;i++) {
        deposit=deposit+deposit*percent/100;
        String total=String.format("%.2f",deposit);
        System.out.println(i+" - "+total);
        }
    }
}
