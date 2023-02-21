package ex06;

public interface Movable {
	public abstract void left();
	public abstract void right();
	public abstract void up();
	//default 문법 사용해보기
	//후크메서드 (구현부만 있고 로직은 없다. movable 구현하는 클래스에서 필요하다면 재정의해서 사용하면된다)
	default public void down() {};
}
