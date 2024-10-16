package az.librarian.library_zerda.repository;

import az.librarian.library_zerda.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity,Long> {
}
