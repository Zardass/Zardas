package az.developia.springbook.request;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class BookAddRequestDTO {

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
