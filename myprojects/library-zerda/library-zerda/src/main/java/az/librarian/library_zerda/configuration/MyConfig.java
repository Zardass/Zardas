package az.librarian.library_zerda.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;

@Configuration
public class MyConfig {

    @Bean
    public ModelMapper mapper(){
        ModelMapper m = new ModelMapper();
        return m;
    }


}
