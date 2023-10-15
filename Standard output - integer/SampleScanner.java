import java.util.Scanner;
public class SampleScanner {
    public static void main(String[] args){
        Scanner employee = new Scanner(System.in);
        int age;
        System.out.println("Enter your age: ");
        age = employee.nextInt();
        System.out.println("You are " + age + " years old.");
    }
}
