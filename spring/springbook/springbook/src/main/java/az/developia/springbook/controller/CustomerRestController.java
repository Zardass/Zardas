package az.developia.springbook.controller;

import az.developia.springbook.MessageSender;
import az.developia.springbook.exception.OurException;
import az.developia.springbook.repository.CustomerRepository;
import az.developia.springbook.request.BookAddRequestDTO;
import az.developia.springbook.request.BookUpdateNameRequestDTO;
import az.developia.springbook.request.BookUpdateRequestDTO;
import az.developia.springbook.response.BookListResponseDTO;
import az.developia.springbook.response.BookResponseDTO;
import az.developia.springbook.response.CustomerResponseDTO;
import az.developia.springbook.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerRestController {

    private final CustomerRepository repository;

    @GetMapping(path = "/{id}")
    // /book/20
    public CustomerResponseDTO findById(@PathVariable Long id){

        CustomerResponseDTO resp = new CustomerResponseDTO();
        resp.setCustomer(repository.findById(id).get());
        return resp;

    }

}
