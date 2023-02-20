package ch05;

public class BoxMainTest {

	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.put("안녕 반가워");
		System.out.println(box.isEmpty());
		String msg = box.take();
		System.out.println(msg);
		System.out.println(box.isEmpty());
	}

}
