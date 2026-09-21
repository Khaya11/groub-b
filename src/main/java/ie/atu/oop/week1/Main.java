package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("hello OOP");
      Book firstBook = new Book();
         firstBook.title = "Dune";
         firstBook.author = "frank";
         firstBook.pageCount = 412;

         firstBook.displayDetails();
        System.out.println("\n");

        Book secondBook = new Book();
        secondBook.title = "Star Trek";
        secondBook.author = "Dave";
        secondBook.pageCount = 300;
        secondBook.available = true;

        secondBook.displayDetails();
    }

}