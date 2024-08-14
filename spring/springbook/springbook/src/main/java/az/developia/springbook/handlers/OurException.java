package az.developia.springbook.handlers;

import lombok.Data;
import org.springframework.validation.BindingResult;

import java.time.LocalDateTime;

@Data
public class OurException extends RuntimeException {

    private String internalMessage;
    private BindingResult bindingResult;

    public OurException(String message, String internalMessage, BindingResult bindingResult) {
        super(message);
        this.internalMessage = internalMessage;
        this.bindingResult = bindingResult;
    }

}

