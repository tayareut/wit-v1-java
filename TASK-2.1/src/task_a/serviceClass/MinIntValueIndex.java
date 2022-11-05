package task_a.serviceClass;

public class MinIntValueIndex {
    public int minValueIndex (int [] array) {
        int minValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[minValue] > array[i]) {
                minValue = i;
            }
        }
        return minValue;
    }
}