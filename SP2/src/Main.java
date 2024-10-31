public class Main {
    public static void main(String[] args) {

        //main metode

        Author author1 = new Author("Niki");
        AudioBook audioBook1 = new AudioBook("Java 1.0", "SKØN", 10, 400);
        author1.addTitle(audioBook1);

        System.out.println(author1.calculateTotalPay());

        PrintedBook printedBook1 = new PrintedBook("jaja","TE",140,72);
        author1.addTitle(printedBook1);
        System.out.println(author1.calculateTotalPay());


    }
}