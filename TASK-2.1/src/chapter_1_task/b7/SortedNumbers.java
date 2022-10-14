/* Ввести с консоли n целых чисел. На консоль вывести:
7. Отсортированные числа в порядке возрастания и убывания.*/
package chapter_1_task.b7;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class SortedNumbers {
    public static void main(String[] args) {
    System.out.print("Сколько целых чисел вы собираетесь ввести? ");
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    Integer[] nums = new Integer[size];
    System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
    for (int i = 0; i < size; i++) {
        nums[i] = scanner.nextInt();
    }
    System.out.println("Отсортированные числа в порядке возрастания:");
        Arrays.sort(nums);

        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println("");
        System.out.println("Отсортированные числа в порядке убывания:");

        Integer[] decrease;
        for (Integer ignored : decrease = nums) {
            Arrays.sort(decrease, Collections.reverseOrder());
        }
        for (int values : decrease) {
            System.out.print(values + ", ");
        }
    }
}
