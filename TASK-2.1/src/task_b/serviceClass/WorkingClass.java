package task_b.serviceClass;
public class WorkingClass {
    ScannerOfNumbers methodScan = new ScannerOfNumbers();
    ScannerOfNumbers methodScanNumbers = new ScannerOfNumbers();
    BubbleSorter methodSort = new BubbleSorter();
    MassiveOfLengthFromIntMassive methodMassiveOfChars = new MassiveOfLengthFromIntMassive();
    CountUniqueNumbers methodUnique = new CountUniqueNumbers();
    IndexOfMinElementInArray findIndex = new IndexOfMinElementInArray();
    int countOfNumbers = methodScan.scannerSize();
    int[] nums = methodScanNumbers.scannerValuesOfNumbers(countOfNumbers);
    public void findNumbersWithMaxMinLength() {
        methodSort.sortOfValues(nums);
        int[] numOfChars = methodMassiveOfChars.getMassiveOfChars(nums);
        methodSort.sortOfValues(numOfChars);
        System.out.println("\nThe shortest number:");
        System.out.println(nums[0] + " has length " + numOfChars[0]);
        System.out.println("\nThe longest number:");
        System.out.println(nums[countOfNumbers - 1] + " has length " + numOfChars[countOfNumbers - 1]);
    }
    public void sortNumbersByLength () {
        methodSort.sortOfValues(nums);

        int[] numOfChars = methodMassiveOfChars.getMassiveOfChars(nums);
        methodSort.sortOfValues(numOfChars);

        System.out.println("\nNumbers sorted in increasing order of length:");
        for(int i = 0; i < countOfNumbers; i++) {
            System.out.println(nums[i] + " has length " + numOfChars[i]);
        }
        System.out.println("\nNumbers sorted in decreasing order of length:");
        for (int i = countOfNumbers - 1; i >= 0 ; i--) {
            System.out.println(nums[i] + " has length " + numOfChars[i]);
        }
    }
    public void findNumberLengthLessThanAverage () {
        methodSort.sortOfValues(nums);
        int[] numOfChars = methodMassiveOfChars.getMassiveOfChars(nums);
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
    public void findNumbersWithLessUniqueNumbers (){
            int[] countsUniqueNumbers = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                countsUniqueNumbers[i] = methodUnique.getCountUniqueDigits(nums[i]);
            }
            int IndexOfMinCountsUnique = findIndex.findMinElement(countsUniqueNumbers);
            System.out.println("\nThe number " + nums[IndexOfMinCountsUnique] + " has the minimum number of different digits: " + countsUniqueNumbers[IndexOfMinCountsUnique]);
    }
}
