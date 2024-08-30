package classwork.bookStorage;

import java.util.Objects;

public class Book {
    private String id;
    private String tittle;
    private String authorName;
    private double price;
    private int quantity;


    public Book(String id, String tittle, String authorName, double price, int quantity){
        this.id = id;
        this.tittle = tittle;
        this.authorName = authorName;
        this.price = price;
        this.quantity = quantity;
    }
    public Book(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && Objects.equals(id, book.id) && Objects.equals(tittle, book.tittle) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(id);
        result = 31 * result + Objects.hashCode(tittle);
        result = 31 * result + Objects.hashCode(authorName);
        result = 31 * result + Double.hashCode(price);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", tittle='" + tittle + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price + '\'' +
                ", quantity=" +quantity +
                '}';
    }
}
