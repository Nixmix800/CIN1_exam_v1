package at.technikumwien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;

import java.util.List;

@Configuration
@Profile("!test")
public class DBInitializer {
    @Autowired
    private CarRepository carRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void handleApplicationEvent() {
        carRepository.saveAll(
                List.of(
                        new Car(CarType.PKW, "DB7", "Aston Martin", "petrol", 12, true),
                        new Car(CarType.PKW, "3 BL", "Mazda", "diesel", 4, false)
                )
        );
    }
}
