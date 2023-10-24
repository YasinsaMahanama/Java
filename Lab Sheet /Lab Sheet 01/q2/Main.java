import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first, middle, last;
        System.out.println("Enter your first name : ");
        first = scanner.next();
        System.out.println("Enter your middle name : ");
        middle = scanner.next();
        System.out.println("Enter your last name : ");
        last = scanner.next();

        System.out.println(last + ", " + first + " " + middle.substring(0,1));
    }

}
