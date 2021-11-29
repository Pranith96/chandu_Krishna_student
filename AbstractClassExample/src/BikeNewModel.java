
public abstract class BikeNewModel extends Bike {

	public void breaks() {
		System.out.println("Bike breaks");
	}

	public void tires() {
		System.out.println("Bike Tires");
	}
	
	public abstract void petrolEngine();
	
	public void seat() {
		System.out.println("Bike seat");
	}
}
