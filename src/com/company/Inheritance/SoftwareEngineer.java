package Inheritance;

// 1. Inheritance is mandatory [is-a relationship]
// 2. same method name, return type as base class
//3. in method overloading everything is inside same class whereas, for method overriding , you require one base class & one child class
//4. late binding because depaending upon obj creation, respective method will get called.

//Construtor

public class SoftwareEngineer extends employee {

    int id;
    double incentive;
    double totalSal;

    public SoftwareEngineer() {
        System.out.println("Inside child class default scontructor.");
        incentive = 5000;
    }

    public SoftwareEngineer(double i) {
        // super(20000);
        incentive = i;
        System.out.println("Insidide child class parameterised contructor.");
    }

    @Override // annotation; instruction to compiler to not to treat following method as
              // completely new method
    public double calSal() {
        totalSal = super.calSal() + incentive;
        System.out.println(totalSal);
        return totalSal;
    }

    public static void main(String[] args) {

        SoftwareEngineer s1 = new SoftwareEngineer();
        s1.calSal();

        employee e = new employee();
        e.calSal();// late binding

        employee obj2 = new SoftwareEngineer();// Dynamic type creation
        obj2.calSal();// call child class method
    }
}