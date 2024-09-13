package classwork.bookStorage;

import classwork.bookStorage.util.DateUtil;

import java.util.Date;
import java.util.Objects;

public class Book {
    private String id;
    private String tittle;
    private Author author;
    private double price;
    private int quantity;
    private Date createdAt;


    public Book(String id, String tittle, Author author, double price, int quantity, Date createdAt) {
        this.id = id;
        this.tittle = tittle;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.createdAt = createdAt;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && quantity == book.quantity && Objects.equals(id, book.id) && Objects.equals(tittle, book.tittle) && Objects.equals(author, book.author) && Objects.equals(createdAt, book.createdAt);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(id);
        result = 31 * result + Objects.hashCode(tittle);
        result = 31 * result + Objects.hashCode(author);
        result = 31 * result + Double.hashCode(price);
        result = 31 * result + quantity;
        result = 31 * result + Objects.hashCode(createdAt);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", tittle='" + tittle + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", quantity=" + quantity +
                ", createdAt= " + DateUtil.fromDateToString(createdAt) +
                '}';
    }
}
