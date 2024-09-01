package az.developia.springbook.repository;

import az.developia.springbook.entity.CustomerEntity;
import az.developia.springbook.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {

}
