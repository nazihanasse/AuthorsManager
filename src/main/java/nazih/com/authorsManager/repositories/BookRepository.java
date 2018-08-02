package nazih.com.authorsManager.repositories;

import nazih.com.authorsManager.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
