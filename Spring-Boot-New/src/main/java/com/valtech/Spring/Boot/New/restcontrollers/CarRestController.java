package com.valtech.Spring.Boot.New.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.Spring.Boot.New.entity.Car;
import com.valtech.Spring.Boot.New.service.CarService;

@RestController
public class CarRestController {
	@Autowired
 private CarService carService;
	
	@PostMapping("/api/car")
	public Car save(@RequestBody Car car){
		return carService.save(car);
	}
	
	@GetMapping("/api/car")
	public List<Car> getCars(){
		return carService.getAllCars();
	}
 
	@GetMapping("/api/car/{id}")
 public Car getCar(@PathVariable("id") int id){
		Car car=carService.getCar(id);
		
		return car;
//	 return carService.getCar(id);
 }
	
	@PutMapping("/api/car/{id}")
    public Car updateCar(@PathVariable("id")int id, @RequestBody Car car){
//        car.getId()==id
        car.setId(id);
        return carService.update(car);
    }
	
}
