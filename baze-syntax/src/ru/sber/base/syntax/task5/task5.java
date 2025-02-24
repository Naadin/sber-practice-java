package ru.sber.base.syntax.task5;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        System.out.println("          Последовательность Фибоначчи");
        System.out.println("Вывод на экран первых n членов последовательности");
        Scanner scanner = new Scanner(System.in); // чтение данных
        System.out.print("Введите число n = ");
        int n = scanner.nextInt(); // объявление переменной, целое число

        if (n < 2 || n > 100) {
            System.out.println("Допустимые значения n - от 2 до 100");
            return;
        }
        System.out.println("Первые " + n + " членов последовательности: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
