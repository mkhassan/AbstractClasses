
public class Boat extends Vehicle {
	
	private String name;
	private String Color;
	private int propeller;
	private double length;
	
	public Boat(String bname, String Color, int propel, int size) {
		this.name = bname;
		this.Color = Color;
		this.propeller = propel;
		this.length = size;
		
	}

	@Override
	public String start() {
		// TODO Auto-generated method stub
		return "the boat starts";
	}

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return "the boat stopped";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "the boat accelerate";
	}

	@Override
	public String speed(int x) {
		// TODO Auto-generated method stub
		return "the boat speed is +" + x;
	}
	
	public String floats() {
		return "the "+name+" boat is floating in a sea";
	}

}
