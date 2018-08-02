package nazih.com.authorsManager.repositories;

import nazih.com.authorsManager.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
