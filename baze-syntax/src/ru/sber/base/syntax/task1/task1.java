package ru.sber.base.syntax.task1;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.print("Введите ваше имя: ");
        String name = new Scanner(System.in).next();
        System.out.println("Hello, " + name + "!");
    }
}
