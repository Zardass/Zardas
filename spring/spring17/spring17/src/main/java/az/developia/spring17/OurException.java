package az.developia.spring17;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OurException extends RuntimeException {

    private String internalMessage;
    private int status;
    private LocalDateTime timeStamp;

    public OurException(String message, String internalMessage) {
        super(message);
        this.internalMessage = internalMessage;
    }

    public OurException(String message, String internalMessage, int status, LocalDateTime timeStamp) {
        super(message);
        this.internalMessage = internalMessage;
        this.status = status;
        this.timeStamp=timeStamp;
    }

}
