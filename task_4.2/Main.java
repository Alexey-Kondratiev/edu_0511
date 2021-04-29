import Main.java.Dog;

/*
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Dog должна быть переменная name с типом String.
•	У класса Dog должна быть переменная age с типом int.
•	У класса должен быть сеттер для переменной name.
•	У класса должен быть геттер для переменной name.
•	У класса должен быть сеттер для переменной age.
•	У класса должен быть геттер для переменной age.
*/


public class Main {
    public static void main(String[] args) {
    Dog dog=new Dog();
    dog.setName("Бим");
    dog.setAge(5);
    System.out.println("Кличка:  "+dog.getName());
    System.out.println("Возраст: "+dog.getAge()+" лет");

    }
}
    
class Dog {
    private String name;
    private int age;

    public void setName(String name) {
        this.name=name; 
    }
    
    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age=age;
    }
    
    public int getAge() {
        return age;
    }
}
