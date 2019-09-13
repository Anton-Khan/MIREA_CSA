package com.springboot.application.petshop;

public class Animal {
	private String type;
	private double price;
	private int years;
	private boolean sex;
	private int id;
	private String name;
	
	public Animal() {
		setId((int)(Math.random()*100000));
	}
	public Animal(String type, double price, int years, boolean sex, String name) {
		setId((int)(Math.random()*100000));
		setType(type);
		setPrice(price);
		setYears(years);
		setSex(sex);
		setName(name);
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public boolean getSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
