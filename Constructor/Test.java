public class Test {
    String name;

    Test(){
        name = "Kamal";
        System.out.println("Hello");
    }

    void meth(){
        System.out.println("welcome");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.name);
        obj.meth();
    }
}
