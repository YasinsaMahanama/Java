import java.util.*;
public class Main {
    public static void main(String[] args) {

        int num = 11;
        int count = 0;

        while(num <= 20)
        {
            count += num;
            num++;
        }

        System.out.println("Count : " + count);
    }
}
