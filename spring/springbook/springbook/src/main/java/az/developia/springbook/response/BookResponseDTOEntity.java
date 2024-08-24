package az.developia.springbook.response;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookResponseDTOEntity {
//filtering
    //search -> gelen melumatlara  limit qoyur
    //filtrasiya ->melumatlari yerinde saxlayir icindekine limit qoyur
    private Long id;

    private String name;

    private Double price;

    private String author;

}

