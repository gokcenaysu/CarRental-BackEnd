package kodlama.io.carRental.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Table(name="brand")
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "brand_name")
    private String brandName;

    @JsonIgnore
    @OneToMany(mappedBy = "brand")
    private List<Car> cars;
}
