package app19a.service;
import app19a.domain.Book;
import app19a.domain.Category;

import java.util.List;

/**
 * @author gyao
 * @create date 2019-05-07 5:49 PM
 **/
public interface BookService {
    List<Category> getAllCategories();
    Category getCategory(int id);
    List<Book> getAllBooks();
    Book save(Book book);
    Book update(Book book);
    Book get(long id);
    long getNextId();
}
