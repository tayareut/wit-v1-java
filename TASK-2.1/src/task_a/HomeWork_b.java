package task_a;

import task_a.serviceClass.WorkingClassB;
/**
 * @author TayFay
 * @sinse 1 october 2022 17:00
 * @to 25 october 2022 09:00
 */
public class HomeWork_b {
    public static void main(String[] args) {
        WorkingClassB methodB = new WorkingClassB();
        ValueBelongsInterval methodInterval = new ValueBelongsInterval();
        System.out.println("1. Вывести на экран таблицу умножения.\n");
        methodB.displayMultiplicationTable();
        System.out.println("\n2. Вывести элементы массива в обратном порядке.");
        int[] arrayTest = {1, 2, 3, 4, 5};
        methodB.displayArrayElementsReverseOrder(arrayTest);
        System.out.println("\n\n,3. Определить принадлежность некоторого значения k интервалам (n, m], [n, m), (n, m), [n, m].");
        methodInterval.checkValueBelongsInterval();
    }
}
