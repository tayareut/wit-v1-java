/*3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.*/
package chapter_1_task.a3;
public class LineBreak {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        for (int i : a) {
            System.out.println(i);
        }
        for (int i : a) {
            System.out.print(i);
        }
    }
}
