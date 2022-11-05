/* Ввести с консоли n целых чисел. На консоль вывести:
11. Элементы, которые равны полусумме соседних элементов.*/
package chapter_1_task.b11;
import java.util.Scanner;
public class FindNumbersEqualHalfSum {

    public static void main(String[] args) {
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Числа, которые равны полусумме соседних элементов:");
        for (int i = 1; i < size - 1; i++) {
            if (nums[i] == (nums[i - 1] + nums[i + 1]) / 2) {
                System.out.println(nums[i]);
            }
        }
    }
}
