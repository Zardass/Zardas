package az.librarian.library_zerda.controller;

import az.librarian.library_zerda.exception.OurException;
import az.librarian.library_zerda.request.BookAddRequestDTO;
import az.librarian.library_zerda.request.BookUpdateRequestDTO;
import az.librarian.library_zerda.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookRestController {

    private final BookService bookService;

    @PostMapping
    public void add(@Valid @RequestBody BookAddRequestDTO req, BindingResult br){
        if(br.hasErrors()){
            throw new OurException("melumatlarin tamligi pozulub","",br);
        }
        bookService.add(req);
    }

    @PutMapping
    public void update(@Valid @RequestBody BookUpdateRequestDTO req, BindingResult br){
        if(br.hasErrors()){
            throw new OurException("melumatlarin tamligi pozulub","",br);
        }
        bookService.update(req);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id){
        bookService.deleteByid(id);
    }
}
