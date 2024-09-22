package az.librarian.library_zerda.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfiguration {

    @Bean
    public ModelMapper mapper(){
        ModelMapper mapper = new ModelMapper();
        return mapper;

    }

}
