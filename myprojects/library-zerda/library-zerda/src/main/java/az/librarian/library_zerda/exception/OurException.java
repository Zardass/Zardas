package az.librarian.library_zerda.exception;

import lombok.Data;
import lombok.Getter;
import org.springframework.validation.BindingResult;

@Data
@Getter
public class OurException extends RuntimeException{
    private String internalMessage;
    private BindingResult bindingResult;

    public OurException(String message, String internalMessage, BindingResult bindingResult) {
        super(message);
        this.internalMessage = internalMessage;
        this.bindingResult = bindingResult;
    }

}
