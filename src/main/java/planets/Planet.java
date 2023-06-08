package planets;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private String id;
    @Column(name = "name")
    private String name;
}
