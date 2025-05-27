package oop_part1;

public class Circle {
    private double radius;
    private String color;

    // Конструктор с параметрами radius и color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Метод для вычисления площади круга
    public double area() {
        return Math.PI * radius * radius;
    }

    // Метод для вычисления периметра (окружности) круга
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Переопределение метода toString для вывода информации о круге
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + String.format("%.2f", area()) +
                ", perimeter=" + String.format("%.2f", perimeter()) +
                '}';
    }

    // Класс с методом main для демонстрации
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0, "red");
        Circle circle2 = new Circle(3.3, "blue");

        System.out.println(circle1);
        System.out.println(circle2);
    }
}