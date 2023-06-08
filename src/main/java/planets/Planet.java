package planets;

import jakarta.persistence.*;
import lombok.Data;
import tickets.Ticket;

import java.util.List;

@Entity
@Data
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private String id;
    @Column(name = "name", length = 500, nullable = false)
    private String name;
    @OneToMany(mappedBy = "fromPlanetId", cascade = CascadeType.ALL)
    private List<Ticket> departureTickets;

    @OneToMany(mappedBy = "toPlanetId", cascade = CascadeType.ALL)
    private List<Ticket> arrivalTickets;
}
