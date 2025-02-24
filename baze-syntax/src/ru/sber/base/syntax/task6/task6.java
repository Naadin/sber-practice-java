package ru.sber.base.syntax.task6;
import java.util.ArrayList; // динамический массив
public class task6 {
    private static final int size = 100;
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(size); // контейнер для хранения элементов

        double y = 0.0;
        int max = Integer.MIN_VALUE;
        int maxIndex = 1;
        for (int i = 0; i < size; ++i) {
            array.add((int) (Math.random() * 1001)); // заполнение массива
            if (max < array.get(array.size() - 1)) { // поиск максимума
                maxIndex = i;
                max = array.get(array.size() - 1);
            }
            y += array.get(array.size() - 1);
        }
        y /= size; // поиск среднего значения
        System.out.println("Массив: " + array); // вывод массива на экран
        System.out.println("Максимальное значение = [" + max + "], находится в элементе под индексом = [" + maxIndex + "].");
        System.out.println("Среднее значение = ["  + y + "].");
    }
}
