public class Methods_Overloading {
    public void meth(){
        System.out.println("method 1");
    }

    public void meth(int x){
        System.out.println("method 2");
    }

    public void meth(double c){
        System.out.println("method 2");
    }
    public void meth(int x, int y){
        System.out.println("method 3");
    }

    public static void main(String[] args) {
        Methods_Overloading obj = new Methods_Overloading();
        obj.meth();
        obj.meth(5);
        obj.meth(2,4);
        obj.meth(2.5);
    }
}
