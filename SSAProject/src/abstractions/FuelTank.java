package abstractions;

public class FuelTank implements VehicleInterface {

	@Override
	public void loadFuel(int gallons) {
		System.out.println("Loading " + gallons + " gallons into the Fuel Tank");

	}//loadFuel

}//class
