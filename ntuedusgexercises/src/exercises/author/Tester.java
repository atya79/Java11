package exercises.author;

public class Tester {
    public static void main(String[] args) {
        Author author1 = new Author("AviDasta","ada@gg.com",'m');
        System.out.println(author1.toString());
        System.out.println(author1.getGender());
        System.out.println(author1.getName());
        System.out.println(author1.getEmail());
    }



}
