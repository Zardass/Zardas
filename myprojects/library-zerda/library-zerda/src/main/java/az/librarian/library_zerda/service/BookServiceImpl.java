package az.librarian.library_zerda.service;

import az.librarian.library_zerda.entity.BookEntity;
import az.librarian.library_zerda.repository.BookRepository;
import az.librarian.library_zerda.request.BookAddRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository repository;
    private final ModelMapper mapper;

    @Override
    public void add(BookAddRequestDto req) {
        BookEntity entity = new BookEntity();
        mapper.map(req,entity);
        repository.save(entity);

    }
}
