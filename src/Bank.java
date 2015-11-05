import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount (UAH)");
        double amount = scanner.nextDouble();
        System.out.println("Enter percent");
        double percent = scanner.nextDouble();
        System.out.println("Enter time (years)");
        int time = scanner.nextInt();

        for(int i = 0; i<time; i++)
        {
            amount = amount * (100+percent) / 100 ;
        }

        System.out.println("Money after " + time + " year : " + amount);

    }
}
