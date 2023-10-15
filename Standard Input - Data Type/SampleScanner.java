import java.util.Scanner;
public class SampleScanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int height;
        float gpa;
        System.out.print("Enter your height in inches: ");
        height = scanner.nextInt( );
        System.out.print("Enter your gpa: ");
        gpa = scanner.nextFloat( );

        System.out.println(height);
        System.out.println(gpa);
    }
}
