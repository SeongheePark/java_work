package ch01;

public class Car {
	private Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
		
	}
	public void start() {
		engine.start(); //NullPoint 
		System.out.println("Car started");
	} 
}
