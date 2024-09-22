package az.librarian.library_zerda.controller;

import az.librarian.library_zerda.exception.OurException;
import az.librarian.library_zerda.request.BookAddRequestDto;
import az.librarian.library_zerda.request.UserAddRequestDto;
import az.librarian.library_zerda.service.BookService;
import az.librarian.library_zerda.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserRestController {

        private final UserService service;

        @PostMapping
        public void add(@Valid @RequestBody UserAddRequestDto req, BindingResult bindingResult){
            if (bindingResult.hasErrors()){
                throw new OurException("Validation failed", "Invalid input data",bindingResult);
            }
            service.add(req);
        }
    }
