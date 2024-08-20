package com.example.demo;

public class Car {
	private Engine eg;
	
	
	public Car(Engine eg) {
		super();
		this.eg = eg;
	}
	public void drive() {
		eg.start();
		System.out.println("Let's ride");
	}
}
