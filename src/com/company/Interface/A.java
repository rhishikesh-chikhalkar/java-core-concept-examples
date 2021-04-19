package Interface;

public class A implements Printable, Showable {
    public void methodA() {
        System.out.println("Inside Method of class A");
    }

    @Override
    public void show() {
        System.out.println("Inside show method in class A");
    }

    @Override
    public void print() {
        System.out.println("Inside print method of class A");
    }

    public static void main(String[] args) {
        Printable p = new A();
        p.print();
        Showable s = new A();
        s.show();

        // p.methodA(); //This method belongs to class A only so not possible
        // p.show(); //Belongs to different interface so not possible
        // s.print();//belongs to the interface so not possible

        A obj = new A();
        obj.methodA();
    }
}
