package az.librarian.library_zerda.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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

    // Kitablarla əlaqəni göstərmək üçün Many-to-Many əlaqə
    @ManyToMany
    @JoinTable(
            name = "student_books",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private List<BookEntity> borrowedBooks; // Tələbənin aldığı kitablar

}
