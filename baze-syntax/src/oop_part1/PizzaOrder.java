package oop_part1;

public class PizzaOrder {
    public enum Size {
        SMALL, MEDIUM, BIG
    }

    private String name;
    private Size size;
    private boolean sauce;
    private String address;
    private boolean accepted;

    public PizzaOrder(String name, Size size, boolean sauce, String address) {
        this.name = name;
        this.size = size;
        this.sauce = sauce;
        this.address = address;
        this.accepted = false;
    }

    // принимает заказ
    public void order() {
        if (!accepted) {
            accepted = true;
            System.out.println("Заказ принят.");
            System.out.println(this);
            System.out.println("Заказ выполняется.");
        } else {
            System.out.println("Заказ уже принят.");
        }
    }

    // отменяет заказ
    public void cancel() {
        if (accepted) {
            accepted = false;
            System.out.println("Заказ отменен.");
        } else {
            System.out.println("Заказ не был принят.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isSauce() {
        return sauce;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        String sizeStr;
        switch (size) {
            case SMALL: sizeStr = "Маленькая"; break;
            case MEDIUM: sizeStr = "Средняя"; break;
            case BIG: sizeStr = "Большая"; break;
            default: sizeStr = "Неизвестный размер"; break;
        }
        String sauceStr = sauce ? "с соусом" : "без соуса";

        return String.format("%s пицца «%s» %s на адрес %s", sizeStr, name, sauceStr, address);
    }

    public static void main(String[] args) {
        PizzaOrder order1 = new PizzaOrder("Аль-Капчоне", Size.BIG, true, "Ярославская 101");
        order1.order();
        order1.order();

        order1.cancel();
        order1.cancel();

        PizzaOrder order2 = new PizzaOrder("Маргарита", Size.MEDIUM, false, "Ленинградская 45");
        order2.order();
    }
}
