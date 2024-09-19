package az.developia.springbook.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "menus")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class MenuEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String lang;

    private String keyColumn;


    private String valueColumn;








}
