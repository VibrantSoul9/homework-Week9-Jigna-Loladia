package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        char moreCalculations;
        do {
            System.out.print("Enter first Number : ");
            int num1 = scanner.nextInt();
            System.out.println("Enter second Number : ");
            int num2 = scanner.nextInt();
            System.out.print("Please enter one of the symbols (+, -, *, /) : ");
            char symbol = scanner.next().charAt(0);
            calculator.calculateResult(num1, num2, symbol);
            System.out.print("Would you like to do more calculations?");
            moreCalculations = scanner.next().charAt(0);
        } while (moreCalculations == 'Y' || moreCalculations == 'y');
        System.out.println("Program terminted");
        scanner.close();
    }
}