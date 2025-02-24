package ru.sber.base.syntax.task7;
import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Решение квадратного уравнения вида: ax^2 + bx + c = 0");
        System.out.print("Введите значение a = ");
        double a = scanner.nextDouble();
        System.out.print("Введите значение b = ");
        double b = scanner.nextDouble();
        System.out.print("Введите значение c = ");
        double c = scanner.nextDouble();

        double dis = b * b - 4 * a * c;
        if (dis > 0) {
            double root1 = ((-b + Math.sqrt(dis)) / (2 * a));
            double root2 = ((-b - Math.sqrt(dis)) / (2 * a));
            System.out.println("Корни уравнения: ");
            System.out.println("x1 = " + root1);
            System.out.println("x2 = " + root2);
        } else if (dis == 0) {
            double root = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: ");
            System.out.print("x = " + root);
        } else {
            System.out.println("Уравнение не имеет действительных корней. ");
        }
    }
}
