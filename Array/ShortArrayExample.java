public class ShortArrayExample {
    public static void main(String[] args) {

        short[] temperatures = { 22, 24, 23, 21, 20 };

        System.out.println("Temperature at 2nd hour: " + temperatures[1]);

        int length = temperatures.length;
        System.out.println("Number of temperature readings: " + length);
        
        temperatures[0] = 25;
        System.out.println("Updated temperature at 1st hour:" + temperatures[0]);
    }
}
