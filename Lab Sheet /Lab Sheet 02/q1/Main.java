public class Main {
    public static void main(String[] args) {

        //int[][] mttr = new int[4][10];
        int num = 10;

        for (int i=0;i<4;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(num < 50) {
                    System.out.print(num + "  ");
                    num++;
                }
                else {
                    break;
                }
            }
            System.out.println();
        }
    }
}
