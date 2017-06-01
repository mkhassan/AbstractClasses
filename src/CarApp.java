
public class CarApp {

	public static void main(String[] args) {
	

	
			 
			//Vehicle v = new Vehicle();
			//print(v.start());
			//print(v.stop());
			
			Car a = new Car("porsche", "red", 4);
			
			Car b = new Car();
			
			Plane p = new Plane("boieng", "white", 8, 2);
			
			Boat bt = new Boat("canoe", "black", 2, 20);
			
			b.setName("jetta");
			b.setColor("Brown");
			b.setnTires(4);
			
			
			print(a.start());
			print(b.start());
			print(a.accelerate());
;
			print(a.stop());
			print(p.fly());
			print(bt.floats());
			
			
			
	System.out.println("the "+b.getColor()+" "+b.getName()+" just passed the "+a.getColor()+" "+a.getName()+"");
			
			
			

		}
		
		private static void print(String s) {
			System.out.println(s);
		}
		
		
		
		

		
		
		
		
		
		

	

}
