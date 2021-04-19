import java.util.Scanner;

/* Задача наполнить корабельный бассейн. Нужно посчитать, сколько литров воды нужно для заполнения бассейна до бортов.
Известно, что бассейн имеет линейные размеры a × b × c, заданные в метрах.
Эти размеры передаются запрашиваются у пользователя. Прграмма должена вывести на экран количество литров воды,
которое нужно для наполнения бассейна.
Пример:
Пользователь даёт числа 25, 5, 2.
Пример вывода:
250000 */

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Размеры бассейна в метрах:");
        System.out.print("длина:   ");
        double a=scan.nextInt();
        System.out.print("ширина:  ");
        double b=scan.nextInt();
        System.out.print("глубина: ");
        double c=scan.nextInt();
        System.out.println("Для наполнения бассейна нужно ");
        System.out.println(a*b*c*1000+" литров воды");
    }
}
