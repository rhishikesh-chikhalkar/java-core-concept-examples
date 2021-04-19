package String;

public class UseString {

    public static void main(String[] args) {
        String s = "Fortune Cloud ";
        String s2 = new String("cravita ");

        char a = s.charAt(0);
        System.out.println(a);
        boolean b = s.isBlank();
        System.out.println(b);
        String c = s.concat("technology");
        String c2 = s2.concat("technology");
        System.out.println(c);
        System.out.println(c.length());
        System.out.println(c2);
        System.out.println(c2.length());

        System.out.println("-----------------------");
        StringBuffer sb = new StringBuffer("Cravita");
        sb.append("technology");
        int cap = sb.capacity();
        System.out.println("Capacity : " + cap);
        System.out.println("Length : " + sb.length());
        int i = sb.indexOf("c");
        System.out.println(i);

        System.out.println("-----------------------");
        StringBuilder sb2 = new StringBuilder("Rhishikesh");
        System.out.println(sb2.reverse());

    }
}