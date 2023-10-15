public class wrapperExample {
    public static void main(String[] args){
        int primitiveInt = 42;

        Integer wrappedInt = Integer.valueOf(primitiveInt);

        int result = wrappedInt + 10;
        System.out.println("Result: " + result);

        String numberStr = "12345";
        Integer parsedInt = Integer.parseInt(numberStr);
        System.out.println("Parsed Integer: " + parsedInt);

        String intToStr = wrappedInt.toString();
        System.out.println("Integer to String: " + intToStr);
    }
}
