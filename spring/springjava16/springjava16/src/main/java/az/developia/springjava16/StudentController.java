package az.developia.springjava16;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/student-controller")
public class StudentController {

    @GetMapping("/search")
    public List<StudentList> searchStudents(
            @RequestParam(name = "sorgu", required = false, defaultValue = "zerda")
            String sorgu) {
        List<StudentList> students = List.of(
                new StudentList("zerda", "selim"),
                new StudentList("Rahibe", "selim"),
                new StudentList("sahib", "selimov"),
                new StudentList("mehriban", "selimova"),
                new StudentList("fegan", "meherremli"),
                new StudentList("guler", "huseynova"),
                new StudentList("deniz", "kerimova"),
                new StudentList("zemine", "kerimova"),
                new StudentList("ceylin", "kerimova"),
                new StudentList("liana", "kerimova")
        );

        return students.stream()
                .filter(s -> s.getName().contains(sorgu))
                .collect(Collectors.toList());
    }
}
