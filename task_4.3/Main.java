import Main.java.Cat;

/*
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, по вашему усмотрению
Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/

public class Main {
    public static void main(String[] args) {  
    }
}

class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        
        int n1=0;
        int n2=0;
        if(this.age>anotherCat.age) n1++; // При равенстве показателей
        if(this.age<anotherCat.age) n2++; // общий счёт не меняется
        if(this.weight>anotherCat.weight) n1++;
        if(this.weight<anotherCat.weight) n2++;
        if(this.strength>anotherCat.strength) n1++;
        if(this.strength<anotherCat.strength) n2++;
        if(n1>n2) return true; // Наш кот победил
        else return false;     // Наш кот не смог победить 
        
    }
}
