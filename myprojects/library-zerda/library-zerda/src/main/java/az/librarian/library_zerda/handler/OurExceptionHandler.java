package az.librarian.library_zerda.handler;



import az.librarian.library_zerda.exception.OurException;
import az.librarian.library_zerda.models.MyFieldError;
import az.librarian.library_zerda.response.ErrorResponse;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class OurExceptionHandler {

    @ExceptionHandler
    public ErrorResponse handleException(OurException exc) {
        ErrorResponse resp = new ErrorResponse();
        resp.setMessage(exc.getMessage());
        BindingResult br = exc.getBindingResult();
        List<FieldError> fieldErrors = br.getFieldErrors();
        List<MyFieldError> errors = new ArrayList<MyFieldError>();
        for (FieldError e : fieldErrors) {
            MyFieldError er = new MyFieldError();
            er.setField(e.getField());
            er.setMessage(e.getDefaultMessage());
            errors.add(er);
        }
        resp.setFieldErrors(errors);
        return resp;
    }
    }


