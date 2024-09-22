package az.librarian.library_zerda.request;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

public class BookAddRequestDto {
    @NotNull(message = "name is essential")
    @NotBlank(message = "name cannot be blank")
    private String name;

    private Double price;

    @Min(value = 1,message = "The minimum number of pages can be 1")
    private Integer pageCount;

    @NotBlank(message = "author's name cannot be left blank")
    private String author;

    private LocalDate publishDate;
}
