package kodlama.io.carRental.controllers;


import kodlama.io.carRental.business.CarService;
import kodlama.io.carRental.entities.Car;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    private final CarService service;

    public CarsController(CarService service) {
        this.service = service;
    }

    @GetMapping("/getall")
    public List<Car> findAll(){
        return service.findAll();
    }

    @PostMapping("/add")
    public void add(Car car){
        this.service.add(car);
    }

    @PutMapping("/update")
    public void update(Car car,int id){
        this.service.update(car,id);
    }

    @DeleteMapping("delete")
    public void delete(int id){
        this.service.delete(id);
    }
}
