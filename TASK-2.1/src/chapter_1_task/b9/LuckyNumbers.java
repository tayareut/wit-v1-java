/*  Не могу решить, надеюсь от усталости, а не от глупости(
Ввести с консоли n целых чисел. На консоль вывести:
9.   «Счастливые» числа.*/
package chapter_1_task.b9;
import java.util.Arrays;
import java.util.Scanner;
public class LuckyNumbers {
    public static void main(String[] args) {
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            int temp;
                for (int j = 0; j < size - 1; j++) {
                    if (nums[j] > nums[j + 1]) {
                        temp = nums[j + 1];
                        nums[j + 1] = nums[j];
                        nums[j] = temp;
                    }
                }
        }

        System.out.println(Arrays.toString(nums));
    }
}

