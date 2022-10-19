package task_b.serviceClass;
// Count the number of characters in Integer
public class CountNumberOfCharsInInteger {
    public int getCountsNumberOfChar(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        } return count;
    }
}
