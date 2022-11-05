/* Ввести с консоли n целых чисел. На консоль вывести:
2. Наибольшее и наименьшее число.*/
package chapter_1_task.b2;
import java.util.Scanner;
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
        int maxValue = 0;
        for (int i = 0; i < size; i++) {
            if (nums[maxValue] < nums[i]) {
                maxValue = i;
            }

        }
        System.out.println(nums[maxValue] + " - максимальное число");

        int minValue = 0;
        for (int i = 0; i < size; i++) {
            if (nums[minValue] > nums[i]) {
                minValue = i;
            }

        }
        System.out.println(nums[minValue] + " - минимальное число");
    }
}
