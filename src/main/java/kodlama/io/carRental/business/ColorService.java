package kodlama.io.carRental.business;

import kodlama.io.carRental.dataAccess.ColorRepository;
import kodlama.io.carRental.entities.Brand;
import kodlama.io.carRental.entities.Color;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorService {

    private ColorRepository repository;

    public ColorService(ColorRepository repository) {
        this.repository = repository;
    }

    public List<Color> findAll(){
        return this.repository.findAll();
    }

    public void add(Color color){
        this.repository.save(color);
    }

    public void update(Color color, int id){
        this.repository.save(color);
    }

    public void delete(int id){
        this.repository.deleteById(id);
    }
}
