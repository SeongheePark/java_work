package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		Television television = new Television();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyRobot = new ToyRobot();
		ToyCar toyCar = new ToyCar();

		RemoteController controller1 = television;
		RemoteController controller2 = refrigerator;
		RemoteController controller3 = toyRobot;
		RemoteController controller4 = toyCar;

		RemoteController[] remoteControllers = new RemoteController[4];
		remoteControllers[0] = television;
		remoteControllers[1] = refrigerator;
		remoteControllers[2] = toyRobot;
		remoteControllers[3] = toyCar;

		// 문제1
		// for문을 활용하여 전원을 전부 켜주세요
		for (int i = 0; i < remoteControllers.length; i++) {
			remoteControllers[i].turnOn(); // 컴파일 시점 (turnOn turnOff)
		}
		// index값이 3이면 자기자신의 타입을 화면에 출력해주세요
		for (int i = 0; i < remoteControllers.length; i++) {
			if (i == 3) {
				System.out.println("3번째 index 값은 toyCar 입니다");
			}
		}
		// 만약 데이터가 toyRobot 이면 멤버 변수 name 값을 출력해주세요
		for (int i = 0; i < remoteControllers.length; i++) {
			if (remoteControllers[i] instanceof ToyRobot) {
				// 업 캐스팅 상태 --> 다운 캐스팅
				System.out.println(((ToyRobot) remoteControllers[i]).name);
			}
		}
		// 문제4
		// 장난감 로봇과 냉장고에 소리 기능을 추가해달라는 요청.
		// 소리 기능 --> 인터페이스로 설계
		
	}// end of main

}// end of class
