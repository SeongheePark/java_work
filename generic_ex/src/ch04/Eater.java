package ch04;

public class Eater<T extends Animal> {
	private T animal;
	public T getAnimal() {
		return animal;
	}
	public void setAnimal(T animal) {
		this.animal = animal;
	}
}
