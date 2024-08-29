package classwork.bookStorage;

import java.util.Scanner;

public class Library {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();


    private static final String EXIT = "0";
    private static final String ADD_BOOK = "1";
    private static final String PRINT_ALL_BOOKS = "2";
    private static final String SEARCH_BOOK_BY_NAME = "3";
    private static final String UPDATE_BOOK = "4";

    public static void main(String[] args) {


        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOK_BY_NAME:
                    searchBookByName();
                    break;
                case UPDATE_BOOK:
                    updateBook();
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }
    }

    private static void updateBook() {
        bookStorage.print();
        System.out.println("Please input book ID");
        String bookId = scanner.nextLine();
        Book bookById = bookStorage.getBookById(bookId);
        if(bookById != null){
            System.out.println("Please input book's new tittle");
            String tittle = scanner.nextLine();
            System.out.println("Please input author's new name");
            String authorName = scanner.nextLine();
            System.out.println("Please input book's new price ");
            double price = Double.parseDouble(scanner.nextLine());
            bookById.setTittle(tittle);
            bookById.setAuthorName(authorName);
            bookById.setPrice(price);
            System.out.println("Update was successful");
        }
    }

    private static void searchBookByName() {
        System.out.println("Please input book's keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchByBookName(keyword);
    }

    private static void addBook() {
        System.out.println("Please input book's ID");
        String id = scanner.nextLine();
        System.out.println("Please input book's tittle");
        String tittle = scanner.nextLine();
        System.out.println("Please input author's name");
        String authorName = scanner.nextLine();
        System.out.println("Please input book's price ");
        double price = Double.parseDouble(scanner.nextLine());
        Book book = new Book(id, tittle, authorName, price);
        Book bookById = bookStorage.getBookById(id);
        if (bookById == null){
            bookStorage.add(book);
            System.out.println("Book added");
        }else{
            System.out.println("Book with " + id + "already exists!");
        }

    }

    private static void printCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_BOOK + " for ADD_BOOK");
        System.out.println("please input " + PRINT_ALL_BOOKS + " for SEE_All_BOOKS");
        System.out.println("Please input " + SEARCH_BOOK_BY_NAME + " for SEARCH_BOOK_BY_BOOK_NAME");
    }
}
