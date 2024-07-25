package az.developia.springjava16;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfig {

    @Bean
    @Primary
    public Student myStudent(){
        Student s = new Student();
        s.setAge(21);
        s.setName("sahib");
        return s;
    }
    @Bean
    @Primary
    public Computer myComputer(){
        Computer s = new Computer();
        s.setPrice(213);
        s.setBrand("hp");
        return s;
    }
}
