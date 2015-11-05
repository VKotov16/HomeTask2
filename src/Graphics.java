import java.util.Scanner;

public class Graphics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width");
        int width = scanner.nextInt();
        System.out.println("Enter height");
        int height = scanner.nextInt();

        for(int i = 0; i < height; i++)
        {
            for(int j = 0; j < width; j++)
            {
                if(i == 0 || i == (height - 1) || j == 0 || j == (width - 1))
                    System.out.print('*');
                else
                    System.out.print(' ');
            }
            System.out.print('\n');
        }
    }
}
