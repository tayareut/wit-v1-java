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
            String b = String.valueOf(num);
            int blen = b.length();
            if (blen == 3) {
                if (b.charAt(2) != b.charAt(1) && b.charAt(0) != b.charAt(1) && b.charAt(2) != b.charAt(0)) {
                    System.out.println(num);
                }
            }
        }
    }
}
