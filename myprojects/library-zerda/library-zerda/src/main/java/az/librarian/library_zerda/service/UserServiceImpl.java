package az.librarian.library_zerda.service;

import az.librarian.library_zerda.entity.BookEntity;
import az.librarian.library_zerda.entity.UserEntity;
import az.librarian.library_zerda.repository.BookRepository;
import az.librarian.library_zerda.repository.UserRepository;
import az.librarian.library_zerda.request.UserAddRequestDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository repository;
    private final ModelMapper mapper;

    @Override
    public void add(UserAddRequestDto req) {
        UserEntity entity = new UserEntity();
        mapper.map(req,entity);
        repository.save(entity);
    }
}
