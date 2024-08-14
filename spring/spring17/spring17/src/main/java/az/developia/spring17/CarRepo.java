package az.developia.spring17;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepo extends JpaRepository<Car,Long> {
    @Query(value = "select * from car where brand like %?1%",nativeQuery = true)
    public List<Car> findSearch(String brand);

 //   public List<Car> findAllByName(String brand);
}
