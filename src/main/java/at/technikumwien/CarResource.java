package at.technikumwien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//this defines our REST-Service
@RestController
@RequestMapping("/resources/cars")
public class CarResource {
    @Autowired
    private CarRepository carRepository;

    //this returns all entities of our database
    @GetMapping
    public List<Car> retrieveAll() {
        return carRepository.findAll();
    }
}
