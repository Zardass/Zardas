package az.librarian.library_zerda.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "books")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String publishDate;

    private String author;

    private String pageCount;

    @ManyToMany(mappedBy = "books")
    private Set<UserEntity> users;
}
