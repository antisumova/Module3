package Middle;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите количество отработанных дней в месяце: ");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        System.out.println("Введите размер зарплаты за день:");
        double daySalary = scanner.nextDouble();
        double salary = day * daySalary;
        System.out.println("Заработная плата за " + day + " дней составила " + salary + " рублей");
    }
}