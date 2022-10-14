/* 4. Ввести пароль из командной строки и сравнить его со строкой-образцом.*/
package chapter_1_task.a4;
import java.util.Scanner;
public class PasswordCheck {
    public static void main (String[] args) {
        System.out.println("Enter password <Enter>:");
        Scanner scan = new Scanner(System.in);
        String password1 = scan.next();
        String password2 = "sample";
        if (password1.equals(password2)){
            System.out.println("Correct password");
        } else{
            System.out.println("Error password");
        }
    }
}
