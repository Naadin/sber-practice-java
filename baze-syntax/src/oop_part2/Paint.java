package oop_part2;

public class Paint {
    public static class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() { return x; }
        public double getY() { return y; }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public enum Color {
        RED, GREEN, BLUE, YELLOW, BLACK
    }

    public interface Drawable {
        void draw();
        void draw(Color color);
    }

    // Абстрактный класс Figure
    public static abstract class Figure implements Drawable {
        protected Point point;

        public Figure(Point point) {
            this.point = point;
        }

        public abstract double area();
        public abstract double perimeter();

        public Point getPoint() {
            return point;
        }
    }

    // Класс Circle
    public static class Circle extends Figure {
        private double radius;

        public Circle(Point center, double radius) {
            super(center);
            this.radius = radius;
        }

        public double area() {
            return Math.PI * radius * radius;
        }

        public double perimeter() {
            return 2 * Math.PI * radius;
        }

        public void draw() {
            draw(Color.BLACK);
        }

        public void draw(Color color) {
            System.out.println("Рисуем круг цветом " + color + " с центром в " + point + ", радиусом " + radius);
        }
    }

    // Класс Rectangle
    public static class Rectangle extends Figure {
        protected double width;
        protected double height;

        public Rectangle(Point topLeft, double width, double height) {
            super(topLeft);
            this.width = width;
            this.height = height;
        }

        public double area() {
            return width * height;
        }

        public double perimeter() {
            return 2 * (width + height);
        }

        public void draw() {
            draw(Color.BLACK);
        }

        public void draw(Color color) {
            System.out.println("Рисуем прямоугольник цветом " + color + " с верхним левым углом в " + point +
                    ", шириной " + width + ", высотой " + height);
        }
    }

    // Класс Square (наследник Rectangle)
    public static class Square extends Rectangle {

        public Square(Point topLeft, double side) {
            super(topLeft, side, side);
        }

        public void draw() {
            draw(Color.BLACK);
        }

        public void draw(Color color) {
            System.out.println("Рисуем квадрат цветом " + color + " с верхним левым углом в " + point +
                    ", стороной " + width);
        }
    }

    // Класс Triangle
    public static class Triangle extends Figure {
        private Point point2;
        private Point point3;

        public Triangle(Point p1, Point p2, Point p3) {
            super(p1);
            this.point2 = p2;
            this.point3 = p3;
        }

        private double distance(Point p1, Point p2) {
            return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
        }

        public double area() {
            double a = distance(point, point2);
            double b = distance(point2, point3);
            double c = distance(point3, point);
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        public double perimeter() {
            return distance(point, point2) + distance(point2, point3) + distance(point3, point);
        }

        public void draw() {
            draw(Color.BLACK);
        }

        public void draw(Color color) {
            System.out.println("Рисуем треугольник цветом " + color + " с точками " + point + ", " + point2 + ", " + point3);
        }
    }

    // Утилитный класс FigureUtil
    public static class FigureUtil {
        private FigureUtil() {} // приватный конструктор

        public static double area(Figure figure) {
            return figure.area();
        }

        public static double perimeter(Figure figure) {
            return figure.perimeter();
        }

        public static void draw(Drawable figure) {
            figure.draw(Color.BLACK);
        }

        public static void draw(Drawable figure, Color color) {
            figure.draw(color);
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(new Point(0, 0), 5);
        Rectangle rectangle = new Rectangle(new Point(1, 1), 4, 3);
        Square square = new Square(new Point(2, 2), 4);
        Triangle triangle = new Triangle(new Point(0, 0), new Point(3, 0), new Point(3, 4));

        Figure[] figures = {circle, rectangle, square, triangle};

        for (Figure fig : figures) {
            FigureUtil.draw(fig);
            FigureUtil.draw(fig, Color.RED);
            System.out.println("Площадь: " + FigureUtil.area(fig));
            System.out.println("Периметр: " + FigureUtil.perimeter(fig));
            System.out.println();
        }
    }
}