package az.librarian.library_zerda.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BookAddRequestDto {

    private String name;

    private String publishDate;

    private String author;

    private String pageCount;
}
