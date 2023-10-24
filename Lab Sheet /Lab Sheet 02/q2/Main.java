import java.util.*;
public class Main {
    public static void main(String[] args) {

        digits();

    }

    public static void digits(){

        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter the number : ");
            int num = scanner.nextInt();
            int count = 0;

            if (num <= 0) {
                System.out.println("Enter the positive integer & end the program...");
                break;
            } else {
                while (num > 0) {
                    count++;
                    num = num / 10;
                }
                System.out.println("Number of digits: " + count);
                System.out.println();
            }
        }
    }
}
