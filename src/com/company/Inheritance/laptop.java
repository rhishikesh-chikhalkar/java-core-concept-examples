package Inheritance;

public class laptop extends electronicDevice {
    String companyName;
    double wt;

    public laptop() {
        companyName = "dell";
        wt = 1;
    }

    public void display() {
        System.out.println(companyName);
        System.out.println(wt);
    }

    public static void main(String[] args) {
        laptop l1 = new laptop();
        l1.name = "laptop";// reusablility
        l1.price = 40000;// reusablility
        l1.companyName = "lenovo";// extensibility
        l1.wt = 0.5;// extensibility

        l1.display();
        l1.show();
    }

}
