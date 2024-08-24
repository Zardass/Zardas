package az.developia.springbook.controller;

import az.developia.springbook.exception.OurException;
import az.developia.springbook.request.BookAddRequestDTO;
import az.developia.springbook.request.BookUpdateNameRequestDTO;
import az.developia.springbook.request.BookUpdateRequestDTO;
import az.developia.springbook.response.BookListResponseDTO;
import az.developia.springbook.response.BookResponseDTO;
import az.developia.springbook.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookRestController {

    /*dependency injection altsinfinin
    (interfacein obyektini yaratmaq olmaz)
     axtarib (tapsa) onun obyektini service referensine qosacaq
     private final BookServiceIMpl service; yaza bilerdik
     amma ne vaxtsa deyisikllik etmek istesek duzgun olmur
     restcontrolleri de deyismek lazim gelir ona gore service yazulir
     */
    private final BookService service;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    //frontdan json gelecek jackson gotyrecek
    //bookadd obyekt yaradacq
    //requestbody ni yazmaliyiq ki jackson islrsin
    public void add(@Valid @RequestBody BookAddRequestDTO req,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new OurException("melumat duzgun qeyd olunmayib","",bindingResult);
        }

        service.add(req);
    }

    @PutMapping
    @ResponseStatus(code = HttpStatus.OK)
    public void update(@Valid @RequestBody BookUpdateRequestDTO req, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new OurException("melumat duzgun qeyd olunmayib","",bindingResult);
        }

        service.update(req);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    // /book/20
    public void delete(@PathVariable Long id){

        service.deleteById(id);
    }

    @GetMapping(path = "/{id}")
    // /book/20
    public BookResponseDTO findById(@PathVariable Long id){

       return service.findById(id);
    }
    @GetMapping()
  // /book
    public BookListResponseDTO findAll(){

        return service.findAll();
    }
    @PatchMapping
    public void updateName(@Valid @RequestBody BookUpdateNameRequestDTO req, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new OurException("melumat duzgun qeyd olunmayib","",bindingResult);
        }

        service.updateName(req);
    }

}
