package mypackage;

public class SubClass extends MyClass {
    public void accessProtectedMembers(){
        protectedVariable = 42;
        System.out.println("Protected variable value: " + protectedVariable);
        protectedMethod();
    }

}
