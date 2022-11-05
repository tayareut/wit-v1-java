/* Ввести с консоли n целых чисел. На консоль вывести:
9.   «Счастливые» числа.*/
package chapter_1_task.b9;
import java.util.Scanner;
public class LuckyNumbers {
    public static void main(String[] args) {
        System.out.print("Введите количество целых чисел: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = i + 1;
        }
        for (int j = 2; j < size / 2; j++) {
            int count = 0;
            for (int i = 0; i < size; i++) {
                if (nums[i] != 0) {
                    count++;
                }
                if (count % j == 0) {
                    nums[i] = 0;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
