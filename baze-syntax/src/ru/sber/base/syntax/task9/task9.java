package ru.sber.base.syntax.task9;
import java.util.Random;
import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = (char) (new Random().nextInt('z' - 'a') + 'a');
        while (true) {
            System.out.print("Введите букву: ");
            char c = scanner.next().charAt(0);

            if (c < 'a' || c > 'z') {
                System.out.println("Введен недопустимый символ.");
            } else if (c == ch) {
                System.out.println("Верно!");
                break;
            } else {
                System.out.println(ch < c ?
                        "Ищи букву, которая перед ней в алфавите" : "Ищи букву, которая после нее в алфавите");
            }
        }
    }
}
