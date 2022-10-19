package task_b;

import task_b.serviceClass.BubbleSorter;
import task_b.serviceClass.MassiveOfCharsFromIntMassive;
import task_b.serviceClass.ScannerOfNumbers;

public class HomeWork_2 {
    public static void main(String[] args) {
        ScannerOfNumbers methodScan = new ScannerOfNumbers();
        ScannerOfNumbers methodScanNumbers = new ScannerOfNumbers();
        BubbleSorter methodSort = new BubbleSorter();
        MassiveOfCharsFromIntMassive methodMassiveOfChars = new MassiveOfCharsFromIntMassive();

        int countOfNumbers = methodScan.scannerSize();
        int[] nums = methodScanNumbers.scannerValuesOfNumbers(countOfNumbers);

        System.out.println("\nВвести n чисел с консоли.\n1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.\n");
        methodSort.sortOfValues(nums);
        int[] numOfChars = methodMassiveOfChars.getMassiveOfChars(nums);
        methodSort.sortOfValues(numOfChars);
        System.out.println("The shortest number:");
        System.out.println(nums[0] + " has length " + numOfChars[0] + "\n");
        System.out.println("The longest number:");
        System.out.println(nums[countOfNumbers - 1] + " has length " + numOfChars[countOfNumbers - 1] + "\n");

        System.out.println("2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.\n");
        System.out.println("Numbers sorted in increasing order of length:");
        for(int i = 0; i < countOfNumbers; i++) {
            System.out.println(nums[i] + " has length " + numOfChars[i]);
        }
        System.out.println("\nNumbers sorted in decreasing order of length:");
        for (int i = countOfNumbers - 1; i >= 0 ; i--) {
            System.out.println(nums[i] + " has length " + numOfChars[i]);
        }
        System.out.println("\n3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.");
        int sum = 0;
        int averageSum;

        for (int digit : numOfChars) {
            sum += digit;
        }
        averageSum = sum / numOfChars.length;
        System.out.println("\naverage length: " + averageSum);

        System.out.println("\nNumbers whose length is less than the average length:");
        for (int i = 0; i < countOfNumbers; i++) {
            if (numOfChars[i] < averageSum) {
                System.out.println(nums[i] + " has length " + numOfChars[i]);
            }
        }
        System.out.println("\nNumbers whose length is greater than the average length:");
        for (int i = 0; i < countOfNumbers; i++) {
            if (numOfChars[i] > averageSum) {
                System.out.println(nums[i] + " has length " + numOfChars[i]);
            }
        }
    }
}

