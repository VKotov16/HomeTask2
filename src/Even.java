import java.util.Scanner;

public class Even {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int number = scanner.nextInt();

        if(number % 2 == 0)
        {
            System.out.println("This number is even");
        } else
            System.out.println("This number is not even");

    }
}
