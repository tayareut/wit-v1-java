package task_b.serviceClass;

public class IndexOfMinElementInArray {
    public int findMinElement (int [] array) {
        int minValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[minValue] > array[i]) {
                minValue = i;
            }
        }
        return minValue;
    }
}