import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the your mark : ");

        int mark = scanner.nextInt();

        if(80 <= mark && mark <= 100){
            System.out.println("pass : A");
        } else if (70 <= mark) {
            System.out.println("pass : B");
        }
        else if(60 <= mark) {
            System.out.println("pass : C");
        } else if (50 <= mark) {
            System.out.println("pass : D");
        } else if (40 <= mark) {
            System.out.println("pass : E");
        } else if (0 <= mark && mark <40) {
            System.out.println("pass : F");
        }else {
            System.out.println("Invalid Input");
        }
    }
}
