package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOIml implements CarDAO{

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("AUDI", "Germany", 1));
        cars.add(new Car("Nissan", "Japan", 2));
        cars.add(new Car("BMW", "Germany", 3));
        cars.add(new Car("LADA", "Russia", 4));
        cars.add(new Car("Suzuki", "Japan", 5));

    }

    @Override
    public List<Car> countCar(int count) {
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }

    @Override
    public List<Car> carList() {
        return cars;
    }
}
