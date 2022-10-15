/*3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.*/
package chapter_1_task.a3;
public class LineBreak {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        for (String arg : args) {
            System.out.print(args[0] + ", " + arg);
        }
    }
}
