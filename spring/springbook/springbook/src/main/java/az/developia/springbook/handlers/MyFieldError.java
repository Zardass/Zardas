package az.developia.springbook.handlers;

import lombok.Data;

@Data
public class MyFieldError {
    private String field;
    private String message;
}
