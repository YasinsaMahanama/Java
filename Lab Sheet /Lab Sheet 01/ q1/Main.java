import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner odd_length_word = new Scanner(System.in);
        String word;
        System.out.println("Enter your word : ");
        word = odd_length_word.next();
        if (word.length()%2 == 0)
        {
            System.out.println("Enter word with odd length...");
        }
        else {
            int middleIndex = word.length() / 2;
            char middleChar = word.charAt(middleIndex);
            System.out.println("Middle Character is " + middleChar);
        }
    }
}
