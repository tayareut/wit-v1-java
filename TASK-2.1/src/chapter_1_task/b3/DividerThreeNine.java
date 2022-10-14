/* Ввести с консоли n целых чисел. На консоль вывести:
3. Числа, которые делятся на 3 или на 9.*/
package chapter_1_task.b3;
import java.util.Scanner;
public class DividerThreeNine {
    public static void main(String[] args) {
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Числа, которые делятся на 3 или на 9:");
        for (int num : nums) {
            if (num % 3 == 0 | num % 9 == 0) {
                System.out.println(num);
            }
        }
    }
}
