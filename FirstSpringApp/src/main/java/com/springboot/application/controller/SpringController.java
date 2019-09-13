package com.springboot.application.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.springboot.application.petshop.Animal;
import com.springboot.application.service.SpringService;

@Controller
@RestController
public class SpringController {
	
	@Autowired
	private SpringService service;
	
	@RequestMapping("")
	public String getHi(){
		return "/animals|||/animals/types|||/animals/types/{type}|||animals/{id}";
	}
	
	@RequestMapping("/animals")
	public List<Animal> getAnimals(){
		return service.getAnimals();
	}
	
	@RequestMapping("/animals/{id}")
	public Animal getById(@PathVariable int id){
		return service.getById(id);
	}
	
	@RequestMapping("/animals/types")
	public String getTypes(){
		return service.getTypes();
	}
	
	@RequestMapping("/animals/types/{type}")
	public List<Animal> getByType(@PathVariable String type){
		return service.getByType(type);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/animals")
	public void addAnimal(@RequestBody Animal animal){
		service.createAnimal(animal);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/animals/{id}")
	public void deleteAnimal(@PathVariable int id){
		service.deleteAnimal(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/animals")
	public void updateAnimal(@RequestBody Animal animal){
		service.updateAnimal(animal);
	}
	
	
}
