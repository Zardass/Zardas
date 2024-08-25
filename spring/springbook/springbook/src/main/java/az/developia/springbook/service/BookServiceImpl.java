package az.developia.springbook.service;

import az.developia.springbook.entity.BookEntity;
import az.developia.springbook.exception.OurException;
import az.developia.springbook.repository.BookRepository;
import az.developia.springbook.request.BookAddRequestDTO;
import az.developia.springbook.request.BookUpdateNameRequestDTO;
import az.developia.springbook.request.BookUpdateRequestDTO;
import az.developia.springbook.response.BookListResponseDTO;
import az.developia.springbook.response.BookResponseDTO;

import az.developia.springbook.response.BookResponseDTOEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        List<BookEntity> entities = repository.findAll();
        BookListResponseDTO dto = new BookListResponseDTO();
        List<BookResponseDTOEntity> dtoEntities = new ArrayList<>();
        for (BookEntity en : entities) {
            BookResponseDTOEntity dt = new BookResponseDTOEntity();
            mapper.map(en, dt);
            dtoEntities.add(dt);
        }
        dto.setBooks(dtoEntities);
        return dto;
    }


    @Override
        public BookResponseDTO findById (Long id){
            BookEntity entity = repository.findById(id).orElseThrow(() -> new OurException("kitab tapilmadib", "", null));
            BookResponseDTO dto = new BookResponseDTO();
            mapper.map(entity, dto);
            return dto;
        }


    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
    @Override
    public void update(BookUpdateRequestDTO req) {

       Long id = req.getId();
        BookEntity entity = repository.findById(id).orElseThrow(()->new OurException("kitab tapilmadib","",null));
        mapper.map(req,entity);
        repository.save(entity);
    }

    @Override
    public void updateName(BookUpdateNameRequestDTO req) {
        Long id = req.getId();
        BookEntity entity = repository.findById(id).orElseThrow(()->new OurException("kitab tapilmadib","",null));
        mapper.map(req,entity);
        repository.save(entity);
    }

    @Override
    public BookListResponseDTO findAllPagination(Integer begin, Integer length) {
        List<BookEntity> entities = repository.findAllPagination(begin,length);
        BookListResponseDTO dto = new BookListResponseDTO();
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
