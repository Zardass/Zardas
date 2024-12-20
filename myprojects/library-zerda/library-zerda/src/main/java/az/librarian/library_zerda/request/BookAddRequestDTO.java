package az.librarian.library_zerda.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Data
public class BookAddRequestDTO {

    @NotNull(message = "ad mutleqdir")
    @NotBlank(message = "adi bos qoymaq olmaz")
    private String name;

    @NotNull
    @NotBlank(message = "muellifi bos qoymaq olmaz")
    private String author;

    @Min(value = 3,message = "segife sayi minimum 1 ola biler")
    private Integer pageCount;

    private Double price;
}
