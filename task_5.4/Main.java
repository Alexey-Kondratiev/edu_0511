/* 
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
  
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Scanner scan=new Scanner(System.in);
        System.out.println("Введите путь к файлу и его имя:");
        String filename = scan.nextLine();
        
// Создание списка объектов для записи
        ArrayList<Integer> nums0= new ArrayList<>();
        
        System.out.println("Введите целые числа:");
        while (true) {
            String s=scan.nextLine();
            if (s.isEmpty()) {
            break;
            }
            nums0.add(Integer.parseInt(s));
        }
        scan.close();
        
//      Запись объекта в файл        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
            oos.writeObject(nums0);
            oos.close();
                    
// Десериализация в список        
        ArrayList<Integer> nums=new ArrayList<>();

ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));

nums=((ArrayList<Integer>)ois.readObject());
        ois.close();

//      Отбор чётных чисел              
        for(int i=0;i<nums.size();i++) {
            if(nums.get(i)%2!=0) {
                nums.remove(i);
                i--;
            }
        }

        Collections.sort(nums);
        System.out.println(nums);
    } 
}
