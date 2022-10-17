package task_b.serviceClass;

public class MassiveOfCharsFromIntMassive {
    public static int[] getMassiveOfChars(int[] array) {
        int[] numsToChars = new int[array.length];
        int i = 0;
        for (int value : array) {
            numsToChars[i] = CountNumberOfCharsInInteger.getCountsNumberOfChar(value);
            i++;
        }
        return numsToChars;
    }
}