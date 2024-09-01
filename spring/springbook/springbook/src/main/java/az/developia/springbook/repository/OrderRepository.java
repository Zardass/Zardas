package az.developia.springbook.repository;

import az.developia.springbook.entity.OrderEntity;
import az.developia.springbook.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity,Long> {

}
