package HashMapPack;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {
    public static void main(String[] args) {
        Map hm = new HashMap();
        hm.put("skills", "java");
        hm.put("price", 500);
        hm.put(1, "aaa");
        hm.put(11, 200);
        System.out.println(hm.get("skills"));
        System.out.println(hm.keySet());
        System.out.println(hm.values());

        Map hm2 = new HashMap<String, String>();
        hm2.put("name", "Rhishi");
        hm2.put("bloodGroup", "O+");
        hm2.put("address", "kolhapur");
    }
}
