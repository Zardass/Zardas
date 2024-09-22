package az.librarian.library_zerda.models;

import lombok.Data;

    @Data
    public class MyFieldError {
        private String field;
        private String message;
    }