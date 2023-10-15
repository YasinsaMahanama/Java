import java.util.Scanner;
public class SampleScanner {
    public static void main(String[] args){
        Scanner employee = new Scanner(System.in);
        String firstName;
        System.out.println("Enter your first name: ");
        firstName = employee.next();
        System.out.println("Nice to meet you, " + firstName + ".");
    }
}
