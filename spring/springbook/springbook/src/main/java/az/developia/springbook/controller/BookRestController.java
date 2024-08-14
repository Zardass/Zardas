package az.developia.springbook.controller;

import az.developia.springbook.handlers.OurException;
import az.developia.springbook.request.BookAddRequestDTO;
import az.developia.springbook.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    //frontdan json gelecek jackson gotyrecek
    //bookadd obyekt yaradacq
    //requestbody ni yazmaliyiq ki jackson islrsin
    public void add(@Valid @RequestBody BookAddRequestDTO req,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new OurException("melumat duzgun qeyd olunmayib","",bindingResult);
        }

        service.add(req);
    }

}
