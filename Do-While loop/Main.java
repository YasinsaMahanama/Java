import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int count = 0;
        int sum = 0;

        do {

            if (num % 2 != 0) {
                sum += num;
                num++;
            }
            else {
                num++;
            }
        }while (num<30);

        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
