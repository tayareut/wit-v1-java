/* Ввести с консоли n целых чисел. На консоль вывести:
1. Четные и нечетные числа.*/
package chapter_1_task.b1;
import java.util.Scanner;
public class EvenOddNumbers {
    public static void main(String[] args) {
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Нечётные числа:");
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + ", ");
            }
        }
        System.out.println();
        System.out.println("Нечётные числа:");
        for (int even : nums) {
            if (even % 2 == 0) {
                System.out.print(even + ", ");
            }
        }
    }
}
