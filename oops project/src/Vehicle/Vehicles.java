package Vehicle;

public interface Vehicles {
	public double space();
}
interface Roadvehicles extends Vehicles{
	public int wheels();
	
	
}
interface Watervehicles extends Vehicles{
	public int fins();

	
}

