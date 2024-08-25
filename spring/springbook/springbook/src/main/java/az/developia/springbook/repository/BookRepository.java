package az.developia.springbook.repository;

import az.developia.springbook.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<BookEntity,Long> {
    @Query(value = "select * from books limit ?1 , ?2" ,nativeQuery = true)
    List<BookEntity> findAllPagination(Integer begin, Integer length);
    //findAllPagination(3,10)

}
