/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов этого массива.
*/

public class Main {
    public static void main(String[] args) {
        int[] numbers={2,3,4,5};
        int reply=1;
        for(int i=0;i<4;i++){  
        reply=reply*numbers[i];
        }
        System.out.println("2*3*4*5="+reply);    
    }
}
