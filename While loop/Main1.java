import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num;
        int count = 0;

        System.out.print("Enter a real number: ");
        
        while (true) {

            num = scanner.nextFloat();

            if (num < 0) {
                break;
            }

            count++;
        }

        System.out.println("Count: " + count);
        scanner.close();
    }
}
