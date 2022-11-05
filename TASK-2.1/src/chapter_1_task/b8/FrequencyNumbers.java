/* Ввести с консоли n целых чисел. На консоль вывести:
8. Числа в порядке убывания частоты встречаемости чисел.*/
package chapter_1_task.b8;
import java.util.Scanner;
public class FrequencyNumbers {
    public static void main(String[] args) {
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] frequency = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            frequency[i] = 0;

            for (int num : nums)
                if (nums[i] == num)
                    frequency[i] += 1;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (frequency[j] > frequency[i]) {
                    int tmp = frequency[i];
                    frequency[i] = frequency[j];
                    frequency[j] = tmp;
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                } else if (frequency[i] == frequency[j] && nums[i] > nums[j]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        System.out.println("Числа в порядке убывания частоты встречаемости чисел:");
        for (int i = 0; i < nums.length; i += frequency[i])
            System.out.println(nums[i] + " - " + frequency[i] + "раз(а)");
    }
}
