import java.util.Scanner;

public class SimpleNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int number = scanner.nextInt();
        int count = 0;

        for(int i = 2; i < number; i++)
        {
            if(number % i == 0)
                count++;
        }

        if(count == 0)
            System.out.println("This number is simple");
        else System.out.println("This number is not simple");


    }
}
