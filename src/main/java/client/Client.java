package client;

import jakarta.persistence.*;
import lombok.Data;
import tickets.Ticket;

import java.util.List;

@Table(name = "client")
@Entity
@Data
public class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private long id;
    @Column(name = "name", length = 200, nullable = false)
    private String name;
    @OneToMany(mappedBy = "clientId", cascade = CascadeType.ALL)
    private List<Ticket> tickets;
}
