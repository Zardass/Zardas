package az.developia.springbook.handlers;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ErrorResponse {
    private String message;
    private LocalDateTime timeStamp;
    private int status;
    private String internalMessage;
    private List<MyFieldError> fieldErrors;
}


