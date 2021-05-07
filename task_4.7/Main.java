/*
Реализуй в классе Fox интерфейс Animal.
Поменяй код так, чтобы в классе Fox был только один метод - getName.
Учти, что создавать дополнительные классы и удалять методы нельзя!
Требования:
•	Интерфейс Animal должен быть реализован в классе Fox.
•	В интерфейсе Animal нужно объявить метод getColor.
•	Дополнительные классы или интерфейсы создавать нельзя.
*/

public class Main {
    public static void main(String[] args) {
    
        System.out.println(Fox.getName());
    }
}

interface Animal {

//    Color
      void getColor();
}
    
abstract class Fox implements Animal {

    String name;
    
    public Fox(String name) {
        this.name=name;
    }

    public static String getName() {
        return "Fox";
    }        
}
