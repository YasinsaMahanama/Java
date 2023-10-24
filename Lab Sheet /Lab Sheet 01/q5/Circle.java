import java.util.*;
public class Circle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float r1, r0;

        System.out.println("Enter the radius in large circle : ");
        r0 = scanner.nextFloat();
        System.out.println("Enter the radius in small circle : ");
        r1 = scanner.nextFloat();

        float r2 = setRadius(r0, r1);
        float A = computeArea(r2);
        System.out.println("Area : "+ A);

        float C1 = computeCircumference(r0);
        float C2 = computeCircumference(r1);
        System.out.println("Circumference of large circle : " + C1);
        System.out.println("Circumference of small circle : " + C2);
    }

    public static float setRadius(float r0,float r1){
        float r = r0 - r1;
        return r;
    }

    public static float computeArea(float r){
        final float PI = 3.14f;
        float Area = PI * r * r;
        return Area;
    }

    public static float computeCircumference(float r){
        final float PI = 3.14f;
        float Circumference = 2 * PI * r;
        return Circumference;
    }
}
