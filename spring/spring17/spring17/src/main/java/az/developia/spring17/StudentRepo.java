package az.developia.spring17;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
    @Query(value = "select * from students where name like %?1%",nativeQuery = true)
    public List<Student> findSearch(String name);

    //Query method
    public List<Student> findAllByName(String name);


}
