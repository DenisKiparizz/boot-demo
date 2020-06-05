package demo.test.owndenis.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "book_id")
    private Long id;
    @Column(name = "author")
    private String author;
    @Column(name = "book_name")
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(name = "genre")
    private Genre genre;
}
