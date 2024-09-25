package az.librarian.library_zerda.service;

import az.librarian.library_zerda.request.BookAddRequestDto;
import az.librarian.library_zerda.response.BookListResponseDto;

import java.awt.print.Book;
import java.util.List;

public interface BookService {
    void add(BookAddRequestDto req);

    BookListResponseDto findAll();
    }
