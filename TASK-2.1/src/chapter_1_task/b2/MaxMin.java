/* Ввести с консоли n целых чисел. На консоль вывести:
2. Наибольшее и наименьшее число.*/
package chapter_1_task.b2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class MaxMin {
    public static void main(String[] args) {
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        OptionalInt max = Arrays.stream(nums).max();
        System.out.println("Максимальное число:" + max.getAsInt());
        OptionalInt min = Arrays.stream(nums).min();
        System.out.println("Минимально число:" + min.getAsInt());
    }
}