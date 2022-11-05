package task_a.serviceClass;

public class WorkingClassB {
    public void displayMultiplicationTable() {
        int i = 2;
        int j = 0;
        while (j < 10) {
            j++;
            System.out.printf("%d * %d = %d \n", i, j, i * j);
        }
    }

    public void displayArrayElementsReverseOrder (int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
