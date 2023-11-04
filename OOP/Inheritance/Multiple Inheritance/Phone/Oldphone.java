public class Oldphone {
    String name;

    void call(){
        System.out.println("Hello " + name);
    }

    void message(){
        System.out.println("Please sent me a message " + name);
    }

    public static void main(String[] args) {
        Oldphone obj1 = new Oldphone();
        obj1.name = "Yasinsa";
        obj1.call();
        obj1.message();
    }
}
