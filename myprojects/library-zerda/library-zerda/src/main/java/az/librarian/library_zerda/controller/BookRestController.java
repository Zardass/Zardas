package az.librarian.library_zerda.controller;

import az.librarian.library_zerda.request.BookAddRequestDTO;
import az.librarian.library_zerda.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookRestController {

    private final BookService bookService;

    @PostMapping
    public void add(@RequestBody BookAddRequestDTO req){
        bookService.add(req);
    }

}
