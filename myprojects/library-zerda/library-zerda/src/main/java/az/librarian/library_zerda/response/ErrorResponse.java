package az.librarian.library_zerda.response;

import az.librarian.library_zerda.models.MyFieldError;
import lombok.Data;

import java.util.List;

    @Data
    public class ErrorResponse {
        private String message;
        private String internalMessage;
        private List<MyFieldError> fieldErrors;
    }

