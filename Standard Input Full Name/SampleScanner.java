import java.util.Scanner;
public class SampleScanner {
    public static void main(String[] args){
        Scanner employee = new Scanner(System.in);
        String firstName;
        String lastName;
        System.out.println("Enter your first name: ");
        firstName = employee.next();
        System.out.println("Enter your last name: ");
        lastName = employee.next();
        System.out.println(firstName + " " + lastName + ".");
    }
}
