package oop_part1;

public class Matrix {

        private double[][] data;
        private int rows;
        private int cols;

        public Matrix(int rows, int cols) {
            this.rows = rows;
            this.cols = cols;
            data = new double[rows][cols];
        }

        public void setValue(int i, int j, double value) {
            if (i >= 0 && i < rows && j >= 0 && j < cols) {
                data[i][j] = value;
            }
        }

        // сложение матрицы с другой матрицей
        public Matrix add(Matrix other) {
            if (this.rows != other.rows || this.cols != other.cols) {
                return null;
            }

            Matrix result = new Matrix(rows, cols);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result.data[i][j] = this.data[i][j] + other.data[i][j];
                }
            }
            return result;
        }

        // умножения матрицы на число
        public Matrix multiplyByNumber(double number) {
            Matrix result = new Matrix(rows, cols);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result.data[i][j] = this.data[i][j] * number;
                }
            }
            return result;
        }

        // умножения матрицы на другую матрицу
        public Matrix multiply(Matrix other) {
            if (this.cols != other.rows) {
                return null;
            }

            Matrix result = new Matrix(this.rows, other.cols);

            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < other.cols; j++) {
                    double sum = 0;
                    for (int k = 0; k < this.cols; k++) {
                        sum += this.data[i][k] * other.data[k][j];
                    }
                    result.data[i][j] = sum;
                }
            }

            return result;
        }

        // вывод матрицы на печать
        public void print() {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.printf("%8.2f ", data[i][j]);
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Matrix m1 = new Matrix(2, 2);
            Matrix m2 = new Matrix(2, 2);

            // Заполнение матриц
            m1.setValue(0, 0, 1);
            m1.setValue(0, 1, 2);
            m1.setValue(0, 2, 3);
            m1.setValue(1, 0, 4);

            m2.setValue(0, 0, 7);
            m2.setValue(0, 1, 8);
            m2.setValue(0, 2, 9);
            m2.setValue(1, 0, 10);

            System.out.println("Матрица m1:");
            m1.print();

            System.out.println("Матрица m2:");
            m2.print();

            // Сложение матриц
            Matrix sum = m1.add(m2);
            System.out.println("Сумма m1 + m2:");
            if (sum != null) sum.print();

            // Умножение на число
            Matrix multipliedByNumber = m1.multiplyByNumber(2);
            System.out.println("m1 умноженная на 2:");
            multipliedByNumber.print();

            // Для умножения матриц создадим подходящие размеры
            Matrix m3 = new Matrix(2, 2);
            m3.setValue(0, 0, 1);
            m3.setValue(0, 1, 2);
            m3.setValue(1, 0, 3);
            m3.setValue(1, 1, 4);

            System.out.println("Матрица m3:");
            m3.print();

            // Умножение m1 (2x3) на m3 (3x2) даст матрицу 2x2
            Matrix product = m1.multiply(m3);
            System.out.println("Произведение m1 * m3:");
            if (product != null) product.print();
        }
    }