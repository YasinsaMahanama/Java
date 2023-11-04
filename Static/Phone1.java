public class Phone1 {
    static String name;
    static String name1;
    String color;
    int ram;

    static public void call(){
        System.out.println("take a call from " + name);
    }

    static public void call1(){
        System.out.println("take a call from " + name1);
    }

    public void internet(){
        System.out.println("browse internet");
    }

    public static void main(String[] args) {
        name = "Samsung";
        call();

        name1 = "Huawei";
        call1();

        Phone phone2 = new Phone();
        phone2.name = "LG";
        phone2.call();
    }
}
