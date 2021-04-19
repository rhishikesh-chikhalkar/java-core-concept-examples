package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {

        Queue q = new LinkedList<>();
        q.add(10);
        q.add(1);
        q.add(20);
        q.add("aaa");
        q.add(null);
        q.add(50);
        q.add(100);
        q.add(3);

        System.out.println("element pointed = " + q.peek());
        System.out.println("element that will be deleted = " + q.poll());
        System.out.println("now element that is pointed =" + q.peek());

        Iterator<Integer> itr = q.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}