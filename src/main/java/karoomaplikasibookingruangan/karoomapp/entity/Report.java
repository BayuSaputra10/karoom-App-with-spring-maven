package karoomaplikasibookingruangan.karoomapp.entity;

import jakarta.persistence.*;
import karoomaplikasibookingruangan.karoomapp.constant.ReportType;
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
public class Report {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String Id;
    private Date date;

    @Enumerated(EnumType.STRING)
    private ReportType reportType;

}
