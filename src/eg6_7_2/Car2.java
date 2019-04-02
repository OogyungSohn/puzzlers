package eg6_7_2;

public class Car2 {
	String company = "ÇöÂ÷";
	String model;
	String color;
	int maxSpeed;
	
	Car2() {
		
	}
	
	Car2(String model) {
		this.model = model;
	}
	
	Car2(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
