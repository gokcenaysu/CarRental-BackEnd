package kodlama.io.carRental.business;

import kodlama.io.carRental.dataAccess.CarRepository;
import kodlama.io.carRental.entities.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public List<Car> findAll(){
        return this.repository.findAll();
    }

    public void add(Car car){
        this.repository.save(car);
    }

    public void update(Car car, int id){
        this.repository.save(car);
    }

    public void delete(int id){
        this.repository.deleteById(id);
    }
}
