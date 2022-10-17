/* Ввести с консоли n целых чисел. На консоль вывести:
5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.*/
package chapter_1_task.b5;
import java.util.Scanner;
public class ThreeDigitNumbers {
    public static void main(String[] args) {
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Все  трехзначные  числа,  в  десятичной  записи  которых  нет  одинаковых цифр:");
        for (int num : nums) {
            if (num >= 100 && num <= 999) {
                String word = String.valueOf(num);
                char[] chars = word.toCharArray();
                if (chars[0] != chars[1] && chars[1] != chars[2] && chars[0] != chars[2]) {
                    System.out.println(num);
                }
            }
        }
    }
}
