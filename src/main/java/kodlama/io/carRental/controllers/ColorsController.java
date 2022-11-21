package kodlama.io.carRental.controllers;

import kodlama.io.carRental.business.ColorService;
import kodlama.io.carRental.entities.Car;
import kodlama.io.carRental.entities.Color;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colors")
public class ColorsController {

    private final ColorService service;

    public ColorsController(ColorService service) {
        this.service = service;
    }

    @GetMapping("/getall")
    public List<Color> findAll(){
        return service.findAll();
    }

    @PostMapping("/add")
    public void add(Color color){
        this.service.add(color);
    }

    @PutMapping("/update")
    public void update(Color color,int id){
        this.service.update(color,id);
    }

    @DeleteMapping("delete")
    public void delete(int id){
        this.service.delete(id);
    }
}
