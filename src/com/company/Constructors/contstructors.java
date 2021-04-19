package Constructors;
//Contructos are specialized methods 

// 1. have same name as class name
// 2. dont have return type
// 3. gets called automatically when object is created.
// 4. used for initialization purpose

public class contstructors {
    int a;
    String s;

    public contstructors() { // default constructor
        a = 10;
        System.out.println(a);
    }

    public contstructors(int val) { // parameterized contructor
        a = val;
        System.out.println(a);
    }

    public contstructors(String name, int val) {
        // s = name;
        // a = val;
        System.out.println("Name = " + name + "\nValue = " + val);
    }

    public static void main(String[] args) {
        contstructors obj = new contstructors();
        contstructors obj2 = new contstructors(20);
        contstructors obj3 = new contstructors("ABC", 30);
    }
}
