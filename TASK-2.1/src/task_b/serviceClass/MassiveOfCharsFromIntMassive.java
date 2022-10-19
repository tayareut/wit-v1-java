package task_b.serviceClass;

public class MassiveOfCharsFromIntMassive {
    public int[] getMassiveOfChars(int[] array) {
        CountNumberOfCharsInInteger method = new CountNumberOfCharsInInteger();
        int[] numsToChars = new int[array.length];
        int i = 0;
        for (int value : array) {
            numsToChars[i] = method.getCountsNumberOfChar(value);
            i++;
        }
        return numsToChars;
    }
}