import Main.java.Dog;
import Main.java.Cat;
import Main.java.Mouse;

/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.
Требования:
•	Создай класс Dog.
•	Создай класс Cat.
•	В классе Dog должно быть три переменные.
•	В классе Cat должно быть три переменные.
•	Должен быть создан хотя бы один объект типа Mouse.
•	Должен быть создан хотя бы один объект типа Dog.
•	Должен быть создан хотя бы один объект типа Cat.
*/

public class Main {
    public static void main(String[] args) {
        Dog spikeDog = new Dog("Spike",80,30);
        Cat tomCat = new Cat("Tom", 55, 20);
        Cat butchCat=new Cat("Butch",53,19);
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Mouse tuffyMouse=new Mouse("Tuffy",8,3);
    }
}
class Dog {
    String name;
    int height;
    int tail;

    public Dog(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }   
}        
        
class Cat {
    String name;
    int height;
    int tail;

    public Cat(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }   
}     
        
class Mouse {
    String name;
    int height;
    int tail;

    public Mouse(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;                                
        
    }
}
