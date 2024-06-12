
public class Car {
	
	String name;
	String color;
	double price;
	Engine e = new Engine("Diesel","200","400");
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Car(String name, String color, double price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public void detailsOfCar() {
		System.out.println("The Car name "+this.name);
		System.out.println("The Car color "+this.color);
		System.out.println("The Car price "+this.price);
	}

}
