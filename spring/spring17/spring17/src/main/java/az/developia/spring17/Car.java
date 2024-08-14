package az.developia.spring17;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String brand;
    private int price;
    private LocalDate registerDate;

    public Car(){

    }
    public Car(String brand,int price,LocalDate registerDate) {
        this.price = price;
        this.brand = brand;
        this.registerDate = registerDate;

    }
}
