package at.technikumwien;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
    //we dont need any special method, so this stays empty
    //I know that we really wouldn't need this but I think it's a lot cleaner
}