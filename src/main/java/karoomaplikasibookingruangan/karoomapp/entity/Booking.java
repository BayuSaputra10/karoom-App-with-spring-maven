package karoomaplikasibookingruangan.karoomapp.entity;

import jakarta.persistence.*;
import karoomaplikasibookingruangan.karoomapp.constant.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String Id;

    private Date date;
    private String division;
    private String employee;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    private Date schedule;
    @Enumerated(EnumType.STRING)
    private Status status;
    private String note;
}
