package az.librarian.library_zerda.service;

import az.librarian.library_zerda.request.BookAddRequestDTO;
import az.librarian.library_zerda.response.BookListResponseDTO;
import az.librarian.library_zerda.response.BookResponseDTO;

public interface BookService {

  void add(BookAddRequestDTO req);

  BookListResponseDTO findAll();

  BookResponseDTO findById(Long id);

  void deleteByid(Long id);



}
