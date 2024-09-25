package az.librarian.library_zerda.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class BookListResponseDto {
    private List<BookResponseDTOEntity> books;
}
