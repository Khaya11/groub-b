package ie.atu.oop.week1;
public class Main {
    public static void main(String[] args) {
        Book dune = new Book(
                "Dune", "Frank Herbert", 412);
        Book nineteenEightyFour = new Book(
                "1984", "George Orwell", 328);
        Book cleanCode = new Book(
                "Clean Code", "Robert C. Martin", 464);

        LibraryService service = new LibraryService();

        service.addBook(dune);
        service.addBook(nineteenEightyFour);
        service.addBook(cleanCode);




        Book found = service.findBookByTitle("Dune");


        System.out.println("Remove Clean Code: " + service.removeBook("Clean Code"));

        System.out.println("Remove again: " + service.removeBook("Clean Code"));

        System.out.println("Books left: " + service.getBookCount());

        System.out.println("Books left after second removal:" + service.getBookCount());
    }
}