package task_a;

import java.util.Scanner;

public class ValueBelongsInterval {
    public void checkValueBelongsInterval() {
        int k, n, m;
        System.out.println("Программа определяет принадлежность значения k интервалу от n до m:");
        System.out.println("Введите k, n и m: ");
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        n = in.nextInt();
        m = in.nextInt();
        if (k > n & k < m) {
            System.out.println("k принадлежит интервалу (" + n + ", " + m + ")");
        } else if (k > n & k <= m) {
            System.out.println("k принадлежит интервалу (" + n + ", " + m + "]");
        } else if (k >= n & k < m) {
            System.out.println("k принадлежит интервалу [" + n + ", " + m + ")");
        } else if (k >= n & k <= m) {
            System.out.println("k принадлежит интервалу [" + n + ", " + m + "]");
        } else {
            System.out.println("k не принадлежит никакому из заданных интервалов");
        }
    }
}
