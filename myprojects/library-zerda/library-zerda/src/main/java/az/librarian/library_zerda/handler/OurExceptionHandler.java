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
        ErrorResponse response = new ErrorResponse();
        response.setMessage(exc.getMessage());
        response.setInternalMessage(exc.getInternalMessage());
        response.setTimeStamp(LocalDateTime.now());

       
        BindingResult bindingResult = exc.getBindingResult();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        List<MyFieldError> errors = new ArrayList<>();

        for (FieldError e : fieldErrors) {
            MyFieldError error = new MyFieldError();
            error.setField(e.getField());
            error.setMessage(e.getDefaultMessage());
            errors.add(error);
        }

        response.setFieldErrors(errors);
        return response;
    }

    }


