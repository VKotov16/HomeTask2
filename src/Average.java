import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        double sum = 0;
        int count = 0;

        System.out.println("Enter the number or press any key to exit");

        while(true)
        {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Please input number: ");
                double number = scanner.nextDouble();
                sum += number;
                count++;

            } catch(Exception e)
            {
                break;
            }
        }
        System.out.println("Average = " + (sum / count));
    }
}
