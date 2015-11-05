import java.util.Scanner;

public class Multiplicity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int number = scanner.nextInt();

        System.out.println("This number multiply next numbers: ");

        for(int i = 1; i <= number; i++)
        {
            if(number % i == 0)
                System.out.println(i);
        }
    }
}
