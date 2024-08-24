package az.developia.springbook.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public ModelMapper mapper(){
        ModelMapper mapper = new ModelMapper();
        return mapper;
    }
}
