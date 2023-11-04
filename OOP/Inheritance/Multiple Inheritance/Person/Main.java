public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob", 25, "S12345");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Student ID: " + student.getStudentId());
    }
}
