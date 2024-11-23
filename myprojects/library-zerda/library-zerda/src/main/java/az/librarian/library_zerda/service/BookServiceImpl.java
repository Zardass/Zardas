package az.librarian.library_zerda.service;

import az.librarian.library_zerda.entity.BookEntity;
import az.librarian.library_zerda.exception.OurException;
import az.librarian.library_zerda.repository.BookRepository;
import az.librarian.library_zerda.request.BookAddRequestDTO;
import az.librarian.library_zerda.request.BookUpdateRequestDTO;
import az.librarian.library_zerda.response.BookListResponseDTO;
import az.librarian.library_zerda.response.BookResponseDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository repository;

    private final ModelMapper mapper;

    @Override
    public void add(BookAddRequestDTO req) {
        BookEntity entity = new BookEntity();
        mapper.map(req,entity);
        repository.save(entity);

    }

    @Override
    public BookListResponseDTO findAll() {
        return null;
    }

    @Override
    public BookResponseDTO findById(Long id) {
        BookEntity entity = repository.findById(id).orElseThrow(()->new OurException("kitab tapilmadi","",null));
        BookResponseDTO dto = new BookResponseDTO();
        mapper.map(entity,dto);
        return dto;
    }

    @Override
    public void deleteByid(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(BookUpdateRequestDTO req) {
        Long id = req.getId();
        BookEntity entity = repository.findById(id).orElseThrow(()->new OurException("kitab tapilmadi","",null));
        mapper.map(req,entity);
        repository.save(entity);

    }
}
