package az.librarian.library_zerda.response;

import az.librarian.library_zerda.exception.MyFieldError;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class ErrorResponse {
    private String message;
    private LocalDateTime timestamp;
    private int status;
    private String internalMessage;
    private List<MyFieldError> fieldErrors;

}