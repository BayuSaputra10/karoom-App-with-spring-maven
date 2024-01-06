package karoomaplikasibookingruangan.karoomapp.entity;

import jakarta.persistence.*;
import karoomaplikasibookingruangan.karoomapp.constant.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String Id;


    private String name;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole userRole;

}
