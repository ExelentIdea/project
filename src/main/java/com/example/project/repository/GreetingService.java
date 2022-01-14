package com.example.project.repository;


import com.example.project.domain.Machines;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private final CarsRepo carsRepo;

    public GreetingService(CarsRepo carsRepo) {
        this.carsRepo = carsRepo;
    }

    public String greet() {
        Machines cars = carsRepo.findById(1).get();
        System.out.println(cars);
        return cars.getTag() + " " + cars.getText();

    }
}