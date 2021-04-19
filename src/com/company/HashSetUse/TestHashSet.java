package HashSetUse;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();

        hs.add("aaa");
        hs.add(null);
        hs.add("bbb");
        hs.add("java adv");

        System.out.println("------------------------------------------");
        for (String s : hs) {
            System.out.println(s);
        }
        System.out.println("------------------------------------------");
        Set s = new HashSet();
        s.addAll(hs);

        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("------------------------------------------");
    }
}
