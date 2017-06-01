
public class Plane extends Vehicle {
	
	private String name;
	private String Color;
	private int numTires;
	private int numEngines;
	
	
	public Plane(String Name, String pColor, int tires, int engines) {
		this.name = Name;
		this.Color = pColor;
		this.numTires = tires;
		this.numEngines = engines;
	}

	@Override
	public String start() {
		// TODO Auto-generated method stub
		return "The "+name+" starts" ;
	}

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return "The "+name+" stops";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "The "+name+" accelerate";
	}

	@Override
	public String speed(int x) {
		// TODO Auto-generated method stub
		return "The "+name+" is speeding at" + x;
	}
	
	public String fly(){
		return "The "+name+" flys";
	}

}
