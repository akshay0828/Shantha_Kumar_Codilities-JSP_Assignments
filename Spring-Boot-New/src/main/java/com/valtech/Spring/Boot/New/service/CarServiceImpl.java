package com.valtech.Spring.Boot.New.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.Spring.Boot.New.entity.Car;
import com.valtech.Spring.Boot.New.repo.CarRepository;
@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class CarServiceImpl implements CarService {
	@Autowired
	private CarRepository carRepository;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Car save(Car car){
		return carRepository.save(car);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Car update(Car car){
		return carRepository.save(car);
	}
	
	@Override
	public Car getCar(int id){
		return carRepository.getReferenceById(id);
	}
	@Override
	public List<Car> getAllCars(){
		return carRepository.findAll();
	}
}
