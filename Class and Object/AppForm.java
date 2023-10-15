public class AppForm {
    String name;
    int age;

    public void display(){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        AppForm yasinsa = new AppForm();
        yasinsa.name = "Yasinsa Mahanam";
        yasinsa.age = 22;
        yasinsa.display();

        AppForm tharu = new AppForm();
        tharu.name = "Tharushi";
        tharu.age = 24;
        tharu.display();
    }
}
