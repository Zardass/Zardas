package az.developia.springbook.service;

import az.developia.springbook.entity.BookEntity;
import az.developia.springbook.repository.BookRepository;
import az.developia.springbook.request.BookAddRequestDTO;
import az.developia.springbook.response.BookListResponseDTO;
import az.developia.springbook.response.BookResponseDTO;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {


    private final BookRepository repository;

    @Override
    public void add(BookAddRequestDTO req) {
        BookEntity entity = new BookEntity();
        entity.setName(req.getName());
        entity.setPrice(req.getPrice());
        entity.setPageCount(req.getPageCount());
        entity.setAuthor(req.getAuthor());
        repository.save(entity);
    }

    @Override
    public BookListResponseDTO findAll() {
        return null;
    }

    @Override
    public BookResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
