public class Latestphone extends Newphone{
    void camera(){
        System.out.println("Using web camera");
    }

    public static void main(String[] args) {
        Latestphone obj3 = new Latestphone();
        obj3.name = "Janidu";
        obj3.call();
        obj3.camera();
        obj3.browseinternet();
    }
}
