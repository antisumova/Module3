package Easy;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Пользователь ввел значение для a: и b:");
        int c = a;
        a = b;
        b = c;
        System.out.println("Значение а = " + a + ", значение b = " + b);
    }
}