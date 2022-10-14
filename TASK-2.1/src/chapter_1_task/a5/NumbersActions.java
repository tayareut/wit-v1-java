/*5. Ввести целые числа как аргументы командной строки, подсчитать их суммы и произведения.
Вывести результат на консоль.*/
package chapter_1_task.a5;
import java.util.Scanner;
public class NumbersActions {
    public static void main (String [] args){
        System.out.println("Ввести 2 целых числа: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("Сумма = " + (x + y));
        System.out.println("Произведение = " + (x * y));
    }
}
