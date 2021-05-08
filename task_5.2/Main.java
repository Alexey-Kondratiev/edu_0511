/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> cities=new ArrayList<>();
        List<String> families = new ArrayList<>();
        while (true) {
            System.out.print("город: ");
            String city=scanner.nextLine();
            if (city.isEmpty()) break;
            System.out.print("фамилия: ");
            String family=scanner.nextLine();
            
            cities.add(city);
            families.add(family);
        }

        // Read the city
        System.out.print("\nгород: ");
        String cityCall=scanner.nextLine();

            int index=cities.indexOf(cityCall);
            String familyName=families.get(index);
            System.out.println("Ответ: "+familyName);
        
    }
}
