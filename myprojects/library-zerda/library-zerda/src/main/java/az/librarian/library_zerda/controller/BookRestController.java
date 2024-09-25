package az.librarian.library_zerda.controller;

import az.librarian.library_zerda.exception.OurException;
import az.librarian.library_zerda.request.BookAddRequestDto;
import az.librarian.library_zerda.response.BookListResponseDto;
import az.librarian.library_zerda.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookRestController {

    private final BookService service;

    @PostMapping
    public void add(@Valid @RequestBody BookAddRequestDto req, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            throw new OurException("Validation failed", "Invalid input data",bindingResult);
        }

        service.add(req);
    }

    @GetMapping
    public BookListResponseDto getAllBooks() {
        return service.findAll();
    }
}

