package HashSetUse;

import java.util.Iterator;
import java.util.TreeSet;

//null not allowed
//element stored in 
public class TestTreeSet {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<String>();
        ts.add("abbc");
        ts.add(null);
        ts.add("aaa");
        ts.add("bbb");
        ts.add("ccc");

        System.out.println("higher = " + ts.higher("bbb"));// immediately hihger than "bbb"
        System.out.println("lower = " + ts.lower("bbb"));
        System.out.println("poll first =>" + ts.pollFirst());// display & remove first
        System.out.println("poll last =>" + ts.pollLast());
        System.out.println("-----------------------------------------");
        for (String s : ts) {
            System.out.println(s);
        }

        System.out.println("-----------------------------------------");
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("-----------------------------------------");
    }
}
