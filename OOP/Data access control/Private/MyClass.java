public class MyClass {
    private int privateVariable;

    public MyClass(){
        this.privateVariable = 0;
    }
    public void setPrivateVariable(int value){
        this.privateVariable = value;
    }

    public  int getPrivateVariable(){
        return privateVariable;
    }

    public static void main(String[] args) {
        MyClass myobject = new MyClass();

        myobject.privateVariable = 42;
        int value = myobject.getPrivateVariable();
        System.out.println("Private variable value: " + value);
    }
}
