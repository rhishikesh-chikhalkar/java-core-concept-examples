package Arithmetic;

import java.util.Scanner;

public class Demo2 {
    static void printAP(int num1, int[] array2) {

        int num = num1;
        int array[] = array2;
        int index = 0;

        int temp = array[1];
        for (int i = 1; i < num + 1; i++) {
            if (array[i] < temp && array[i] != temp) {
                temp = array[i];
                index = i;
            } else {

                for (int l = 1; l < num + 1; l++) {
                    if (temp == array[l]) {
                        index = l;

                    }
                }
                if (index == num) {
                    index = -1;
                } else {
                    int temp2;
                    int k;
                    for (k = 1; k < num + 1; k++) {
                        for (int j = k + 1; j < num + 1; j++) {
                            if (array[k] > array[j]) {
                                temp2 = array[k];
                                array[k] = array[j];
                                array[j] = temp2;
                                index = k;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(index);
    }

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
