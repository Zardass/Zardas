package az.developia.springbook.repository;

import az.developia.springbook.entity.CustomerEntity;
import az.developia.springbook.entity.CustomerViewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerViewRepository extends JpaRepository<CustomerViewEntity,Long> {

}
