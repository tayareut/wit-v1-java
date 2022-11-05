package task_a.serviceClass;

import java.util.Arrays;

public class WorkingClass {
    ScannerOfNumbers methodScan = new ScannerOfNumbers();
    ScannerOfNumbers methodScanNumbers = new ScannerOfNumbers();
    BubbleSorter methodSort = new BubbleSorter();
    MassiveOfLengthFromIntMassive methodMassiveOfLength = new MassiveOfLengthFromIntMassive();
    CounterUniqueNumbers methodUnique = new CounterUniqueNumbers();
    MinIntValueIndex findIndex = new MinIntValueIndex();
    CountNumberOfCharsInInteger findNumberLength = new CountNumberOfCharsInInteger();

    int countOfNumbers = methodScan.scannerSize();
    int[] nums = methodScanNumbers.scannerValuesOfNumbers(countOfNumbers);

    public void findNumbersWithMaxMinLength() {
        int[] backupArray = Arrays.copyOf(nums, nums.length);
        methodSort.sortOfValues(backupArray);
        int[] numOfChars = methodMassiveOfLength.getMassiveOfChars(nums);
        methodSort.sortOfValues(numOfChars);
        System.out.println("\nThe shortest number:");
        System.out.println(backupArray[0] + " has length " + numOfChars[0]);
        System.out.println("\nThe longest number:");
        System.out.println(backupArray[backupArray.length - 1] + " has length " + numOfChars[countOfNumbers - 1]);
    }

    public void sortNumbersByLength() {
        int[] backupArray = Arrays.copyOf(nums, nums.length);
        methodSort.sortOfValues(backupArray);

        int[] numOfChars = methodMassiveOfLength.getMassiveOfChars(backupArray);
        methodSort.sortOfValues(numOfChars);

        System.out.println("\nNumbers sorted in increasing order of length:");
        for (int i = 0; i < backupArray.length; i++) {
            System.out.println(backupArray[i] + " has length " + numOfChars[i]);
        }
        System.out.println("\nNumbers sorted in decreasing order of length:");
        for (int i = backupArray.length - 1; i >= 0; i--) {
            System.out.println(backupArray[i] + " has length " + numOfChars[i]);
        }
    }

    public void findNumberLengthLessThanAverage() {
        int[] backupArray = Arrays.copyOf(nums, nums.length);
        methodSort.sortOfValues(backupArray);

        int[] numOfChars = methodMassiveOfLength.getMassiveOfChars(backupArray);
        int sum = 0;
        int averageSum;

        for (int digit : numOfChars) {
            sum += digit;
        }
        averageSum = sum / numOfChars.length;
        System.out.println("\naverage length: " + averageSum);

        System.out.println("\nNumbers whose length is less than the average length:");
        for (int i = 0; i < backupArray.length; i++) {
            if (numOfChars[i] < averageSum) {
                System.out.println(backupArray[i] + " has length " + numOfChars[i]);
            }
        }
        System.out.println("\nNumbers whose length is greater than the average length:");
        for (int i = 0; i < backupArray.length; i++) {
            if (numOfChars[i] > averageSum) {
                System.out.println(backupArray[i] + " has length " + numOfChars[i]);
            }
        }
    }

    public void findNumbersWithLessUniqueNumbers() {
        int[] countsUniqueNumbers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            countsUniqueNumbers[i] = methodUnique.getCountUniqueDigits(nums[i]);
        }
        int minCountsUniqueIndex = findIndex.minValueIndex(countsUniqueNumbers);
        System.out.println("\nThe number " + nums[minCountsUniqueIndex] + " has the minimum number of different digits: " + countsUniqueNumbers[minCountsUniqueIndex]);
    }

    public int findCountOfEvenDigits(int number) {
        int odd = 0;
        int even = 0;
        while (number > 0) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            number /= 10;
        }
        return even;
    }

    public int findCountOddDigits(int number) {
        int odd = 0;
        int even = 0;
        while (number > 0) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            number /= 10;
        }
        return odd;
    }

    public void findCountOfOnlyEvenDigitsNumber() {
        int countEven = 0;
        int[] counterEvenDigits = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            counterEvenDigits[i] = findCountOfEvenDigits(nums[i]);
            if (counterEvenDigits[i] == findNumberLength.getCountsNumberOfChar(nums[i]))
                countEven++;
        }
        System.out.println("\nThe amount of numbers containing only even digits: " + countEven);
    }

    public void findCountValuesSameEvenOddDigits() {
        int CountValuesSameEvenOdd = 0;
        int[] counterEvenDigits = new int[nums.length];
        int[] counterOddDigits = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            counterEvenDigits[i] = findCountOfEvenDigits(nums[i]);
            counterOddDigits[i] = findCountOddDigits(nums[i]);
            if (counterEvenDigits[i] == counterOddDigits[i])
                CountValuesSameEvenOdd++;
        }
        System.out.println("\nThe amount of numbers with an equal number of even and odd digits: " + CountValuesSameEvenOdd);
    }

    public void findNumberWithDigitsInStrictIncreaseOrder() {
        for (int num : nums) {
            if (isNumberWithDigitsInStrictIncreaseOrder(num)) {
                System.out.println(num + " - the first number with digits in strict increase order");
                break;
            }
        }
    }

    public boolean isNumberWithDigitsInStrictIncreaseOrder(int number) {
        int[] digits = getArrayDigitsFromInt(number);
        for (int i = 0; i < digits.length; i++) {
            if (i + 1 < digits.length && (digits[i + 1] < digits[i]))
                return false;

        }
        return true;
    }

    public int[] getArrayDigitsFromInt(int number) {
        int[] digits = new int[findNumberLength.getCountsNumberOfChar(number)];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }
        for (int i = 0; i < digits.length / 2; i++) {
            int tmp = digits[i];
            digits[i] = digits[digits.length - i - 1];
            digits[digits.length - i - 1] = tmp;
        }
        return digits;
    }

    public void findFirstUniqueNumber() {
        for (int num : nums) {
            if (isUniqueNumber(num))
                System.out.println(num + " - the first number which has only different digits.");
            break;
        }
    }

    public boolean isUniqueNumber(int number) {
        int countUniqueDigits = methodUnique.getCountUniqueDigits(number);
        int numberLength = findNumberLength.getCountsNumberOfChar(number);
        return countUniqueDigits == numberLength;
    }

    public boolean isPalindromic(int number) {
        String word = String.valueOf(number);
        char[] chars = word.toCharArray();
        for (int i = 0; i < (chars.length / 2); i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public int findCountPalindromicNumber(int[] array) {
        int countPalindromes = 0;
        for (int number : array) {
            if (isPalindromic(number)) {
                countPalindromes++;
            }
        }
        return countPalindromes;
    }

    public int[] getArrayOfPalindromes() {
        int[] palindromes = new int[findCountPalindromicNumber(nums)];
        int index = 0;
        for (int num : nums) {
            if (isPalindromic(num)) {
                palindromes[index] = num;
                index++;
            }
        }
        return palindromes;
    }

    public void findSecondPalindromicNumber() {
        int[] palindromes = getArrayOfPalindromes();
        if (palindromes.length == 0) {
            System.out.println("No palindromic number.");
        }
        if (palindromes.length == 1) {
            System.out.println(palindromes[0] + " - the palindromic number.");
        } else {
            System.out.println(palindromes[1] + " - the second palindromic number.");
        }
    }
}
