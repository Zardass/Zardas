package az.developia.springbook.repository;

import az.developia.springbook.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<MenuEntity,Long> {

    List<MenuEntity> findAllByLang(String lang);

}
