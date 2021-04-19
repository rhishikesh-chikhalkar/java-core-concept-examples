package IO;

import java.io.*;

public class count {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("abc.txt");
        try {
            int count = 0;
            while (fin.read() != -1) {
                count++;

            }
            System.out.println("count=>" + count);

        } catch (FileNotFoundException e) {
            System.out.println("File Opening failed");
            e.printStackTrace();
        } finally {
            fin.close();
        }
    }
}
