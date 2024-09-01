package az.developia.springbook.repository;

import az.developia.springbook.entity.BookEntity;
import az.developia.springbook.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {

}
