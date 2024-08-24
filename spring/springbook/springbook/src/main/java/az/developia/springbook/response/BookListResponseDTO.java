package az.developia.springbook.response;

import az.developia.springbook.entity.BookEntity;
import lombok.Data;

import java.util.List;

@Data
public class BookListResponseDTO {
    private List<BookResponseDTOEntity> books;

}
