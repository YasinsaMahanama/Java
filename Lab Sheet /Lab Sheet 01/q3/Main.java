import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         float length;
        System.out.println("Enter the length in centimeters : ");
        length = scanner.nextFloat();

        float ilength = length/2.54f;

        float flength = ilength/12f;

        System.out.println("inches = " + ilength);
        System.out.println("feet = " + flength);
    }

}
