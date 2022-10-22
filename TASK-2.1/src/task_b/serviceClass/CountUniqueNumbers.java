package task_b.serviceClass;

public class CountUniqueNumbers {
    public int getCountUniqueDigits(int number) {
        int result = 0;
        int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        while (number > 0) {
            int lastDigit = number % 10;
            count[lastDigit]++;
            number = number / 10;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) {
                result++;
            }
        }
        return result;
    }
}
