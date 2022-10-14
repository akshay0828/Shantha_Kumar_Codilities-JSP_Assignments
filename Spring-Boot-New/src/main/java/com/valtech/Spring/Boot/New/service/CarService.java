package com.valtech.Spring.Boot.New.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.Spring.Boot.New.entity.Car;

public interface CarService {

	Car save(Car car);

	Car update(Car car);

	Car getCar(int id);

	List<Car> getAllCars();

}