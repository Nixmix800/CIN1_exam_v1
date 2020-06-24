package at.technikumwien;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "t_car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private CarType carType;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 50)
    private String manufacturer;

    @Column(nullable = false, length = 25)
    private String driveType;

    @Column(nullable = true)
    private int cylinderNum;

    @Column(nullable = false)
    private boolean jamesMayApproved;

    public Car(CarType carType, String name, String manufacturer, String driveType, int cylinderNum, boolean jamesMayApproved) {
        this(null, carType, name, manufacturer, driveType, cylinderNum, jamesMayApproved);
    }
}
