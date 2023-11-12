public class Main {
    public static void main(String[] args) {
        String country;
        country = "Sri Lanka";
        System.out.println(country.substring(0, 8));
        System.out.println(country.length());
        System.out.println(country.indexOf("nka"));
        System.out.println(30 + " " + 40);
        System.out.println(30 + 40);

        //String sub range
        
        char country1[] = {'S', 'r', 'i', ' ' , 'L', 'a', 'n', 'k', 'a'};
        String SriLanka = new String(country1,4,5);
        System.out.println(SriLanka);
    }
}
