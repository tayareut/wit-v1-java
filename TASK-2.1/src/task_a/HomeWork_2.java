package task_a;
/**
 * @author TayFay
 * @sinse 1 october 2022 17:00
 * @to 25 october 2022 09:00
 */
import task_a.serviceClass.*;

public class HomeWork_2 {
    public static void main(String[] args) {
        WorkingClass method = new WorkingClass();
        /*5 чисел для теста: 9845 12321 343 468 467346  */
        System.out.println("\nВвести n чисел с консоли.\n1a. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.");
        method.findNumbersWithMaxMinLength();
        System.out.println("\n2a. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.");
        method.sortNumbersByLength();
        System.out.println("\n3a. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.");
        method.findNumberLengthLessThanAverage();
        System.out.println("\n4a. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.");
        method.findNumbersWithLessUniqueNumbers();
        System.out.println("\n5a. Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с равным числом четных и нечетных цифр.");
        method.findCountOfOnlyEvenDigitsNumber();
        method.findCountValuesSameEvenOddDigits();
        System.out.println("\n6a. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.\n");
        method.findNumberWithDigitsInStrictIncreaseOrder();
        System.out.println("\n7a. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.\n");
        method.findFirstUniqueNumber();
        System.out.println("\n8a. Среди чисел найти число-палиндром. Если таких чисел больше одного, найти второе.\n");
        method.getArrayOfPalindromes();
        method.findSecondPalindromicNumber();
    }
}
