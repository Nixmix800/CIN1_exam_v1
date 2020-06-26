package at.technikumwien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Configuration
//we use this initializer for both, test and normal use
public class DBInitializer {
    @Autowired
    private CarRepository carRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void handleApplicationEvent() {
        carRepository.saveAll(
                List.of(
                        new Car("Mazda", "3 BL", 2011),
                        new Car("Aston Martin", "DB7", 1998)
                )
        );
    }
}
