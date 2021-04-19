package Stack;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> s1 = new Stack<>();

        s1.add(10);
        s1.add(90);

        Vector<Object> v1 = new Vector<>();
        System.out.println(v1.size());
        v1.add(10);
        v1.add(20);
        v1.add("rhishi");
        v1.add(null);
        v1.addAll(s1);
        System.out.println(v1);
        System.out.println(v1.size());

        boolean res = v1.remove("rhishi");
        System.out.println(res);
        v1.remove(1);// it removes 1st index from vector
        System.out.println(v1);

        s1.add(10);
        s1.add(30);
        s1.add(20);

        s1.push(40);// insert into stack
        s1.push(50);

        System.out.println(s1);
        s1.pop();// Element is removed
        System.out.println("After Pop Operation Performed = " + s1);
        System.out.println(s1.peek());// Only display
        System.out.println(s1);
        
    }
}
