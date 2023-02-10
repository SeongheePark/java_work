package ch12;

// 강제성 : 추상 메서드를 포함하고 있는 클래스는 
public abstract class Animal {
	// 추상 클래스란? (abstract class)
	// 하나 이상의 추상 메서드를 포함하거나, abstract 키워드를 가진 클래스

	// 일반 메서드,함수
	public void move() {
		System.out.println("동물이 움직입니다.");
	}

	// 추상 메서드
	public abstract void hunt();
}
