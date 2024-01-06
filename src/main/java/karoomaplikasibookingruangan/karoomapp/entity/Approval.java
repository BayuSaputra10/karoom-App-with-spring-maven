package karoomaplikasibookingruangan.karoomapp.entity;

import jakarta.persistence.*;
import karoomaplikasibookingruangan.karoomapp.constant.ApprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Approval {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String Id;

    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking bookingRequest;

    @Enumerated(EnumType.STRING)
    private ApprovalStatus gaApproval;

    private String reason;
}
