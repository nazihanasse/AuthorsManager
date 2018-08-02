package nazih.com.authorsManager.bootstrap;

import nazih.com.authorsManager.entities.Author;
import nazih.com.authorsManager.entities.Book;
import nazih.com.authorsManager.repositories.AuthorRepository;
import nazih.com.authorsManager.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    public void initData() {
        Book firstBook = new Book();
        Author author = new Author();
        author.setFirstName("Anasse");
        author.setLastName("NAZIH");
        Set<Book> books = new HashSet<Book>();
        books.add(firstBook);
        author.setBooks(books);
        firstBook.setId((long) 1);
        bookRepository.save(firstBook);
        authorRepository.save(author);
    }
}

