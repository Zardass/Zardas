package az.developia.springbook.models;

import lombok.Data;

@Data
public class MyFieldError {
    private String field;
    private String message;
}
