package classwork.bookStorage;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size;

    public void add(Book book){
        if(books.length==size){
            extendStorage();
        }
        books[size++] = book;
    }

    private void extendStorage(){
        Book[] tmp = new Book[size+10];
        System.arraycopy(books, 0,tmp,0,size);
        books = tmp;
    }
    void print(){
        for (int i = 0; i<size; i++){
            System.out.println(books[i]);
        }
    }

    public void searchByBookName(String keyword) {
        for(int i = 0;i<size;i++){
            if(books[i].getTittle().contains(keyword)){
                System.out.println(books[i]);
            }
        }
    }

    public Book getBookById(String id){
        for (int i = 0; i<size;i++){
            if(books[i].getId().equals(id)){
                return books[i];
            }
        }
        return null;
    }
}
