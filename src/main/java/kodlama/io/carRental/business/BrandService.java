package kodlama.io.carRental.business;

import kodlama.io.carRental.dataAccess.BrandRepository;
import kodlama.io.carRental.entities.Brand;
import kodlama.io.carRental.entities.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {

    private BrandRepository repository;

    public BrandService(BrandRepository repository) {
        this.repository = repository;
    }

    public List<Brand> findAll(){
        return this.repository.findAll();
    }

    public void add(Brand brand){
        this.repository.save(brand);
    }

    public void update(Brand brand, int id){
        this.repository.save(brand);
    }

    public void delete(int id){
        this.repository.deleteById(id);
    }
}
