package task_b.serviceClass;
import java.util.Scanner;
public class ScannerOfNumbers {
    public int scannerSize() {
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public int[] scannerValuesOfNumbers(int size) {
        System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
        int[] numbers = new int[size];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        return numbers;
    }

    public int[] scannerValuesOfNumbersToString(int size) {
        System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
        int[] numbers = new int[size];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.parseInt(String.valueOf(scanner.nextInt()));
        }
        scanner.close();
        return numbers;
    }
}
