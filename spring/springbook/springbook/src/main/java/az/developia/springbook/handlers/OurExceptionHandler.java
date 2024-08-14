package az.developia.springbook.handlers;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.validation.BindingResultUtils.getBindingResult;

@RestControllerAdvice
public class OurExceptionHandler {

    @ExceptionHandler
    public ErrorResponse handleException(OurException exc) {
        ErrorResponse response = new ErrorResponse();
        response.setMessage(exc.getMessage());
        BindingResult bindingResult = exc.getBindingResult();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        List<MyFieldError> errors = new ArrayList<MyFieldError>();

        for (FieldError e :fieldErrors){
            MyFieldError error = new MyFieldError();
            error.setField((e.getField()));
            error.setMessage(e.getDefaultMessage());
            errors.add(error);
        }
        response.setFieldErrors(errors);
        return response;
    }


}
