public class Phone {
    String name;
    String color;
    int ram;

    public void call(){
        System.out.println("take a call from " + name);
    }

    public void internet(){
        System.out.println("browse internet");
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.name = "Samsung";
        phone1.color = "black";
        phone1.call();

        Phone phone2 = new Phone();
        phone2.name = "LG";
        phone2.call();
    }
}
