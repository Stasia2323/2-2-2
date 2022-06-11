package web.servise;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiseImpl implements CarServise {

    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("black", "Kia", 1010));
        carList.add(new Car("pink", "BMW", 2020));
        carList.add(new Car("black", "Lada", 3030));
        carList.add(new Car("pink", "Mazda", 4040));
        carList.add(new Car("black", "Toyota", 5050));
    }


    @Override
    public List<Car> list(Integer number) {
        if (number == null || number >= carList.size()) {
            return carList;
        } else if (number > 0 && number < carList.size()) {
            return new ArrayList<>(carList.subList(0, number));
        }
        return null;
    }





}
