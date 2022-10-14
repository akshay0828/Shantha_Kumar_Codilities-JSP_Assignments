package com.valtech.Spring.Boot.New.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.valtech.Spring.Boot.New.entity.Car;
import com.valtech.Spring.Boot.New.service.CarService;


@Controller
public class CarController {
	@Autowired
	private CarService carService;
	
	@PostMapping("/car/updateCar/{id}")
	public ModelAndView saveUpdateCar(@PathVariable("id") int id,@ModelAttribute Car car,@RequestParam("submit") String submit){
		ModelAndView view=new ModelAndView("car/list");
		
		
		if(submit.equals("Cancel")){
			view.addObject("car", carService.getAllCars());
			return view;
		}
		
		
		carService.update(car);
		view.addObject("car", carService.getAllCars());
		return view;
	}
	
	@GetMapping("/car/updateCar/{id}")
	public String updateCar(@PathVariable("id") int id,Model model){
		model.addAttribute("car", carService.getCar(id));
		return "car/updateCar";
	}
	
	@PostMapping("/car/newCar")
	public ModelAndView saveNewCar(@ModelAttribute Car car){
		ModelAndView mvn=new ModelAndView("car/list");
		carService.save(car);
		mvn.getModel().put("car", carService.getAllCars());
		return mvn;
	}
	
	@GetMapping("/car/newCar")
	public String newCar(){
		return "car/newCar";
	}
	
	@GetMapping("/car/list")
	public String list(Model model){
		System.out.println("List of Cars");
		model.addAttribute("car", carService.getAllCars());

		
		return "car/list"; //prefix/cars/listsuffix
	}
}
