package az.developia.springbook.service;

import az.developia.springbook.request.BookAddRequestDTO;
import az.developia.springbook.request.BookUpdateNameRequestDTO;
import az.developia.springbook.request.BookUpdateRequestDTO;
import az.developia.springbook.response.BookListResponseDTO;
import az.developia.springbook.response.BookResponseDTO;

public interface BookService {

    void add(BookAddRequestDTO req);

    BookListResponseDTO findAll();//1den cox

    BookResponseDTO findById(Long id);

    void deleteById(Long id);

    void update(BookUpdateRequestDTO req);

    void updateName(BookUpdateNameRequestDTO req);


}
