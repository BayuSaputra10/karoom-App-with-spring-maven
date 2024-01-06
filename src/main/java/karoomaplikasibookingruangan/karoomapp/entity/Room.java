package karoomaplikasibookingruangan.karoomapp.entity;

import jakarta.persistence.*;
import karoomaplikasibookingruangan.karoomapp.constant.StatusAvailable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Room {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String Id;
    private String type;
    private int capacity;
    private String facilities;

    @Enumerated(EnumType.STRING)
    private StatusAvailable availabilityStatus;
}
