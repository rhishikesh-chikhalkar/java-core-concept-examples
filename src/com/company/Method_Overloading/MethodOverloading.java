package Method_Overloading;
//1. To implement polymorphism feature of oop

//2. static time or ealy binding or compile time binding
//3. same method name but having different signatures or syntaxes 

public class MethodOverloading {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    String add(String a, String b) {
        return a + "" + b;
    }

    int add(int... args) {// Ellipsis operator in java - it should be alone or in the end
        int sum = 0;
        for (int i : args) {// Enhaced for loop or foreach loop
            sum = sum + i;
        }
        return sum;
    }

    String add(String... args) {
        String result = "";

        for (String i : args) {
            result = result + "" + i;
        }
        return result;
    }

    public static void main(String[] args) {
        MethodOverloading m1 = new MethodOverloading();
        System.out.println(m1.add(10, 20));
        System.out.println(m1.add(10, 20, 30));
        System.out.println(m1.add("wel", "come"));
        System.out.println(m1.add(10, 20, 30, 40, 50));
        System.out.println(m1.add("wel", "come", " to ", " java ", " program "));
    }
}
