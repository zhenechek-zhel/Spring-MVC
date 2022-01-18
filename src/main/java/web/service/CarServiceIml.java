package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceIml implements CarService{

    private CarDAO carDAO;

    public CarServiceIml(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> countCar(Integer count) {
        return carDAO.countCar(count);
    }

    @Override
    public List<Car> carList() {
        return carDAO.carList();
    }
}
