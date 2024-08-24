package az.developia.springbook.exception;

import lombok.Data;
import org.springframework.validation.BindingResult;

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

