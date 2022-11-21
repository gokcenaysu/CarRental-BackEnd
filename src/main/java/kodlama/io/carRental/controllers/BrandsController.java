package kodlama.io.carRental.controllers;

import kodlama.io.carRental.business.BrandService;
import kodlama.io.carRental.entities.Brand;
import kodlama.io.carRental.entities.Car;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {

    private final BrandService service;


    public BrandsController(BrandService service) {
        this.service = service;
    }

    @GetMapping("/getall")
    public List<Brand> findAll(){
        return service.findAll();
    }

    @PostMapping("/add")
    public void add(Brand brand){
        this.service.add(brand);
    }

    @PutMapping("/update")
    public void update(Brand brand,int id){
        this.service.update(brand,id);
    }

    @DeleteMapping("delete")
    public void delete(int id){
        this.service.delete(id);
    }
}
