package task_a;

import java.util.Scanner;

public class RootsOfSquareEquation {
    public static void main(String[] args) {
        double a, b, c;
        double D;
        System.out.println("9a. Найти  корни  квадратного  уравнения.  Параметры  уравнения  передавать с командной строкой..\n");
        System.out.println("Программа решает квадратные уравнения вида:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите a, b и c:");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (D ==0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
            } else {
            System.out.println("Уравнение не имеет действительных корней.");
        }
    }
}

