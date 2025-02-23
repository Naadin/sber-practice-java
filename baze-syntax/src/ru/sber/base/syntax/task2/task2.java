package ru.sber.base.syntax.task2;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // чтение данных
        System.out.print("Введите количество чисел: ");
        int c = scanner.nextInt(); // объявление переменной, целое число

        if (c <= 0 || c > 500) {
            System.out.println("Введено недопустимое число " + c + ". Допустимый диапазон значений: 1 - 500");
        } else {
            for (int i = 1; i <= c; ++i) {
                System.out.println(i * 7 + " ");
            }
        }
    }
}
