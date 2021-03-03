package section15_InterfaceAndGenerics;

public class Car2 {

	int speed;
	int price;
	String color;

	public Car2(int speed, int price, String color) {
		this.speed = speed;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Speed: " + this.speed + " Price: " + this.price + " Color: " + this.color;
	}

}
