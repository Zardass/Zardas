package az.librarian.library_zerda.service;

import az.librarian.library_zerda.request.BookAddRequestDto;

public interface BookService {
    void add(BookAddRequestDto req);
}
