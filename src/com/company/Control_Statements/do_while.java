package Control_Statements;

import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {

        char operator;
        int cont = 0;
        Double number1, number2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        do {
            // ask users to enter operator
            System.out.print("Choose an operator: +, - , *, or /:\n ");
            operator = input.next().charAt(0);

            // ask users to enter numbers
            System.out.print("Enter first Number: ");
            number1 = input.nextDouble();

            System.out.print("Enter Second Number: ");
            number2 = input.nextDouble();

            switch (operator) {
                // performs addition between numbers
                case '+':
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                    break;

                // performs substraction between numbers
                case '-':
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                    break;

                // performs multiplication between numbers
                case '*':
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                    break;

                // performs division between numbers
                case '/':
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                    break;

                default:
                    System.out.println("Invalid Operator !");
                    break;

            }
            System.out.println("\nDo you want continue?\nPress 1 to continue");
            cont = input.nextInt();
        } while (cont == 1);

    }
}