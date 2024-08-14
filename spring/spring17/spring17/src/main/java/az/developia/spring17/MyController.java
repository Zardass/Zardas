package az.developia.spring17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/my-controller")
public class MyController {

    @Autowired
    CarRepo carRepo;

    @GetMapping("/saved/car/{id}")
    public Car savedCars(@PathVariable Long id){
        Car c = new Car("changan",9999,LocalDate.now());
        c.setId(id);
        carRepo.save(c);
        Optional <Car> result = carRepo.findById(id);
        if(result.isPresent()){
            return result.get();
        }else{
            throw new OurException("masin tapilmadi id = " + id,"car not found",222,LocalDateTime.now());
        }
    }

    @ExceptionHandler
    public ErrorResponse handleOurException(OurException exc){
        ErrorResponse resp = new ErrorResponse();
        resp.setMessage(exc.getMessage());
        resp.setInternalMessage(exc.getInternalMessage());
        resp.setStatus(exc.getStatus());
        return resp;
    }

    @GetMapping("/search")
    public List<Car> search(@RequestParam(name = "a")String a){
        List<Car> cars = carRepo.findSearch(a);
       // List<Car> carss = carRepo.findAllByName(a);
        return cars;
    }
}
