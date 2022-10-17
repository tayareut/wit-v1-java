/* Ввести n чисел с консоли.
1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.*/
package task_b;

import task_b.serviceClass.BubbleSorter;
import task_b.serviceClass.MassiveOfCharsFromIntMassive;
import task_b.serviceClass.ScannerOfNumbers;

public class ShortestLongestNumbers {
    public static void main(String[] args) {
        int countOfNumbers = ScannerOfNumbers.scannerSize();
        int[] nums = ScannerOfNumbers.scannerValuesOfNumbers(countOfNumbers);
        BubbleSorter.sortOfValues(nums);

        int[] numOfChars = MassiveOfCharsFromIntMassive.getMassiveOfChars(nums);
        BubbleSorter.sortOfValues(numOfChars);

        System.out.println("The shortest number:");
        System.out.println(nums[0] + " has length " + numOfChars[0]);
        System.out.println("The longest number:");
        System.out.println(nums[countOfNumbers - 1] + " has length " + numOfChars[countOfNumbers - 1]);
    }
}
