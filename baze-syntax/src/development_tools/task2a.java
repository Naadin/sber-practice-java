package development_tools;
import java.util.Scanner;

public class task2a {
    public static void main(String[] args) {
        task2a converter = new task2a();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число от 1 до 100: ");
        int n = scanner.nextInt();

        String roman = converter.RRoman(n);
        System.out.print("Это число в римской записи: " + roman);
    }
    public String RRoman(int n) {
        if (n < 1 || n > 100) {
            System.out.print("Введите натуральное число от 1 до 100: ");
        }

        int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (n >= values[i]) {
                n -= values[i];
                roman.append(symbols[i]);
            }
        }

        return roman.toString();
    }
}
