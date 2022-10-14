/* Ввести с консоли n целых чисел. На консоль вывести:
10. Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.*/
package chapter_1_task.b10;
import java.util.Scanner;
public class FindPalindromicNumbers {
    public static void main(String[] args) {
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Числа палиндромы:");
        for (int i = 0; i < size; i++) {
            if (isPalindromic(nums[i]))
                System.out.println(nums[i]);
        }
    }

    public static boolean isPalindromic(int nums) {
        String word = String.valueOf(nums);
        int length = word.length();
        for (int i = 0; i < (length / 2); i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
