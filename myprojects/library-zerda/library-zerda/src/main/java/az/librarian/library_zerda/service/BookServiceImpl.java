package az.librarian.library_zerda.service;

import az.librarian.library_zerda.entity.BookEntity;
import az.librarian.library_zerda.repository.BookRepository;
import az.librarian.library_zerda.request.BookAddRequestDTO;
import az.librarian.library_zerda.response.BookListResponseDTO;
import az.librarian.library_zerda.response.BookResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository repository;

    @Override
    public void add(BookAddRequestDTO req) {
        BookEntity entity = new BookEntity();
        entity.setName(req.getName());
        entity.setAuthor(req.getAuthor());
        entity.setPageCount(req.getPageCount());
        entity.setPrice(req.getPrice());
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
    public void deleteByid(Long id) {

    }
}
