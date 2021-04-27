/*
Задание: Дан массив с числами. Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/

public class Main {
    public static void main(String[] args) {
    int num[]={4,2,6,2,65};
    int i=0;
    array(num,i);
    }

    public static int array(int[] num, int i) {
    System.out.print(num[i]+" ");
        if (i<num.length-1) array(num,i+1);
    return i;
    
    }
}
