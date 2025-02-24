package ru.sber.base.syntax.task3;

public class task3 {
    public static void main(String[] args) {
        int rows = 6; // количество строк рисунка
        for (int i = 0; i < rows; i++) {
            if (i % 2 != 0) { // если строка четная
                System.out.print(" ");
            }
            if (i % 2 == 0) { // если строка нечетная
                printStar(10);
            } else {
                printStar(9);
            }
            System.out.println();
        }
    }
    private static void printStar(int count) {
        for (int j = 0; j < count; j++) {
            System.out.print("* ");
        }
    }
}
