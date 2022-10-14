/* 1. Приветствовать любого пользователя при вводе его имени через командную строку.*/
package chapter_1_task.a1;
import java.util.Scanner;
public class ScannerMain {
    public static void main(String [] args) {
        System.out.println("Enter name and press <Enter>");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello, " + name);
    }
}
