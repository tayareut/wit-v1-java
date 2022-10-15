/* Ввести с консоли n целых чисел. На консоль вывести:
6. Простые числа.*/
package chapter_1_task.b6;
import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Простые числа:");
        for (int i = 0; i < size; i++) {
            if (isPrime(nums[i]))
                System.out.println(nums[i]);
        }
    }
    public static boolean isPrime(int size){
            int temp;
            if (size == 1) return false;
            for (int i = 2; i <= size / 2; i++) {
                temp = size % i;
                if (temp == 0) return false;
            }
            return true;
    }
}
