package oop_part1;

public class Phone {
        public static void main(String[] args) {
            // Создаем объекты с разными конструкторами
            Phone phone1 = new Phone("123-456-7890", "Samsung Galaxy S21", 180.5);
            Phone phone2 = new Phone("987-654-3210", "iPhone 13");
            Phone phone3 = new Phone();

            // Демонстрируем работу методов
            phone1.receiveCall("Иван");
            phone2.receiveCall("Мария", "555-123-4567");

            System.out.println("Номер phone1: " + phone1.getNumber());
            System.out.println("Номер phone2: " + phone2.getNumber());

            // Отправляем сообщения на несколько номеров
            String[] numbersToMessage = {"111-222-3333", "444-555-6666", "777-888-9999"};
            phone1.sendMessage(numbersToMessage);

            // Выводим информацию о телефонах
            System.out.println(phone1);
            System.out.println(phone2);
            System.out.println(phone3);
        }

        private String number;
        private String model;
        private double weight;

        // Конструктор с тремя параметрами
        public Phone(String number, String model, double weight) {
            this.number = number;
            this.model = model;
            this.weight = weight;
        }

        // Конструктор с двумя параметрами
        public Phone(String number, String model) {
            this.number = number;
            this.model = model;
            this.weight = 0;
        }

        // Конструктор без параметров
        public Phone() {
            this.number = "";
            this.model = "";
            this.weight = 0;
        }

        // Метод receiveCall с одним параметром — имя звонящего
        public void receiveCall(String name) {
            System.out.println("Звонит " + name);
        }

        // Перегруженный метод receiveCall с двумя параметрами — имя и номер звонящего
        public void receiveCall(String name, String number) {
            System.out.println("Звонит " + name + ", номер: " + number);
        }

        // Метод getNumber — возвращает номер телефона
        public String getNumber() {
            return number;
        }

        // Метод sendMessage — принимает массив номеров и выводит их
        public void sendMessage(String[] numbers) {
            System.out.println("Отправка сообщения на номера:");
            for (String num : numbers) {
                System.out.println(num);
            }
        }

        // Переопределение метода toString для вывода информации о телефоне
        public String toString() {
            return "Phone{" +
                    "number='" + number + '\'' +
                    ", model='" + model + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }
