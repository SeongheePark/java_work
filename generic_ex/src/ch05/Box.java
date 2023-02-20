package ch05;

public class Box<T> {
	private T contents;

	public Box() {
		this.contents = null;
	}
	
	public void put(T item) {
		this.contents = item;
	}
	public T take() {
		T item = this.contents;
		this.contents = null;
		return item;
	}
	public boolean isEmpty() {
		return this.contents == null;
	}
}
