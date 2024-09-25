package az.librarian.library_zerda.service;

import az.librarian.library_zerda.entity.BookEntity;
import az.librarian.library_zerda.repository.BookRepository;
import az.librarian.library_zerda.request.BookAddRequestDto;
import az.librarian.library_zerda.response.BookListResponseDto;
import az.librarian.library_zerda.response.BookResponseDTOEntity;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public BookListResponseDto findAll() {
        List<BookEntity> entities = repository.findAll();
        return convertEntitiesToDTOs(entities);

    }

    private  BookListResponseDto convertEntitiesToDTOs( List<BookEntity> entities){
        BookListResponseDto dto = new BookListResponseDto();
        List<BookResponseDTOEntity> dtoEntities = new ArrayList<>();
        for (BookEntity en : entities) {
            BookResponseDTOEntity dt = new BookResponseDTOEntity();
            mapper.map(en, dt);
            dtoEntities.add(dt);
        }
        dto.setBooks(dtoEntities);
        return dto;
}
}
