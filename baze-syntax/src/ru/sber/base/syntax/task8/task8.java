package ru.sber.base.syntax.task8;
import java.util.Arrays; // динамический массив
public class task8 {
    public static void main(String[] args) {
        int[] array = new int[30];

        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) (Math.random() * 1001); // заполнение массива
        }
        System.out.println("Массив: " + Arrays.toString(array)); // вывод массива на экран
        for (int i = array.length - 1; i >= 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("        Сортировка методом пузырька...");
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}
