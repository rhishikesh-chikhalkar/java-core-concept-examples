package This_Keyword;

public class thisKeyword {

    String name;// instance variable mapped per obj

    public thisKeyword(String name) {
        this.name = name;
        // System.out.println(this.name);
    }

    public void display() {
        System.out.println("inside display() method");
        this.show();
    }

    public void show() {
        System.out.println("Inside show() method");
    }

    public static void main(String[] args) {
        thisKeyword d1 = new thisKeyword("Rhishikesh");
        System.out.println(d1.name);
        d1.display();
    }
}