package az.developia.springbook.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BookUpdateRequestDTO {

    @NotNull
    @Min(value = 1,message = "id minimum 1 ola biler")
    private Long id;

    @NotNull(message = "ad mutleqdir")
    @NotBlank(message = "adi bos qoymaq olmaz")
    @Size(min = 2,max = 30,message = "kitab adi min 2 max 30 ola biler")
    private String name;


    private Double price;

    @Min(value = 1,message = "sehife sayi min 1 ola biler")
    private Integer pageCount;

    @NotBlank(message = "muellifi bos qoymaq olmaz")
    @Pattern(regexp = "[a-z]{3}",message = "muellif adi mutleq 3 simvol olmailidir")
    private String author;

    @Past
    private LocalDate publishDate;

}
