import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for(int i = 1;i<=100;i++)
        {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
