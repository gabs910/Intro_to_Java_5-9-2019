package abstractions;

public class Train extends Vehicle {

	@Override
	public void move(int miles) {

			System.out.println("moving the Train " + miles + " miles");
	}

	@Override
	public void loadFuel(int gallons) {
		System.out.println("Loading " + gallons + " gallons into the Train");
		
	}

}
