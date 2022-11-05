/*5. Ввести целые числа как аргументы командной строки, подсчитать их суммы и произведения.
Вывести результат на консоль.*/
package chapter_1_task.a5;
public class NumbersActions {
    public static void main (String [] args){
        int sum = 0;
        int multi = 1;
        for (String arg : args) {
            int stringToInt = Integer.valueOf(arg);
            sum += stringToInt;
            multi *= stringToInt;
        }
        System.out.println("Сумма аргументов: " + sum);
        System.out.println("Произведение аргументов: " + multi);
    }
}
