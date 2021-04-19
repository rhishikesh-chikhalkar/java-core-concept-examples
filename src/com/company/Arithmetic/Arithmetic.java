package Arithmetic;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Arithmetic {
    // Java Program to print an arithmetic
    // progression series

    static void printAP(int num1, int[] array2) {

        int num = num1;
        int array[] = array2;

        int temp = 1;
        for (int i = 1; i < num + 1; i++) {
            // System.out.println(array[i]);
        }

        while (num != 1) {

            // System.out.println("inside while");
            temp = 1;
            for (int i = 1; i < num + 1; i++) {
                if (i % 2 == 0) {
                    array[temp] = array[i];
                    // System.out.println(array[temp]);
                    temp = temp + 1;
                }
            }
            num = temp - 1;
            // System.out.println(num);

        }
        System.out.println(array[num]);
    }

    // Driver code
    public static void main(String[] args) {

        // System.out.print("Enter num = \t");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] array = new int[num + 1];
        int temp = 1;
        for (int i = 1; i < num + 1; i++) {
            array[i] = sc.nextInt();
            temp += 1;
            // System.out.println(array[i]);
        }

        printAP(num, array);
    }
}
