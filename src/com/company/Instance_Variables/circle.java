package Instance_Variables;

// TO demostrate the use of instance of variables

public class circle {
    double radius;
    final double PI = 3.14;

    public double circumference() {
        return 2 * PI * radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        circle c1 = new circle();
        c1.radius = 10; // Instance of variable

        System.out.println("\nRadius = " + c1.radius);
        System.out.println("Circumference of circle = " + c1.circumference());
        System.out.println("Area of circle = " + c1.area());

        circle c2 = new circle();
        c2.radius = 100; // Instance of variable

        System.out.println("\nRadius = " + c2.radius);
        System.out.println("Circumference of circle = " + c2.circumference());
        System.out.println("Area of circle = " + c2.area());
    } // End of main function
}
