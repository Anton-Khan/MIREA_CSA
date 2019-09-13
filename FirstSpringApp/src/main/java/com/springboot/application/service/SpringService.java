package com.springboot.application.service;

import java.util.ArrayList;
import java.util.Arrays;


import org.springframework.stereotype.Service;

import com.springboot.application.petshop.Animal;


@Service
public class SpringService {
	
	private ArrayList<Animal> Animals = new ArrayList<>(Arrays.asList
			(
					new Animal("CAT", 1000, 2, true, "Barsik"),
					new Animal("CAT", 2000, 1, false, "Marusia"),
					new Animal("CAT", 5000, 1, true, "Snow"),
					new Animal("DOG", 5000, 1, true, "Rex"),
					new Animal("DOG", 5000, 1, false, "Mara"),
					new Animal("CAT", 3000, 2, true, "Tom"),
					new Animal("PARROT", 10000, 10, true, "Kesha"),
					new Animal("PARROT", 15000, 20, true, "Bill")
			));
	public ArrayList<Animal> getAnimals() {
		return Animals;
	}
	
	public Animal getById(int id) {
		Animal result = new Animal();
		 for(int i=0; i<Animals.size(); i++) {
			 if(Animals.get(i).getId() == id) {
				 result = Animals.get(i);
			 }
		 }
		 return result;
	}
	
	public String getTypes() {
		return "CAT, DOG, PARROT";
	}
	
	public ArrayList<Animal> getByType(String type){
		ArrayList<Animal> result = new ArrayList<>();
		for(int i=0; i<Animals.size(); i++) {
			 if(Animals.get(i).getType().equalsIgnoreCase(type)) {
				result.add(Animals.get(i));
			 }
		 }
		return result;
	}
	
	public void createAnimal(Animal animal){
		Animals.add(animal);
	}
	
	public void deleteAnimal(int id){
		for(int i=0; i<Animals.size(); i++){
			if(id == Animals.get(i).getId()){
				Animals.remove(i);
			}
		}
	}
	
	public void updateAnimal(Animal animal){
		for(int i=0; i<Animals.size(); i++){
			if(animal.getId() == Animals.get(i).getId()){
				Animals.get(i).setSex(animal.getSex());
				Animals.get(i).setId(animal.getId());
				Animals.get(i).setName(animal.getName());
				Animals.get(i).setPrice(animal.getPrice());
				Animals.get(i).setType(animal.getType());
				Animals.get(i).setYears(animal.getYears());
			}
		}
	}
	
	
	
	

}
