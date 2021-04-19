package Basic;

public class UseObject {
    // variables or attributes
    String name;
    int age;

    public void eat() {
        System.out.println("Inside eat method");
    }

    public void sleep() {
        System.out.println("Inside sleep method");
    }

    public static void main(String[] args) {
        // object creation
        UseObject obj1 = new UseObject();
        obj1.eat();
        obj1.sleep();
        obj1.name = "Rhishi";
        obj1.age = 40;
        System.out.println(obj1.name);
        System.out.println(obj1.age);
    }
}
