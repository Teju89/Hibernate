package com.jsp.Annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("lt")
/*ConfigurableBeanFactory Interface --> two constant variables --> uppercase*/
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Laptop {
	private String brand;
	private String color;
	private double price;
	
	/* dependency injection by using constructor*/
	public Laptop(@Value("DELL") String brand,@Value("black") String color,@Value("85000") double price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}


	public void programming()
	{
		System.out.println("Programming...");
	}


	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}
	
	
}
