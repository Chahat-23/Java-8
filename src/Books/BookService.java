package Books;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBooksInSort() {
        List<Book> books = new BookDAO().getBooks();
//        Collections.sort(books, new myComparator() {}); - First approach for comparator

        // Second approach for comparator - with anon implimentation
//        Collections.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });


        // third approach - lambda expression
        Collections.sort(books, (o1,o2) -> o1.getName().compareTo(o2.getName()));
        return books;
    }
    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSort());
    }
}

// First approach for comparator
//class myComparator implements Comparator<Book> {
//    @Override
//    public int compare(Book o1, Book o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}
