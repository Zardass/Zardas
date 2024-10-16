package az.librarian.library_zerda.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class BookAddRequestDTO {

    private String name;

    private String author;

    private Integer pageCount;

    private Double price;
}
