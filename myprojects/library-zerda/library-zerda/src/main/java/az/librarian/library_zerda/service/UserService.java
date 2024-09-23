package az.librarian.library_zerda.service;

import az.librarian.library_zerda.request.BookAddRequestDto;
import az.librarian.library_zerda.request.UserAddRequestDto;

public interface UserService {
    void add(UserAddRequestDto req);
    void addBookToUser(Long userId, Long bookId);
}
