/*Ввести n чисел с консоли.
2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.*/
package task_b;

import task_b.serviceClass.BubbleSorter;
import task_b.serviceClass.MassiveOfCharsFromIntMassive;
import task_b.serviceClass.ScannerOfNumbers;

public class SortedNumbersByLength {
    public static void main(String[] args) {
        int countOfNumbers = ScannerOfNumbers.scannerSize();
        int[] nums = ScannerOfNumbers.scannerValuesOfNumbers(countOfNumbers);
        BubbleSorter.sortOfValues(nums);

        int[] numOfChars = MassiveOfCharsFromIntMassive.getMassiveOfChars(nums);
        BubbleSorter.sortOfValues(numOfChars);

        System.out.println("Numbers sorted in increasing order of length:");
        for(int i = 0; i < countOfNumbers; i++) {
            System.out.println(nums[i] + " has length " + numOfChars[i]);
        }
        System.out.println("\nNumbers sorted in decreasing order of length:");
        for (int i = countOfNumbers - 1; i >= 0 ; i--) {
            System.out.println(nums[i] + " has length " + numOfChars[i]);
        }
    }
}
