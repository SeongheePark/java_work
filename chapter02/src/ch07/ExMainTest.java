package ch07;

public class ExMainTest {

	public static void main(String[] args) {
		Student James = new Student("James", 5000);
		Student Tomas = new Student("Tomas", 10000);
		Student Edward = new Student("Edward", 20000);

		Transport Bus = new Transport("100번버스");
		Transport Subway = new Transport("1호선 지하철");
		Transport Taxi = new Transport("카카오택시");

		James.takeBus();
		James.showInfo();

		Tomas.takeSubway();
		Tomas.showInfo();

		Edward.takeTaxi();
		Edward.showInfo();

	}

}
