package kodlama.io.carRental.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Table(name="car")
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="car_name")
    private String carName;

    @Column(name="model_year")
    private String modelYear;

    @Column(name="daily_price")
    private double dailyPrice;

    @Column(name="description")
    private String description;

    @ManyToOne()
    @JoinColumn(name="color_id")
    private Color color;

    @ManyToOne()
    @JoinColumn(name="brand_id")
    private Brand brand;
}

