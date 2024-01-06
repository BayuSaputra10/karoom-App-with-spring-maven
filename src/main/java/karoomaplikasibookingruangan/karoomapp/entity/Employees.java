package karoomaplikasibookingruangan.karoomapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String Id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String division;
    private String position;
    private String contact;
}
