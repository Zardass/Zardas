package az.developia.springbook.repository;

import az.developia.springbook.entity.OrderDetailEntity;
import az.developia.springbook.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity,Long> {

}
