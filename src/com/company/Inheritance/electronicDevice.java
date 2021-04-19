package Inheritance;

public class electronicDevice {
    String name;
    double price;

    public electronicDevice() {
        name = "device";
        price = 10000;
    }

    public void show() {
        System.out.println(name);
        System.out.println(price);
    }

    public static void main(String[] args) {
        electronicDevice e1 = new electronicDevice();
        e1.show();
    }
}