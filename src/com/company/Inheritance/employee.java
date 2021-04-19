package Inheritance;

public class employee {

    String name;
    double salary;
    double baseSal = 10000;
    double hra = 5000;
    double ta = 1000;
    double da = 500;

    public double calSal() {
        salary = baseSal + hra + ta + da;
        System.out.println(salary);
        return salary;
    }

    public static void main(String[] args) {

        SoftwareEngineer obj = new SoftwareEngineer();
        obj.calSal();
    }

}