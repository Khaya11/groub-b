package ie.atu.oop.week1;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
     Book book = new Book("Dune","Frank",412);
     book.borrowBook();
     try{
         book.borrowBook();
     }
     catch(IllegalStateException ex){
         System.out.println(ex.getMessage());
     }
        System.out.println(book.getStatus());
     }
}