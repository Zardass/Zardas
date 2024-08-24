package az.developia.springbook.request;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BookUpdateNameRequestDTO {

    @NotNull
    @Min(value = 1,message = "id minimum 1 ola biler")
    private Long id;

    @NotNull(message = "ad mutleqdir")
    @NotBlank(message = "adi bos qoymaq olmaz")
    @Size(min = 2,max = 30,message = "kitab adi min 2 max 30 ola biler")
    private String name;


}
