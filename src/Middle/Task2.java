package Middle;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите значение а: ");
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        System.out.println("Введите значение b: ");
        float b = scanner.nextFloat();
        System.out.println("Введите значение c: ");
        float c = scanner.nextFloat();
        float D = b*b - (4 * a *c);
        System.out.println("Дискриминант = " + D);
    }
}

