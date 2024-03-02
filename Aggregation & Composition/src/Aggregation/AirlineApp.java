package Aggregation;

public class AirlineApp {

	public static void main(String[] args) {
		
		Pilot p = new Pilot("Ram");
		p.fly();
		Airline ar = new Airline("Kodenest",p);
		ar.activity();
		ar = null;
		ar.activity(); //Error
		p.fly();

	}

}
