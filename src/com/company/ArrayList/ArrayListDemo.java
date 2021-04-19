package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/* Resizable-array implementation of the List interface= AL
 * Q: Diff bet Array & ArrayList?
 * 1. arrays have fixed size; whereas ArrayList is dynamically growable & shrinkable.
 * 2. arrays store ele of same datatype; diff datatypes.
 * 3. internally AL uses concept of array; int a[100]; AL. mem efficient.
 * */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(100);
        al2.add(200);
        al2.add(300);

        ArrayList al = new ArrayList();
        al.add("janhavi");
        al.add(10);
        al.add(10.5f);
        al.add(20.0d);
        al.add(null);
        al.add("janhavi");
        al.add(al2); // adding one arraylist obj itself.

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("----------------------------------------");
        // For each loop
        // limitaion - cannot go backwards like for(int i=0,i>5,i--)
        System.out.println("\nUsing for each loop");
        for (Integer i : al2) {
            System.out.println(i);
        }

        System.out.println("----------------------------------------");
        System.out.println("iterating using traditional for loop");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        System.out.println("----------------------------------------");
    }
}
