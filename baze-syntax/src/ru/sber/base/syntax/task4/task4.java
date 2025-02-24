package ru.sber.base.syntax.task4;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        System.out.println("Является ли число простым?");
        Scanner scanner = new Scanner(System.in); // чтение данных
        System.out.print("Введите число: ");
        int num = scanner.nextInt(); // объявление переменной, целое число

        if (num <= 0) {
            System.out.println("Число должно быть больше нуля.");
        } else {
            boolean primeNum = true; // пусть число простое
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primeNum = false; // нашли делитель - число не простое
                    break;
                }
            }
            if (primeNum) {
                System.out.println("Да");
            } else {
                System.out.println("Нет");
            }
        }
    }
}
