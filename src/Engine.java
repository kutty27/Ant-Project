
public class Engine {
	String type;
	String cc;
	String power;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public Engine(String type, String cc, String power) {
		super();
		this.type = type;
		this.cc = cc;
		this.power = power;
	}
	public void detailsOfEngine() {
		System.out.println("The Engine type "+this.type);
		System.out.println("The Engine cc "+this.cc);
		System.out.println("The Engine power "+this.power);
	}

}
