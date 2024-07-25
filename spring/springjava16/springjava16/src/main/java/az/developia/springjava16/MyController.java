package az.developia.springjava16;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("my-controller")
public class MyController {

    @Autowired
    private CarRepo repo;


    @GetMapping("/save")
    public void savedCars(){

        Car car = new Car("porsche", 22222, LocalDate.now());
        repo.save(car);
    }

}





