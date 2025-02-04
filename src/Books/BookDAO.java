package Books;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "java", 268));
        books.add(new Book(425, "C++", 562));
        return books;
    }
}
