package Array.BookDetalils;

import java.util.Scanner;

public class BookArrayTest {
    public static void main(String[] args) {
        int choice;
    Scanner input = new Scanner(System.in);

    Book objBook = new Book();

    do {
        System.out.println("\n Welcome to E-Repository" +" Seclraect the operaton you want perform :") ;
        System.out.println("***********************************");
        System.out.println("1.Add book to the responsitory");
        System.out.println("2.Search book by ISBN");
        System.out.println("3.Serach book by year");
        System.out.println("4.Display book detaiks");
        System.out.println("5.Exit");
        choice = input.nextInt();


        switch (choice){
            case 1:
                objBook .addBook();
                break;
            case 2 :
                objBook.searchByIsbn();
                break;
            case 3:
                objBook.searchByYear();
                break;
            case 4:
                objBook.displaybook();
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    } while (choice !=5);
}
}
