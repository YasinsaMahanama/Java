public class Newphone extends Oldphone{
    void browseinternet(){
        System.out.println("Using internet");
    }

    public static void main(String[] args) {
        Newphone obj2 = new Newphone();
        obj2.name = "Mahanama";
        obj2.call();
        obj2.message();
        obj2.browseinternet();
    }
}
