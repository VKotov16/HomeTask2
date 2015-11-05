import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        while(true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Please input first number: ");
                double first = scanner.nextDouble();
                System.out.println("Your input " + first + " as a first number.");

                System.out.println("Please input second number: ");
                double second = scanner.nextDouble();
                System.out.println("Your input " + second + " as a second number.");

                System.out.println("Please input operation: ");
                char operation = (char)System.in.read();
                System.out.println("Your input " + operation);

                switch (operation)
                {
                    case '+':
                        System.out.println("Sum = " + (first + second));
                        break;
                    case '-':
                        System.out.println("Difference = " + (first - second));
                        break;
                    case '*':
                        System.out.println("Multiplication = " + (first * second));
                        break;
                    case '/':
                         if (second == 0)
                             System.out.println("Divide by zero");
                         else System.out.println("Division = " + (first / second));
                        break;
                    default :
                        System.out.println("Error operation.");
                }


            } catch (Exception e) {
                System.out.println("Please try again.");
                continue;
            }






        }
    }
}