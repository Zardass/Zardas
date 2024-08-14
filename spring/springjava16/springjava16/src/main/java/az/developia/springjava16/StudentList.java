package az.developia.springjava16;


import org.springframework.boot.autoconfigure.domain.EntityScan;


public class StudentList {


    private String name;
    private String surname;

    public StudentList(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


}
