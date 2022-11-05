package task_b;

import task_b.serviceClass.*;

public class HomeWork_2 {
    public static void main(String[] args) {
        WorkingClass method = new WorkingClass();
        /*5 чисел для теста: 123 67476 84 9990567 9774*/
        System.out.println("\nВвести n чисел с консоли.\n1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.");
        method.findNumbersWithMaxMinLength();
        System.out.println("\n2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.");
        method.sortNumbersByLength();
        System.out.println("\n3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.");
        method.findNumberLengthLessThanAverage();
        System.out.println("\n4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.");
        method.findNumbersWithLessUniqueNumbers();
    }
}
