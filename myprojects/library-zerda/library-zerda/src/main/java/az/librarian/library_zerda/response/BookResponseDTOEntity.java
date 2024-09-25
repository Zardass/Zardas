package az.librarian.library_zerda.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookResponseDTOEntity {

    private String name;

    private String publishDate;

    private String author;

    private String pageCount;

}
