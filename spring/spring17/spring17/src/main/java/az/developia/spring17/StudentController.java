package az.developia.spring17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/student-controller")
public class StudentController {

    @Autowired
    private StudentRepo repo;

    @GetMapping("/search")
    public List<Student> searchStudents(
            @RequestParam(name = "sorgu", required = false, defaultValue = "zerda")
            String sorgu) {
        List<Student> students = List.of(
                new Student("zerda", "selim"),
                new Student("Rahibe", "selim"),
                new Student("sahib", "selimov"),
                new Student("mehriban", "selimova"),
                new Student("fegan", "meherremli"),
                new Student("guler", "huseynova"),
                new Student("deniz", "kerimovaaaa"),
                new Student("zemine", "kerimovaaaa"),
                new Student("ceylin", "kerimova"),
                new Student("liana", "keriaaamova")
        );

        return students.stream()
                .filter(s -> s.getName().contains(sorgu))
                .collect(Collectors.toList());
    }

    @GetMapping("/save/{id}")
    public Student savedStudent(@PathVariable Long id) {
        Student student = new Student("Fegane", "meherremli");
        student.setId(6L);
        repo.save(student);
        Optional <Student> result = repo.findById(id);
        if(result.isPresent()){
            return result.get();
        }else{
            throw new OurException("telebe tapilmadi teessuf ki id = "+ id,"student not found");
        }
    }

    @ExceptionHandler
    public ErrorResponse handleOurException(OurException exc) {
        ErrorResponse resp = new ErrorResponse();
        resp.setMessage(exc.getMessage());
        resp.setInternalMessage(exc.getInternalMessage());
        return resp;
    }

    @GetMapping("/home")
    public List<Student> search(@RequestParam(name = "q")String q){
        List<Student> students =  repo.findSearch(q);
   //    List<Student> students =  repo.findSearch("Fegan");
       return students;
    }

}


