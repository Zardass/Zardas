package az.librarian.library_zerda.service;

import az.librarian.library_zerda.entity.BookEntity;
import az.librarian.library_zerda.entity.UserEntity;
import az.librarian.library_zerda.exception.OurException;
import az.librarian.library_zerda.repository.BookRepository;
import az.librarian.library_zerda.repository.UserRepository;
import az.librarian.library_zerda.request.UserAddRequestDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    private final BookRepository bookRepository;
    private final ModelMapper mapper;

    @Override
    public void add(UserAddRequestDto req) {
        UserEntity entity = new UserEntity();
        mapper.map(req,entity);
        userRepository.save(entity);
    }

    @Override
    public void addBookToUser(Long userId, Long bookId) {
        UserEntity user = userRepository.findById(userId).orElseThrow(() ->
                new OurException("User not found", "Failed to find user with ID " + userId, null));

        BookEntity book = bookRepository.findById(bookId).orElseThrow(() ->
             new OurException("Book not found", "Failed to find book with ID " + bookId, null));

     //   user.getBooks().add(book);
        userRepository.save(user);
    }
    }

