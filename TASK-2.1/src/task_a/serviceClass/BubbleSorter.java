package task_a.serviceClass;
public class BubbleSorter {
    public int[] sortOfValues(int[] array) {
        int temp;
        for (int i = array.length; i > 0; --i) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}