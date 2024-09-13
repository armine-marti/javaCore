package classwork.bookStorage;

import classwork.bookStorage.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Library {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();


    private static final String EXIT = "0";
    private static final String ADD_BOOK = "1";
    private static final String ADD_AUTHOR = "2";
    private static final String PRINT_ALL_BOOKS = "3";
    private static final String PRINT_ALL_AUTHORS = "4";
    private static final String SEARCH_BOOK_BY_NAME = "5";
    private static final String UPDATE_BOOK = "6";
    private static final String DELETE_BOOK = "7";
    private static final String SEARCH_BOOK_BY_PRICE = "8";
    private static final String SEARCH_BOOK_BY_AUTHOR = "9";


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
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_ALL_AUTHORS:
                    authorStorage.print();
                    break;
                case SEARCH_BOOK_BY_NAME:
                    searchBookByName();
                    break;
                case UPDATE_BOOK:
                    updateBook();
                    break;
                case DELETE_BOOK:
                    deleteBook();
                    break;
                case SEARCH_BOOK_BY_PRICE:
                    searchBookByPrice();
                    break;
                case SEARCH_BOOK_BY_AUTHOR:
                    searchBookByAuthor();
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }
    }

    private static void searchBookByAuthor() {
        authorStorage.print();
        System.out.println("please choose author ID");
        String authorId = scanner.nextLine();
        Author author = authorStorage.getAuthorByID(authorId);
        if (author != null){
            bookStorage.searchMyAuthor(author);
        }else{
            System.out.println("invalid author's ID");
        }
    }

    private static void addAuthor() {
        System.out.println("Please intput author's id, name, surname, phone, date of birth(01-01-2000)");
        String authorDataStr = scanner.nextLine();
        String [] authorDataArr = authorDataStr.split(",");
        if(authorDataArr.length == 5){
            String id = authorDataArr[0];
            if(authorStorage.getAuthorByID(id) == null){
                try {
                Author author = new Author();
                author.setId(id);
                author.setName(authorDataArr[1]);
                author.setSurname(authorDataArr[2]);
                author.setPhone(authorDataArr[3]);

                    author.setDateOfBirth(DateUtil.fromStringToDate(authorDataArr[4]));

                authorStorage.add(author);
                System.out.println("Author added!");
                } catch (ParseException e) {
                    System.out.println("Date of birth is incorrect ");;
                }
            }else {
                System.out.println("Author with id" + id + " already exists");
            }
        }


    }

    private static void searchBookByPrice() {
        System.out.println("Please input price range of the book");
        String min = scanner.nextLine();
        String max = scanner.nextLine();
        try {
            Double minPrice = Double.parseDouble(min);
            Double maxPrice = Double.parseDouble(max);
            bookStorage.getBookByPrice(minPrice, maxPrice);
        } catch (NumberFormatException e) {
            System.out.println("Please input only digits");
        }

    }


    private static void deleteBook() {
        bookStorage.print();
        System.out.println("Please input book ID you want to delete");
        String bookId = scanner.nextLine();
        Book bookById = bookStorage.getBookById(bookId);
        if (bookById != null) {
            bookStorage.deleteBook(bookId);
            System.out.println("Book was successfully deleted");
        } else System.out.println("Book with that ID does not exist");
    }

    private static void updateBook() {
        bookStorage.print();
        System.out.println("Please input book ID");
        String bookId = scanner.nextLine();
        Book bookById = bookStorage.getBookById(bookId);
        if (bookById != null) {
            authorStorage.print();
            System.out.println("Please choose author ID");
            String authorId = scanner.nextLine();
            Author author = authorStorage.getAuthorByID(authorId);
            if(author != null){
                System.out.println("Please input book's new tittle.");
                String tittle = scanner.nextLine();

                System.out.println("Please input book's new price ");
                String priceStr = scanner.nextLine();
                Double price = 0.0;
                System.out.println("Please input book's quantity ");
                String bookQuantity = scanner.nextLine();
                if (tittle != null && !tittle.isEmpty()) {
                    bookById.setTittle(tittle);
                }
               bookById.setAuthor(author);
                if (priceStr != null && !priceStr.isEmpty()) {
                    bookById.setPrice(Double.parseDouble(priceStr));
                }
                if (bookQuantity != null && !bookQuantity.isEmpty()) {
                    bookById.setQuantity(Integer.parseInt(bookQuantity));
                }
                System.out.println("Update was successful");
            }

        }
    }

    private static void searchBookByName() {
        System.out.println("Please input book's keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchByBookName(keyword);
    }

    private static void addBook() {
        authorStorage.print();
        System.out.println("Please choose your author ID");
        String authorId = scanner.nextLine();
        Author author = authorStorage.getAuthorByID(authorId);
        if(author != null){
            System.out.println("Please input book's ID");
            String id = scanner.nextLine();
            System.out.println("Please input book's tittle");
            String tittle = scanner.nextLine();
            System.out.println("Please input book's price ");
            Double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Please input book's quantity");
            int quantity = Integer.parseInt(scanner.nextLine());
            Book book = new Book(id, tittle, author, price, quantity, new Date());

            Book bookById = bookStorage.getBookById(id);
            if (bookById == null) {
                bookStorage.add(book);
                System.out.println("Book added");
            } else {
                System.out.println("Book with " + id + " already exists!");
            }
        }else{
            System.out.println("worng author id");
        }
        }


    private static void printCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_BOOK + " for ADD_BOOK");
        System.out.println("please input " + ADD_AUTHOR + " for ADD_AUTHOR");
        System.out.println("please input " + PRINT_ALL_BOOKS + " for SEE_All_BOOKS");
        System.out.println("please input " + PRINT_ALL_AUTHORS + " for SEE_All_AUTHORS");
        System.out.println("Please input " + SEARCH_BOOK_BY_NAME + " for SEARCH_BOOK_BY_BOOK_NAME");
        System.out.println("Please input " + UPDATE_BOOK + " for UPDATE_BOOK");
        System.out.println("Please input " + DELETE_BOOK + " for DELETE_BOOK");
        System.out.println("Please input " + SEARCH_BOOK_BY_PRICE + " for SEARCH_BOOK_BY_PRICE");
        System.out.println("Please input " + SEARCH_BOOK_BY_AUTHOR + " for SEARCH_BOOK_BY_AUTHOR");
    }
}
