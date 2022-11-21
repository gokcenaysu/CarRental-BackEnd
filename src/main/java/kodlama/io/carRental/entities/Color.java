package kodlama.io.carRental.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Table(name="color")
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="color_name")
    private String colorName;

    @JsonIgnore
    @OneToMany(mappedBy = "color")
    private List<Car> cars;
}
