package az.librarian.library_zerda.exception;

import lombok.Data;
import org.springframework.validation.BindingResult;

@Data
public class OurException extends RuntimeException{

    private String internalMessage;
    private BindingResult br;

    public OurException(String message, String internalMessage, BindingResult br){
        super(message);
        this.internalMessage=internalMessage;
        this.br = br;
    }
}