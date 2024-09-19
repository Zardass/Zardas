package az.developia.springbook.controller;

import az.developia.springbook.entity.MenuEntity;
import az.developia.springbook.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/menus")
@RequiredArgsConstructor

public class MenuRestController {

    private final MenuRepository repository;

    @GetMapping
    public List<MenuEntity> find(@RequestHeader(name = "Accept-language")Locale l){

        String language = l.getLanguage();

       return repository.findAllByLang(language);
    }
}
