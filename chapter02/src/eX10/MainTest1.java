package eX10;
//다른 패키지의 .java 파일이라면 import해야 사용할 수 있다
import ch06.Bank;

public class MainTest1 {

	public static void main(String[] args) {
		Bank bankA = new Bank();
		// bankA.balance > 접근 불가. 다른 패키지에서 default 접근 제어
		// name 접근제어지시자는 public이기 때문에 같은 project 안이라면 어디서든지 접근 가능하다.
		bankA.name = "홍길동";
		
	}

}
