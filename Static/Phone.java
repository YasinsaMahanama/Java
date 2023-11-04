public class Phone {
    static String name;
    String color;
    int ram;

    static public void call(){
        System.out.println("take a call from " + name);
    }

    public void internet(){
        System.out.println("browse internet");
    }

    public static void main(String[] args) {
        name = "Samsung";
        call();

        Phone phone2 = new Phone();
        phone2.name = "LG";
        phone2.call();
    }
}
