import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for(int i = 1;i<=50;i++)
        {
            if(i % 5 == 0)
            {
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
