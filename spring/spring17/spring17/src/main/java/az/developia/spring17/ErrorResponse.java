package az.developia.spring17;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class ErrorResponse {
    private  String message;
    private LocalDateTime timeStamp;
    private int status;
    private String internalMessage;
}
