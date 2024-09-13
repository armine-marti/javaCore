package classwork.bookStorage;

public class AuthorStorage {

    private Author[] authors = new Author[10];
    private int size;

    public void add(Author author){
        if(authors.length == size){
            extendStorage();
        }
        authors[size++] = author;
    }

    private void extendStorage(){
        Author[] tmp = new Author[size +10];
        System.arraycopy(authors, 0, tmp,0, size);
        authors = tmp;
    }

    public void print(){
        for(int i = 0; i<size; i++){
            System.out.println(authors[i]);
        }
    }

    public Author getAuthorByID(String id){
        for(int i = 0; i<size; i++){
            if (authors[i].getId().equals(id)){
                return authors[i];
            }
        }
        return null;
    }
    public void deleteAuthor(String id) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getId().equals(id)) {
                int indexToDelete = i;
                for (i = indexToDelete + 1; i < size; i++) {
                    authors[i - 1] = authors[i];
                }
                size--;
            }
        }
    }
}
