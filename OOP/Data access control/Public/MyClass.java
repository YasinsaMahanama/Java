public class MyClass {
    public int publicVariable;

    public void publicMethod(){

        System.out.println("This is a public method");
    }

    public static void main(String[] args) {
        MyClass myobject = new MyClass();

        myobject.publicVariable = 42;
        System.out.println("value: " + myobject.publicVariable);

        myobject.publicMethod();
    }
}
