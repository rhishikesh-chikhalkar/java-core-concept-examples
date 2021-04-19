package Interface;

public class FoodOutlet implements First, AcceptOrder {

    @Override
    public void calculateBill() {
        System.out.println("//inside calculate bill");
        // TODO auto-getnerated method stub
        System.out.println("used for calculate printing bill");
    }

    @Override
    public void takeOrder() {
        System.out.println("//inside - class foodoutlet-takeorder method");
        // TODO Auto-generated method stub
        System.out.println("Taking Order");

    }

    public static void main(String[] args) {
        FoodOutlet f = new FoodOutlet();
        f.calculateBill();
        f.takeOrder();
    }
}
