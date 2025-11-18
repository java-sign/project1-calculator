import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        // variable for taking input from user
        Scanner input = new Scanner(System.in);

        // TODO: Declare a variable to store the first number (use double)
        double num1 = _________________________ ;


        // TODO: Declare a variable to store the second number (use double)
        double num2 = _________________________ ;


        // TODO: Declare a variable to store the operator (+, -, *, /) as a char
        char operator = ________________________ ;


        // --- GET INPUT FROM USER ---
        System.out.print("Enter first number: ");
        // TODO: Assign the user input to num1
        num1 = __________________________________ ;

        System.out.print("Enter second number: ");
        // TODO: Assign the user input to num2
        num2 = __________________________________ ;

        System.out.print("Enter an operator (+ - * /): ");
        // TODO: Assign the operator using input.next().charAt(0)
        operator = ________________________________ ;


        double result = 0;

        // --- DECISION MAKING: Perform operation ---
        // TODO: Write an if-else-if structure to check operator and do calculation
        // Hint: if (operator == '+') { result = num1 + num2; }
        
        if ( ______________________________________ ) {
            result = ________________________________ ;
        } else if ( ________________________________ ) {
            result = ________________________________ ;
        } else if ( ________________________________ ) {
            result = ________________________________ ;
        } else if ( ________________________________ ) {
            result = ________________________________ ;
        } else {
            System.out.println("Invalid operator!");
            input.close();
            exit(1);
        }
        

        // --- OUTPUT ---
        System.out.println("Result: " + result);

        // Close scanner
        input.close();
    }
}
