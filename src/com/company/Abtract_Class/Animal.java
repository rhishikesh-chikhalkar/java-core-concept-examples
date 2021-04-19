// It implemetns abstraction feature of OOP
// 2. Even if a single method 

package Abtract_Class;

public abstract class Animal {

    int noOfLegs;

    public Animal() {
        noOfLegs = 4;
        System.out.println(noOfLegs);
    }

    public abstract void eat();

    public void sound() {
        // System.out.println("inside sound mathod.");
        System.out.println("Animals have sound.");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        cat c = new cat();
        Animal a = new Dog();
        Animal a2 = new cat();
        a.eat();
        a.sound();
        a2.eat();
        a2.sound();
        d.eat();
        d.sound();
        c.eat();
        c.sound();
    }
}
