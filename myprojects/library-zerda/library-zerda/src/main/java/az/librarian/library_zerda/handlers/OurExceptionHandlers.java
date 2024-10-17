package az.librarian.library_zerda.handlers;

import az.librarian.library_zerda.exception.MyFieldError;
import az.librarian.library_zerda.exception.OurException;
import az.librarian.library_zerda.response.ErrorResponse;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class OurExceptionHandlers {

    @ExceptionHandler
    public ErrorResponse handleException(OurException exc) {
       ErrorResponse resp = new ErrorResponse();
       resp.setMessage((exc.getMessage()));
        BindingResult br = exc.getBr();
        List<FieldError> fieldErrors = br.getFieldErrors();
        List<MyFieldError> errors = new ArrayList<MyFieldError>();
        for (FieldError e: fieldErrors){
            MyFieldError error = new MyFieldError();
            error.setField(e.getField());
            error.setMessage(e.getDefaultMessage());
            errors.add(error);
        }
        resp.setFieldErrors(errors);
        return resp;
    }


}
