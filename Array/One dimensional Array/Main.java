public class Main {
    public static void main(String[] args) {
        int num[] = {3,6,2,4};
        System.out.println(num[0]);
        num[0] = 7;
        System.out.println(num[0]);
        System.out.println(num.length);

        System.out.println("\n");

        int num1[] = new int[4];
        num1[0] = 5;
        num1[1] = 4;
        num1[2] = 6;
        num1[3] = 8;

        for(int i = 0;i<4;i++)
        {
            System.out.println(num1[i]);
        }

    }

}
