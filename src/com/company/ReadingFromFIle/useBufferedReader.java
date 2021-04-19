package ReadingFromFIle;

import java.io.*;

public class useBufferedReader {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("abc.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(f));
        System.out.println(br.readLine());

        System.out.println("Enter Input:");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String input = br2.readLine();
        System.out.print(input);
    }
}
